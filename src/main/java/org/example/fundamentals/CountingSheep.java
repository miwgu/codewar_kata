package org.example.fundamentals;

public class CountingSheep {
    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        int sheeps = countSheeps(array1);
        System.out.println(sheeps);

    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter =0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i]== true){
                counter++;
            }
        }
        return counter;
    }
}
