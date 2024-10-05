package Arrays;

public class RemoveEven {

    

    int[] removeEven(int[] arr){
        int odd = 0;

        for (int values : arr) {

            if (values % 2 != 0)

                odd++;
        }
        int[] result = new int[odd];

        int idx = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {

                result[idx] = arr[i];

                idx++;
            }

        }

        return result;
    }
    public static void main(String[] args) {
        int [] arr  = {3,2,4,7,10,6,5};
        RemoveEven obj = new RemoveEven();

        int[] res = obj.removeEven(arr);
        System.out.println(res);

        
    }
}
