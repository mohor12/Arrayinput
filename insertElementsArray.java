// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int x=sc.nextInt();
        int a[]=new int[x];
        System.out.println("enter elements:");
        for(int i=0;i<x;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        
        
        
        
    
    }
}
