package Arrays;

//to find missing numbers within n numbers of an array ....

public class MissingNum {

    public static void main(String[] args) {

        int [] array = {5,3,4,2};

        int n = array.length+1;

        int sum_of_n_ele = (n * (n + 1))/2;

        for(int values : array){

            sum_of_n_ele -= values;
        }

        System.out.println("Missing Number From the n number is : "+sum_of_n_ele);

    }
}