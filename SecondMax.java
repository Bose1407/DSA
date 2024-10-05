package Arrays;

public class SecondMax {

    static void find_second_max(int[] arr){

        int max = Integer.MIN_VALUE;

        int sec_max = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){

            if(arr[i]>max){

                sec_max = max;

                max = arr[i];
            }
            else if(arr[i]>sec_max && arr[i]!= max){

                sec_max = arr[i];
            }
        }
        System.out.println("The Second max element in the array is : "+sec_max);
    }
    public static void main(String[] args) {
        
        int [] array = {45,33,99,99};

        find_second_max(array);
    }
}
