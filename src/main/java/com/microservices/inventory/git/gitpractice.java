package com.microservices.inventory.git;

public class gitpractice {


    public static int mult(int a1 , int a2)
    {
        return a1*a2;
    }
    public static int div(int a1 , int a2) {
        return a1 / a2;
    }

    public static int sum(int a1, int a2)
    {
        return a1+a2;
    }
    public static int sub(int a1, int a2)
    {
        return a1-a2;

    }
    public  static void main(String[]args)
    {

        System.out.println("Hey I am added again");
        int a=2;
        int b=3;

        int sum=a+b;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(mult(a,b));
        System.out.println(div(a,b));




        System.out.println(sum(a,b));
        System.out.println(sub(a,b));
        System.out.println(a*b);
        System.out.println(a/b);

        System.out.print("hello this is message from main");


        System.out.println("Hey This is from main branch");
        System.out.println("Hey main How are you? I am bug");




    }


}
