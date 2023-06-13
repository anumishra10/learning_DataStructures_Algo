package com.anu;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Enter first number");
//        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//
//        System.out.println("Enter second number");
//
//        int num2 = input.nextInt();
//
//        System.out.println(num1 + num2);


        public static void main(String[] args) {
            System.out.println("Please enter a fruit name");
            Scanner input = new Scanner(System.in);
            String fruit= input.next();

//            switch (fruit) {
//                case "Mango":
//                    System.out.println("The King of Fruits");
//                    break;
//                case "Apple":
//                    System.out.println("The sweet red fruit");
//                    break;
//                case "grapes":
//                    System.out.println("Small green fruits");
//                    break;
//                default:
//                    System.out.println("Please enter a valid response");
//
//            }

            switch (fruit) {
                case "Mango" -> System.out.println("The King of Fruits");
                case "Apple" -> System.out.println("The sweet red fruit");
                case "grapes" -> System.out.println("Small green fruits");
                default -> System.out.println("Please enter a valid response");
            }

    }
}