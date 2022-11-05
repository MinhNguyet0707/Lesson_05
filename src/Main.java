
public class Main {
public static void main(String[] args) {

 int[] mang=NhapMang.nhapMang();
 int[] ketQua_01=Bai_01.sapXep(mang);
inMang.inMang(ketQua_01);

System.out.println("--------------");

 int ketQuaBai_04=Bai_04.timSoLuongCapSoBangNhau(mang);
 System.out.println("ket qua bai 2: "+ketQuaBai_04);
 System.out.println("--------------");
  int ketQuaBai_05=Bai_05.soLonThuHai(mang);
  System.out.println("ket qua bai 05 : "+ketQuaBai_05);
  System.out.println("--------------");
  double ketQuaBai_06=Bai_06.tinhTrungBinhCong(mang, 2, 4);
  System.out.println("ket qua bai 6 :"+ketQuaBai_06);
  System.out.println("--------------");
  Bai_07.kiemTraMangDoiXung(mang); 
  System.out.println("--------------");
  Bai_8.timSoLanXuatHienNhieuNhat(mang);
  System.out.println("--------------");
 Bai_09.inRACacSoKhacNhau(mang);
 
  Bai_10.nhapSoKhacNhau();
  System.out.println("--------------");
  Bai_14.TinhTong();
  Bai_15.TinhTongChia7();
  Bai_16.soChanLe();
  Bai_17.soNguyenToCUngNhau();
  Bai_18.delay();
  Bai_19.soLonNhatVaNhoNhat(mang);
  
  
}
}
