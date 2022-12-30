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
    Factorial k_factorial = new Factorial(positionsNumber);
    Factorial num_formula = new Factorial(positionsNumber+elementsNumber-1);
    Factorial den_formula = new Factorial(elementsNumber-1);

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

    public long withoutRepWithoutOrder(int elementsNumber, int positionsNumber){ //method 3
        num_factorial.setNumber(elementsNumber);
        den_factorial.setNumber(positionsNumber);
        long fact_result = num_factorial.factorial_calc(elementsNumber)/(k_factorial.factorial_calc(positionsNumber)*den_factorial.factorial_calc(elementsNumber-positionsNumber));
        return  fact_result;
    }

    public long withRepWithoutOrder(int elementsNumber, int positionsNumber){ //method 4
        num_factorial.setNumber(elementsNumber);
        den_factorial.setNumber(positionsNumber);
        long fact_result = num_formula.factorial_calc(positionsNumber+elementsNumber-1)/(k_factorial.factorial_calc(positionsNumber)*den_formula.factorial_calc(elementsNumber-1));
        return  fact_result;
    }

    public int getWithoutRep() {return (int) withoutRep(elementsNumber, positionsNumber); }
    public int getWithRep() {return withRep(elementsNumber, positionsNumber); }
    public int getWithoutRepWithoutOrder() {return (int) withoutRepWithoutOrder(elementsNumber, positionsNumber); }
    public int getWithRepWithoutOrder() {return (int) withRepWithoutOrder(elementsNumber, positionsNumber); }
    /*
    public int getElementsNumber(){
        return elementsNumber;
    }
    public int getPositionsNumber(){
        return positionsNumber;
    }
    */
    public void setElementsNumber(int elementsNumber){
        this.elementsNumber = elementsNumber;
    }
    public void setPositionsNumber(int positionsNumber){
        this.positionsNumber = positionsNumber;
    }

}
