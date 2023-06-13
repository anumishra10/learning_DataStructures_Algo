package Methods;

public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,33,44,67,5,6};
        int target = 33;
        int ans = linearSearchh(nums, target);
        System.out.println(ans);
    }

    static int linearSearchh(int[] arr, int target){

        if (arr.length ==0){
            return -1;
        }
//        run a for loop
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if ( element == target ){
                return i;
            }
        }
        return -1;
    }


}


