
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
// Name:-Dona Upadhyay
public class Q2 {
    public static void main(String args[]){  
Scanner x=new Scanner(System.in);
        System.out.print("Enter the Size of array:");
    int n;
        n=x.nextInt();
        int arr[]=new int[n]; 
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
System.out.println("Odd Numbers:");  
for(int i=0;i<n;i++){  
if(arr[i]%2!=0){  
System.out.println(arr[i]);  
}  
}  
System.out.println("Even Numbers:");  
for(int i=0;i<n;i++){  
if(arr[i]%2==0){  
System.out.println(arr[i]);  
}  
}  
}
}
