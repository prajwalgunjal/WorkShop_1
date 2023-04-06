//2 types default and parameterized
package com.bridgelabz;

public class constt {
int x=10;// instance varivale
    String name ;
    int id;
    int phone;

    public constt(){
        System.out.println("this is default constructor");
    }
    public constt(int a,int b) {
        this();
        System.out.println("This is parametrized constructor");
        System.out.println(a);
        System.out.println(b);
    }

    public constt(String name, int id, int phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(phone);
    }
    public static void main(String[] args) {
        constt con = new constt(10,20);
        constt con2 = new constt("Prajwal",18,12);
        con2.display();
    }
}
