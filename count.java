// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        int count=0;
        int num=13;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int  n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("enter element:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            System.out.println(array[i]);
            if(array[i]-num<2){
                count++;
            }
    }
    System.out.println();
    System.out.println("Count is"+count);
}
}
