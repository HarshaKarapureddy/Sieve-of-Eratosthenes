/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Author: Harsha Karapureddy
// Program to compute all prime numbers up to a given integer using the Sieve of Eratosthenes.

import java.util.Scanner;

public class main {
    
    public static void main(String[] args){
        // Create a scanner to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to input an integer
        System.out.println("Please input an integer: ");
        int user_input = input.nextInt();
        input.close();
        
        // Create a boolean array to mark primes
        // true means the number is prime, false means it's not prime
        boolean[] if_prime = new boolean[user_input+1];
        
        // Initialize all values in the array from index 2 onwards as true
        for(int i=2; i<=user_input; i++){
            if_prime[i] = true;
        }
        
        // Sieve of Eratosthenes algorithms 
        for(int i=2; i<=user_input; i++){
            if (if_prime[i]){
                for(int j=i*i; j<=user_input; j+=i){
                    if_prime[j] = false;
                }
            }
        }
        
       // Print out all prime numbers
        System.out.println("The prime numbers are: ");
        for(int i=2; i<=user_input; i++){
            if(if_prime[i] == true){
                System.out.println(i);
            }
        }
        
    
}
}
