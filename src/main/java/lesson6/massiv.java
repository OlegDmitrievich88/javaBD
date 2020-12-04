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

        System.out.println(masReturnOneFore(mas1));
        System.out.println(masReturnOneFore(mas2));
        System.out.println(masReturnOneFore(mas));
    }
//    @Test
//    public void massiv(){
//        int[] mas = {1, 2, 4, 4, 2, 3, 4, 1, 7};
//        ArrayList<Integer> arr = new ArrayList<>();
//        Assert.
//    }

    public static void massRandom(int[] mas3) {
        for (int i = 0; i<= mas3.length-1; i++){
            mas3[i] = (int) (Math.random()*7);
        }
    }

    public static boolean[] masReturnOneFore(int[] mas) {
        for (int i = 0; i<mas.length; i++){
            if(mas[i] == 1 || mas[i] == 4){
                return new boolean[]{true};
            }
        }

        return new boolean[]{false};
    }

    public static Object[] masReturnNumberBeforFore(int[] mas) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = mas.length - 1; i >= 0; i--) {
           if(mas[i] != 4){
                arr.add(mas[i]);
            }else {
               break;
           }
        }
        if (arr.size() == mas.length){
           throw new RuntimeException("No number fore");
        }
        System.out.println(arr);
        return arr.toArray();
    }
}

//        for (int i = mas.length - 1; i>=0; i--){
//           // mas2[i] = mas[i];
//            System.out.println(mas[i]);





