package org.itstep;

public class Recursion {
    static int n=5;
    static int sum1=0;
    public static void main(String[] args) {
        recurse();
        recurse(5);
        n=5;
        sum();
        System.out.println(sum1);
    }
        public static void recurse(){
        //метод вызывает сам себя
            if (n==0)return;
                n--;
                recurse();
            System.out.println(n);
            System.out.println("Hi");
        }
        public static void recurse(int n){
        if (n==0)return;
            //System.out.println(n);
            recurse(n-1);
            System.out.println(n);
        }
        public static void sum(){
        if (n==0)return;
        sum1+=n;
        n--;
        sum();
    }
}
