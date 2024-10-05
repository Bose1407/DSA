package Arrays;

import java.util.Scanner;

public class Array{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows :");

        int rows = sc.nextInt();

        System.out.println("Enter the number of columns :");

        int col = sc.nextInt();

        int [] [] arr = new int[rows] [col];

        for(int i = 0 ; i < rows ; i++){

            for(int j = 0 ; j < col ; j++){

                System.out.print("Enter the no for index "+i+","+j+" :");

                arr[i][j] = sc.nextInt();

            }
        }
        print_array(arr);

    }
    static void print_array(int[][]arr){

        for(int i = 0 ; i < arr.length ; i ++){
            
            for(int j = 0 ; j < arr[i].length ; j++){

                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}