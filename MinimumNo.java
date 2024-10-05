package Arrays;

public class MinimumNo {

    static void findMin(int [] arr){

        int min = arr[0];

        for(int i = 1 ; i<arr.length;i++){

            if(arr[i]<min){

                min = arr[i];

            }

        }

        System.out.println("The minimum value present in the array is : "+min);

    }
    public static void main(String[] args) {

        int [] array = {1,56,3,10,89,31};

        findMin(array);

    }
}
