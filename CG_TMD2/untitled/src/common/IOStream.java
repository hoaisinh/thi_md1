package common;


import model.BenhAn;
import model.BenhAnThuong;
import model.BenhAnVIP;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IOStream {
    private final static String PATH = "src/data/medical_records.csv";

    public static List<BenhAn> listBenhANFromFile(){
        List<BenhAn> list = new ArrayList<>();
        try(
                FileReader fileReader = new FileReader(PATH);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                ) {
                String temp;
                String[] arrData;
                while ((temp = bufferedReader.readLine()) != null){
                    arrData = temp.split(",");
                    if(arrData.length <= 8){
                        list.add(new BenhAnThuong(Integer.parseInt(arrData[0]), arrData[1],arrData[2], arrData[3],arrData[4],arrData[5],arrData[6],Integer.parseInt(arrData[7])));
                    }else {
                        list.add(new BenhAnVIP(Integer.parseInt(arrData[0]), arrData[1],arrData[2], arrData[3],arrData[4],arrData[5],arrData[6],arrData[7],arrData[8]));
                    }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static  void updateListBenhAn(List<BenhAn> BenhAns){
        try(
                FileWriter fileWriter = new FileWriter(PATH);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        ){
            for (BenhAn benhAn:BenhAns){
                bufferedWriter.write(benhAn.BenhAnToString());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    public static Integer maxID(){
//        List<Student> students = listStudentFromFile();
//        int maxID = 1;
//        for(Student student : students){
//            if(student.getId() > maxID){
//                maxID = student.getId();
//            }
//        }
//        return maxID;
//    }
//    public static void addStudentToFile(Student student){
//        try(
//                FileWriter fileWriter = new FileWriter(PATH,true);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//                ){
//                bufferedWriter.write(student.studentDataToString());
//                bufferedWriter.newLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public static  void updateListStudent(List<Student> students){
//        try(
//                FileWriter fileWriter = new FileWriter(PATH);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//        ){
//            for (Student student:students){
//                bufferedWriter.write(student.studentDataToString());
//                bufferedWriter.newLine();
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
