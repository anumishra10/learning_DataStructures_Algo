package Methods;

import java.util.Scanner;

public class marksGrade {
    public static void main(String[] args) {
        marksToGrades();

    }

    static void marksToGrades(){
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        if(marks<=40){
            System.out.println("Fail");
        }
        else if (marks>=41 && marks <=50){
                System.out.println("DD");} else if (marks>=51 && marks<=60) {
                System.out.println("CD");} else if (marks>=61 && marks<=70) {
                System.out.println("BC");}else if (marks>=71 && marks<=80) {
                System.out.println("BB");}else if (marks>=81 && marks<=90) {
                System.out.println("AB");}else if (marks>=91 && marks<=100) {
                System.out.println("AA");}






    }
}
