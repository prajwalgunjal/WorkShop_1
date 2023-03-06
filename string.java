package com.bridgelabz;

public class string {
    static int a=10; // static
    // when


    public static void main(String[] args) {
        int a;//public
        string prajwal = new string();
        String str= "Hello welcome to java world ";
        int count1=0;
        int count2=0;
        // here we are finding number of characters present in the string.
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ' ')
            {
                count2++;
            }
            else {
                count1++;
            }
        }
        System.out.println("number of charaters are present in the string is "+count1);

     // here we are finiding number of words which are present in the given string
        System.out.println("number of words in the string is "+count2);
    }
}