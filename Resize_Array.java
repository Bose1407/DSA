package Arrays;

public class Resize_Array {

    static int [] resize_array(int[] arr, int capacity){

        int [] temp = new int[capacity];

        for(int i = 0 ; i< arr.length;i++){
            
            temp[i] = arr[i];
        }

        return temp;


    }
    
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};

        int [] resized_array = resize_array(array, 10);

        System.out.println("The size of the original array is : "+array.length);

        System.out.println("The size of Resized Array : "+ resized_array.length);

        for(int values : resized_array){

            System.out.print(values+" ");
        }


    }
}
