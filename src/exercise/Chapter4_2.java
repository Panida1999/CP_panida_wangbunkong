package exercise;

import java.util.Scanner;

public class Chapter4_2 {
    public static void main(String[] args) {
    //รับข้อมุล จำนวนเต็ม และจำนวนจริง สลับกัน สังเกตผลการทำงาน

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int a = Scanner.nextInt();
        System.out.println("Enter real number: ");
        double b = Scanner.nextDouble();
        System.out.println("Enter real number: ");
        double c = Scanner.nextInt();
        System.out.println("Enter real number: ");
        double d = Scanner.nextDouble(); //double
        //display
        System.out.println(a +" "+b+" "+c+" "+d);
    }
}
