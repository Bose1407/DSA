package Arrays;

public class MoveZeros {
    static void movezeros(int[]array){

        int j = 0;

        for(int i=0 ; i< array.length;i++){
            
            if(array[i]!=0 && array[j]==0){

                int temp = array[i];

                array[i] = array[j];

                array[j] = temp;                      // 1,2,0,3,0,4,0,5
            }

            if(array[j]!=0){

                j++;
            }
        }
        
        for (int values : array) {

            System.out.print(values + " ");

        }

    }
    public static void main(String[] args) {

        int [] array = { 1,2,0,3,0,4,0,5};

        movezeros(array);

    }
}
