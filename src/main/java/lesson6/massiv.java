package lesson6;

import java.util.ArrayList;

public class massiv {
    public static void main(String[] args) {
        int[] mas = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] mas1 = {4,4,4,4,4,4,4};
        int[] mas2 = {2,2,2,2,2,2};
        int[] mas3 = new int[10];
        int[] mas4 = new int[10];
        int[] mas5 = new int[10];
        int[] mas6 = new int[10];
        massRandom(mas3);
        massRandom(mas4);
        massRandom(mas5);
        massRandom(mas6);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr4 = new ArrayList<>();
        masReturnNumberBeforFore(mas, arr);
        masReturnNumberBeforFore(mas3, arr1);
        masReturnNumberBeforFore(mas4, arr2);
        masReturnNumberBeforFore(mas5, arr3);
        masReturnNumberBeforFore(mas6, arr4);
        System.out.println(masReturnOneFore(mas1));
        System.out.println(masReturnOneFore(mas2));
        System.out.println(masReturnOneFore(mas));
    }

    private static void massRandom(int[] mas3) {
        for (int i = 0; i<= mas3.length-1; i++){
            mas3[i] = (int) (Math.random()*7);
        }
    }

    private static boolean masReturnOneFore(int[] mas) {
        for (int i = 0; i<mas.length; i++){
            if(mas[i] == 1 || mas[i] == 4){
                return true;
            }
        }

        return false;
    }

    private static void masReturnNumberBeforFore(int[] mas, ArrayList<Integer> arr) {

        for (int i = mas.length - 1; i >= 0; i--) {
           if(mas[i] != 4){
                arr.add(mas[i]);
            }else {
               break;
           }
        }
        System.out.println(arr);
    }
}

//        for (int i = mas.length - 1; i>=0; i--){
//           // mas2[i] = mas[i];
//            System.out.println(mas[i]);





