package Methods;

public class orderAgnosticBS {
    public static void main(String[] args){
        int[] arr = {150,134,34,33,25,16,10,8,};
        int target = 25;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[end]>arr[start];

        while(start<=end){
            int mid= start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]){
                    end=mid-1;
                } else if (target>arr[mid]) {
                    start= mid+1;
                }
            }else{
                if (target > arr[mid]){
                    end=mid-1;
                } else if (target< arr[mid]) {
                    start= mid+1;
                }
            }



        }
        return -1;
    }

}
