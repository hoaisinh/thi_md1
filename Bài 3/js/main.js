//Class
class SoTietKiem{
    constructor(maSo,loai,hoTen,chungMinhNhanDan,ngayMo,tienGui){
        this.maSo = maSo;
        this.loai = loai;
        this.hoTen = hoTen;
        this.chungMinhNhanDan = chungMinhNhanDan;
        this.ngayMo = ngayMo;
        this.tienGui = tienGui;
    }

    getMaSo(){
        return this.maSo;
    }
    getLoai(){
        return this.loai;
    }
    getHoTen(){
        return this.hoTen;
    }
    getChungMinhNhanDan(){
        return this.chungMinhNhanDan;
    }
    getNgayMo(){
        return this.ngayMo;
    }
    getTienGui(){
        return this.tienGui;
    }

    // setID(newID){
    //     this.id = newID;
    // }
    // setName(newName){
    //    this.name = newName;
    // }
    // setDescription(newDes){
    //      this.description = newDes;
    // }
    // setOperatingSystem(newOpe){
    //      this.operatingSystem = newOpe;
    // }
    // setBatteryType(newPin){
    //     this.batteryType = newPin;
    // }
    // setPhoto(newPhoto){
    //     this.photo = newPhoto;
    // }
}
//-----------------------------------------------------SEPARATOR-----------------------------------------------------
//Function
function randInteger(min, max) {
    return Math.floor(Math.random() * (max - min + 1) ) + min;
  }
  function showProduct(elementID,productList){
    let productEle = document.getElementById(elementID);
    let showProduct = "";
   
   for(let j = 0;j< productList.length;j++){
       
        let soTietKiem = productList[j];
        let popupID = "'popup'";
        showProduct += '<div class="productList row col-12">'
        +'<div class="col-1 id">'+soTietKiem.getMaSo()+'</div>'
        +'<div class="col-2 name">'+soTietKiem.getLoai()+'</div>'
        +'<div class="col-2 description">'+soTietKiem.getHoTen()+'</div>'
        +'<div class="col-2 operating">'+soTietKiem.getChungMinhNhanDan()+'</div>'
        +'<div class="col-2 battery">'+soTietKiem.getNgayMo()+'</div>'
        +'<div class="col-2 battery">'+soTietKiem.getTienGui()+'</div>'
        +'<div class="col-1 crudHere">'
        + '<button type="" onclick="showPopup('+popupID+','+soTietKiem.getMaSo()+')"><i class="bi bi-x-circle-fill"></i></button>'
        +'</div>'
        +'</div>';
   }
   productEle.innerHTML = showProduct;
}
function getProductByID(id){
    for (let index = 0; index < productList.length; index++) {
        if(productList[index].getMaSo() == id){
            return productList[index];
        }
    }
}
function deleteProduct(productID){
    for (let index = 0; index < productList.length; index++) {
        if(productList[index].getMaSo() == productID){
            productList.splice(index,1);
        } 
    }
    hidePopup();
    showProduct('productListHere',productList);
}

function showPopup(id,productID){
   //console.log(id);
    let productName = getProductByID(productID).getMaSo();
    let htmlPopup = '<div class="col-12">Bạn có muốn xóa sổ tiết kiệm mã số '+productName
    +'</div>'
    +'<div class="col-9"></div>'
    +'<button class="col btn btn-sm btn-danger me-2" type="" onclick="deleteProduct('+productID+')">Xóa</button>'
    +'<button class="col btn btn-sm btn-secondary" type="" onclick="hidePopup()">Hủy</button>';


       let popup = document.getElementById(id);
       if(popup.classList.contains('hidePopup')){
           popup.classList.remove('hidePopup');
           popup.classList.add('showPopup');
           document.getElementById('popupContent').style.height = '80px';   
           document.getElementById('popupContent').style.padding = '16px';
           setTimeout(() => {
            document.getElementById('popupContent').innerHTML = htmlPopup;
           }, 500);
        
        
       }

}
function hidePopup(){
    if(popup.classList.contains('showPopup')){
        popup.classList.remove('showPopup');
        popup.classList.add('hidePopup');
        document.getElementById('popupContent').style.padding = '0';
        document.getElementById('popupContent').innerHTML = '';
        document.getElementById('popupContent').style.height = '0';
    }
}

function showAddPrd(){
    let showPrd = document.getElementById('addProduct');
    let editPrd = document.getElementById('editProduct');
    showPrd.style.height = 'auto';
    editPrd.style.height = '0';
}
function validateForm(form){

    let maSo = form.querySelector('#maSo').value;
    let maSoEr = form.querySelector('#maSoEr');
  
    let loai = form.querySelector('#loai').value;
    let loaiEr = form.querySelector('#loaiEr');

    let hoTen = form.querySelector('#hoTen').value;
    let hoTenEr = form.querySelector('#hoTenEr');

    let cmnd = form.querySelector('#cmnd').value;
    let cmndEr = form.querySelector('#cmndEr');
   
    let ngayMo = form.querySelector('#ngayMo').value;
    let ngayMoEr = form.querySelector('#ngayMoEr');

    let soTien = form.querySelector('#soTien').value;
    let soTienEr = form.querySelector('#soTienEr');
  
    if(maSo == ""){
        maSoEr.innerHTML = "Đây là trường bắt buộc";
        return false;
     }else{
        maSoEr.innerHTML = "";
     }

     for(let i = 0; i < productList.length; i++){
        if(productList[i].getMaSo() == maSo){
                maSoEr.innerHTML = "Mã số bị trùng";
                return false;
        }
     }

     if(loai == ""|| loai.length > 10){
        loaiEr.innerHTML = "Đây là trường bắt buộc và ít hơn 10 ký tự";
        return false;
     }else{
        loaiEr.innerHTML = "";
     }

     if(hoTen == ""|| hoTen.length > 30){
        hoTenEr.innerHTML = "Đây là trường bắt buộc và ít hơn 30 ký tự";
        return false;
     }else{
        hoTenEr.innerHTML = "";
     }

     if(cmnd == ""){
        cmndEr.innerHTML = "Đây là trường bắt buộc";
        return false;
     }else{
        cmndEr.innerHTML = "";
     }

     if(ngayMo == ""){
        ngayMoEr.innerHTML = "Đây là trường bắt buộc";
        return false;
     }else{
        ngayMoEr.innerHTML = "";
     }

     if(soTien == ""){
        soTienEr.innerHTML = "Đây là trường bắt buộc";
        return false;
     }else{
        soTienEr.innerHTML = "";
     }



     return true;
}
function addProduct(form){

    let validate = validateForm(form);
    if(!validate){
        return false;
    }

    let maSo = form.querySelector('#maSo').value;
    let loai = form.querySelector('#loai').value;
    let hoTen = form.querySelector('#hoTen').value;
    let cmnd = form.querySelector('#cmnd').value;
    let ngayMo = form.querySelector('#ngayMo').value;
    let soTien = form.querySelector('#soTien').value;

  
     let newSoTietKiem = new SoTietKiem(
        maSo,
        loai,
        hoTen,
        cmnd,
        ngayMo,
        soTien,
     )
     productList.push(newSoTietKiem);
     showProduct('productListHere',productList);
     
     maSo = form.querySelector('#maSo').value ="";
     loai = form.querySelector('#loai').value ="";
     hoTen = form.querySelector('#hoTen').value ="";
     cmnd = form.querySelector('#cmnd').value ="";
     ngayMo = form.querySelector('#ngayMo').value ="";
     soTien = form.querySelector('#soTien').value ="";
     alert('Bạn đã thêm sổ tiết kiệm mới');
     return false;
   
   
}
//-----------------------------------------------------SEPARATOR-----------------------------------------------------
  
//Create product list
let productList = Array();
let loaiTietKiem = Array('Loại 1','Loại 2','Loại 3');
let hoVaTen = Array('Nguyễn Văn B','Nguyễn Văn C','Lê Văn A','Trần văn D');
let ngayMo = Array('2024-12-5','2022-6-13','2018-2-09','2013-6-15','2012-10-06');


let operatingSystem = Array('Android','IOS');
let batteryType = Array('Type 1','Type 2','Type 3');
let productPhoto = Array('file:///D:/codeGym_ln/md1/uploads/productPhoto/phone1.jpg',
                        'file:///D:/codeGym_ln/md1/uploads/productPhoto/phone2.jpg',
                        'file:///D:/codeGym_ln/md1/uploads/productPhoto/phone3.jpg'
                        )

for(let i = 1; i<=20;i++){
    let soMoi = new SoTietKiem(
        i,
       loaiTietKiem[randInteger(0,2)],
       hoVaTen[randInteger(0,3)],
       randInteger(10000000,900000000),  
       ngayMo[randInteger(0,4)],
       randInteger(100000,9000000), 
   
    );

   productList.push(soMoi);
}
console.log(productList);
//-----------------------------------------------------SEPARATOR-----------------------------------------------------


