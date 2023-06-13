package Methods;

import java.util.Scanner;

public class evenOdd {

    public static void main(String[] args) {
       evenOddd();
    }

    static void evenOddd(){
        Scanner in = new Scanner(System.in);
        int var = in.nextInt();
            if (var ==0){
                System.out.println("the number is even");
            }else if (var%2==0){
                System.out.println("the number is even");
            }else {
                System.out.println("the number is odd");
            }


    }
}
