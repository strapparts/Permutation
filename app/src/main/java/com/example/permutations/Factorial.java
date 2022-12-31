package com.example.permutations;
public class Factorial {
    public long number;
    public Factorial(int number){
        this.number = number;
    }
    public long factorial_calc(int number ) {
        long fact = 1;
        for( int i = 1; i <= number; i++ ) {
            fact *= i;
        }
        return fact;
    }
    /*
    public long getNumber() {
        return number;
    }
    */
    public void setNumber(int number) {
        this.number = number;
    }
}