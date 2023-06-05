package model;

import java.util.Scanner;

public class hinhchunhat {
    private double width;
    private double height;
    public hinhchunhat(double h, double w){
        width=w;
        height=h;
    }
    public double getArea(){

        return width*height;
    }
    public double getPerimester(){

        return 2*(width+height);
    }
    public void display(){
        System.out.println("chieu cao hình chữ nhật là:"+height);
        System.out.println("chieu rong hình chữ nhật là:"+width);
        System.out.println("dien tich hình chữ nhật là:"+getArea());
        System.out.println("chu vi hình chữ nhật là:"+getPerimester());
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double weight= sc.nextDouble();
        double height= sc.nextDouble();
        hinhchunhat r= new hinhchunhat(weight,height);
        r.display();


    }

}


