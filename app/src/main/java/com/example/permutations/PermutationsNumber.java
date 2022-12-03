package com.example.permutations;

public class PermutationsNumber {

    public int elementsNumber; //declarations
    public int positionsNumber;
    public int setNumNumber;
    public int setDenNumber;

    public PermutationsNumber(int elementsNumber, int positionsNumber){ //constructor
        this.elementsNumber = elementsNumber;
        this.positionsNumber = positionsNumber;
    }

    Factorial num_factorial = new Factorial(elementsNumber);
    Factorial den_factorial = new Factorial(elementsNumber-positionsNumber);


    public long withoutRep(int elementsNumber, int positionsNumber){ //method 1
        num_factorial.setNumber(elementsNumber);
        den_factorial.setNumber(positionsNumber);
        long fact_result = num_factorial.factorial_calc(elementsNumber)/den_factorial.factorial_calc(elementsNumber-positionsNumber);
        return  fact_result;
    }

    public int withRep(int elementsNumber, int positionsNumber){ //method 2
        int pow_result = (int) Math.pow(elementsNumber, positionsNumber);
        return pow_result;
    }

    public int getWithoutRep() {return (int) withoutRep(elementsNumber, positionsNumber); }

    public int getWithRep() {return withRep(elementsNumber, positionsNumber); }

    public int getElementsNumber(){
        return elementsNumber;
    }

    public int getPositionsNumber(){
        return positionsNumber;
    }

    public void setElementsNumber(int elementsNumber){
        this.elementsNumber = elementsNumber;
    }

    public void setPositionsNumber(int positionsNumber){
        this.positionsNumber = positionsNumber;
    }

}
