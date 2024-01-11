package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5)); //Через рекурсію
        System.out.println(fact2(5)); //Через цикл
        fact(5); //Через рекурсію з true/false (умова)
    }
    public static int fact(int num){
        return num==1?1:num*fact(num-1);
    }
    public static int fact2 (int a){
        int sum = 1;
        for(int i = 1;i <=a;i++ ){
            sum *=i;
        }
        return sum;
    }
    private static int factorial(int n){
        if(n==1)
            return 1;
         return n * factorial(n-1);
    }
}