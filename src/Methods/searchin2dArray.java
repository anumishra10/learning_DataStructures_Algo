package Methods;

import java.util.Arrays;

public class searchin2dArray {
    public static void main(String[] args){
    int[][] arr = {{1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}};

    int target = 7;
    int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
//                let's assume that arr is not an empty array
                if ( arr[row][col] == target){
                    return new int[]{row,col};

                }
            }
        }
        return new int[]{-1,-1};


    }
}
