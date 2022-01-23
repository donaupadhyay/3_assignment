
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
public class Q1 {
       public static void main(String args[]){
   int temp;
  Scanner x=new Scanner(System.in);
        System.out.print("Enter the Size of array:");
    int n;
        n=x.nextInt();
        int arr[]=new int[n]; 
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
   for(int i=0;i<n;i++ ){
      for(int j=i+1;j<n;j++){
         if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
         }
      }
   }
   System.out.println("Third largest number is:: "+arr[n-3]);
   }
}
