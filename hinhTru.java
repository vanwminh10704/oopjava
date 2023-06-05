package model;

import java.util.Scanner;

public class hinhtru {
    private double r;
    private double h;
    public hinhtru(double bankinh, double chieucao){
        this.r=bankinh;
        this.h=chieucao;
    }
    public double  getdientichxq(){
        double sxq=2*Math.PI*r*h;
        return sxq;
    }
    public double getdienthictoanphan(){
        double stp=2*Math.PI*Math.pow(r,2)+ 2*Math.PI*r*h;
        return stp;
    }
    public double getthetich(){
        double v=Math.PI*Math.pow(r,2)*h;
        return v;
    }

    public static void main(String[] args) {
        Scanner bk=new Scanner(System.in);
        double bankinh= bk.nextDouble();
        Scanner cc= new Scanner(System.in);
        double chieucao=cc.nextDouble();
        hinhtru a= new hinhtru(bankinh,chieucao );
        double sxq= a.getdientichxq();
        double stp=a.getdienthictoanphan();
        double v=a.getthetich();
        System.out.println("dien tich xung quanh:"+sxq);
        System.out.println("dien tich toan phan:"+stp);
        System.out.println("the tich:"+v);
    }
}
