package com.demo.rajasekhar;

public class Assignment3 {
    
    public static void main(String[] args) {
        
        // 1. Find the prime numbers 1 to 100
        for (int a = 1; a <= 100; a++) {
            boolean isprime = true;
            if (a > 1) {
                for (int j = 2; j < a; j++) {
                    if (a % j == 0) {
                        isprime = false;
                        break;
                    }
                }
                if (isprime) System.out.print(a + " " );
            }
        }
        System.out.println("\n");
        
        // 2. Count Vowels and Consonants in a String
        String str = "Programming";
        int vowels = 0, consonants = 0;
        String lower = str.toLowerCase();
        for (int b = 0; b < lower.length(); b++) {
            char ch = lower.charAt(b);
            if ((ch >= 'a' && ch <= 'z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Input: " + str + "\n" + "Vowels: " + vowels + "\n" + "Consonants: " + consonants + "\n");
      
    }
}
