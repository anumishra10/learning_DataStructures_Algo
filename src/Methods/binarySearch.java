package Methods;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int ans = BinSearch(arr, target);
        System.out.println(ans);

    }

    static int BinSearch(int[] arr, int target){
        //return the index where the target lies
        //else return -1

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            //first we will find the middle element

//        UnoptimizedCase  middleElement = (s + e)/2
            //optimized way
            int mid= start + (end - start)/2;

            if (target < arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start= mid+1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;

        }





    }

