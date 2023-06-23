// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int flag=0;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int  n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("enter element:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            System.out.println(array[i]);
        int num=4;
        if(array[i]-num<3){
            //Syflagstem.out.println("counnt is:" +count);
            flag=1;
            
        }else{
            flag=0;
        }
        }
        count++;
        System.out.println("Count is"+count);
    }
}
