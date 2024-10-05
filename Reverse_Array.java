package Arrays;

public class Reverse_Array {
    static void revArr(int[] arr,int start,int end) {

        while(start<end){
            int temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++;

            end--;
        }

    }

    static void print_arr(int[]arr){

        for(int i=0 ; i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        System.out.print("original array : ");
        
        print_arr(arr);

        System.out.println();

        System.out.print("Reversed Array : ");

        revArr(arr,0,arr.length-1);

        print_arr(arr);
    }
}
