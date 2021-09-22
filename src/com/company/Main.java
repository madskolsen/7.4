package com.company;

public class Main {


        public static boolean[] sieve (int [] primeArray){
            boolean [] c = new boolean[primeArray.length];
            for (int i = 0; i < primeArray.length; i++) {
                for (int j = 0; j < primeArray.length; j++) {
                    int divide = primeArray[i];
                    if (primeArray[j]%divide==0 && !c[j] && primeArray[j] != primeArray[i]) c[j] = true;

                }
                System.out.println("Number " + primeArray[i] + " is a prime if false: " + c[i]);
            }

            return c;
        }

        public static void main(String[] args) {

        int [] primeArray = new int [30];
        int j = 2;
            for (int i = 0; i < primeArray.length; i++) {
                primeArray[i]=j;
                j++;
            }
        sieve(primeArray);






     }
}
