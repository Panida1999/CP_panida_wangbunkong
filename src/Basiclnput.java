import java.util.Scanner;


public class Basiclnput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you name ?: ");
        String name = scanner.nextLine();
        System.out.println("Yoor name is " + name);

        System.out.println("อายุเท่าไหร่ ?: ");
        int age = scanner.nextInt();
        System.out.println("อายุของคุณคือ" + age);


        System.out.print("Enter you nick name ?: ");
        String nickname = scanner.nextLine();
        System.out.println("Yoor nick name is " + name);

    }//main

}//Class
