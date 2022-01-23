
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
public class Q3 {
    public static void main(String args[]){     
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the Size of array:");
    int n;
        n=x.nextInt();
        System.out.println("Enter the First array:");
        int arra[][]=new int[n][n]; 
        for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                  arra[i][j]=x.nextInt(); 
             }
        }
        System.out.println("Enter the Second array:");
    int arrb[][]=new int[n][n]; 
        for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                  arrb[i][j]=x.nextInt(); 
             }
        }
int arrc[][]=new int[n][n];    
for(int i=0;i<n;i++){    
for(int j=0;j<n;j++){    
arrc[i][j]=0;      
for(int k=0;k<3;k++)      
{      
arrc[i][j]+=arra[i][k]*arrb[k][j];      
}  
System.out.print(arrc[i][j]+" ");
}
System.out.println();
}    
}
}
