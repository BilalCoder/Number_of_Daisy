package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n=in.nextInt();
        if(n==8888||n<0||n>9999)
        {
            System.out.println("Invalid Input");
        }
        else{
            ArrayList<Integer> arr=new ArrayList<Integer>();
            int dig=0,rev=0;
            while(n!=0)
            {
                dig=n%10;
                rev=rev*10+dig;
                n=n/10;
            }
            while(rev!=0)
            {
                dig=rev%10;
                if(dig%2==0){
                    if(dig==8){
                        dig=0;
                    }
                    else{
                        dig=dig+2;
                    }
                }
                else{
                    if(dig==9){
                        dig=1;
                    }
                    else{
                        dig=dig+2;
                    }
                }
                arr.add(dig);
                rev=rev/10;
            }
            System.out.print("The second number is: ");
            String str="";
            for(int i=0;i<arr.size();i++)
                str=str+arr.get(i);
            int k=0;
            while(k<str.length() && str.charAt(k)=='0')
                k++;
            StringBuffer sb=new StringBuffer(str);
            sb.replace(0,k,"");
            System.out.print(sb.toString());
        }
    }
}