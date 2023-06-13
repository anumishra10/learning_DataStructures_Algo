package Methods;

import java.util.Scanner;

public class pythagorenTriplet {
    public static void main(String[] args) {
//        int ans = pythaTrip();
//        System.out.println(ans);
        pythaTrip();



    }

    static void pythaTrip(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        int greatest = a;
        if(b>greatest){
            greatest=b;


        } if (c>greatest) {
            greatest=c;

        }
//        return greatest;

        if (greatest * greatest == (a * a) + (b * b))
            System.out.println("the numbers are a pythagorean triplet");
        else System.out.println("the numbers are not a pyhtgorean triplet");
    }

}
