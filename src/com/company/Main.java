package com.company;

public class Main {

    public static void main(String[] args) {
        String Stuno="Student No 001";
	int mk1 = 45;
    int mk2 = 45;
    int mk3 = 10;
    int total = mk1+mk2+mk3;
    int avg = total / 3;
    String grd;
    if (avg>50)
        grd="Pass";
    else
        grd ="Fail";
        System.out.println("Student No :"+Stuno);
        System.out.println("Mark 1 :"+mk1);
        System.out.println("Mark 2 :"+mk2);
        System.out.println("Mark 3 :"+mk3);
        System.out.println("Total :"+total);
        System.out.println("Average :"+avg);
        System.out.println("Grade :"+grd);
    }
}
