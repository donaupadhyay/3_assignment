
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
public class Q4 {
        public static void main(String[] args) 
{    
int rows,cols,sumrow,sumcol;    
 Scanner x=new Scanner(System.in);
        System.out.print("Enter the Size of array:");
    int n;
        n=x.nextInt();
        System.out.println("Enter the array:");
        int arr[][]=new int[n][n]; 
        for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                  arr[i][j]=x.nextInt(); 
             }
        } 
rows=n;    
cols=n;    
for(int i= 0;i<rows;i++){    
sumrow=0;    
for(int j=0;j<cols;j++){    
sumrow = sumrow + arr[i][j];    
}    
System.out.println("Sum of "+(i+1)+" row: "+sumrow);    
}    
for(int i=0;i<cols;i++){    
sumcol=0;    
for(int j=0;j<rows;j++){    
sumcol=sumcol+arr[j][i];    
}    
System.out.println("Sum of "+(i+1)+" column: "+sumcol);    
}    
}    
}
