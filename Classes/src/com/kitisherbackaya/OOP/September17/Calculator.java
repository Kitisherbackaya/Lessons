package com.kitisherbackaya.OOP.September17;

public class Calculator {
    public int a = 0;
    public  int b = 0;
    public int result = 0;
    public char operationSign = ' ';
    public Calculator(int operanta, int operantb){
        this.a = operanta;
        this.b = operantb;
    }
    public void deduction(){
        result = a-b;
        this.operationSign = '-';
    }
    public void addition(){
        result  = a + b;
        this.operationSign = '+';
    }
    public void multiply(){
        result = a*b;
        this.operationSign = '*';
    }
    public void divide(){
        result = a/b;
        this.operationSign = '/';
    }
    public void show(){
        System.out.println(this.a + "" + this.operationSign + "" + this.b + "=" + this.result + " " );

    }
    public int getA(){
        return this.a;
    }

    public void setA(int operandA) {
        this.a = operandA;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int operandB) {
        this.b = operandB;
    }

    public int getResult(){
        return this.result;
    }
}
