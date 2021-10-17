import com.sun.tools.internal.ws.wsdl.parser.HTTPExtensionHandler;

import java.util.Scanner;

public class Homework3 {


    public static void invertArray(){
        int[] numsOne =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i=0; i < numsOne.length; i++){
            if (numsOne[i] == 0){
                numsOne[i] = 1;
            }
            else if (numsOne[i] == 1){
                numsOne[i] = 0;
            }

            System.out.println(numsOne[i] + " ");
        }
    }

    public static void fillArray(){
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                System.out.println(arr[i] = j + 1);
            }
            break;
        }
    }

    public static void changeArray(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillDiagonal(){
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                if ((i + j) % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

                } System.out.println();
            }

        }

        public static String[] lan;
        public static void add (){
        
        }


    public static void main(String[] args) {




    }




}
