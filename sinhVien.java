    package model;

import java.sql.SQLOutput;
            import java.util.Scanner;

public class Sinhvien{
    private  String nameFull ;
    // private là khả năng truy cập riêng tư, string là kieu du lieu nameFull la thuoc tinh
    private String date;
    private String Masinhvien ;

    public void setnameFull(String name){
      this.nameFull = name;


        // this.nameFUll la thuoc tinh khai báo còn name là giá trị truyền vào từ bàn phím

    }
    public String getnameFull(){

        return nameFull;
    }
    public String getage(){
        //get la lay tu thuoc tinh date
        //this.date la thuoc tinh khai bao con ngaya la gia tri truyen vao tu ban phim

        return date;
    }
    public void setage(String ngay){// set la thaydoi  tu thuoc tinh date

        this.date=ngay;
    }
    public void setMasinhvien(String masinhvien){

        this.Masinhvien=masinhvien;
    }
    public String getMasinhvien() {

        return Masinhvien;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tensinhvien= sc.nextLine();
        Sinhvien a = new Sinhvien();
        a.setnameFull(tensinhvien);
        System.out.println("ten sinh vien la:"+a.getnameFull());
        Scanner msv=new Scanner(System.in);
        String masinhvien= msv.nextLine();
        a.setMasinhvien(masinhvien);
        System.out.println("ma sinh vien la:"+a.getMasinhvien());
    }
}

