package common;

import java.util.regex.Pattern;

public class Validation {
    public final static String REG_BIRTHDAY = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
    public final static String REG_STUDENT_CODE = "^(HV-)[0-9]{3}$";
    public final static String REG_NAME = "^(.{5,100})$";
    public final static String REG_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public static final String REG_CLASS = "^(.{2,10})$";
    public static boolean regBirthday(String birthday){
        return Pattern.matches(REG_BIRTHDAY,birthday);
    }
    public static boolean regStudentCode(String studentCode){
        return Pattern.matches(REG_STUDENT_CODE,studentCode);
    }
    public static boolean regName(String name){
        return Pattern.matches(REG_NAME,name);
    }
    public static boolean regEmail(String email){
        return Pattern.matches(REG_EMAIL,email);
    }
    public static boolean regClass(String className){
        return Pattern.matches(REG_CLASS,className);
    }
}
