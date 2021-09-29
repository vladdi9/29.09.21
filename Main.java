package org.itstep;

public class Main {

    public static void main(String[] args) {
        printH();
        echo("sbs");
        System.out.println(cCa(2));
        System.out.println(cTA(2,3));
        System.out.println(isOdd(5));
        System.out.println(max(3,5));
        int a=1;
        int b=2;
        swap(a,b);
        System.out.println(a+" "+b);
        System.out.println(sum(2,3));
        System.out.println(sum(2.1,3.1));
        System.out.println(sum("2","3"));
        System.out.println(sum(4,5,3,1));
            }
        static void printH(){
            System.out.println("hallo");
        }
        static void echo(String s){
            System.out.println(s);
        }
        //метод с одним входом и одним выходом
    static double cCa(double r){
        double area = Math.PI*r*r;
        return area;
    }
    static double cTA(double a, double b){
        double area = (a*b)/2;
        return area;
    }
    //определить, является ли число нечетным
    static boolean isOdd(int n){
        if (n%2 == 0)
           // System.out.println(false);
            return false;
        else return true;
    }
    //определить максимальное из двух чисел
    static int max(int a, int b){
        if (a>b) return a;
        else return b;
    }
    //переставить два числа
    static void swap(int a, int b){
        int t=a;
        a=b;
        b=t;
    }
    static int[] swap2(int a, int b){
        int t=a;
        a=b;
        b=t;
        int[] result=new int[2];
        result[0]=a;
        result[1]=b;
        return result;
    }
    //Перегрузка методов (overloading)
    static int sum (int a, int b){
        return a+b;
    }
    static double sum (double a, double b){
        return a+b;
    }
    static String sum (String a, String b){
        return a+b;
    }
    static int sum (int ...args){
        //безразмерный массив
        int result=0;
        for(int arr:args)
            result+=arr;
            return result;
    }
}
