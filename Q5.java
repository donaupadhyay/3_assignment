/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Asus
 */
// Name:-Dona Upadhyay
public class Q5 {
    static void p(int arr[],int i,int n)
{
	if(i>=n)
		return;
	System.out.print(arr[i]+" ");
	p(arr,i+1,n);
}
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n,i;
		System.out.println("Enter your Array Size:");
		n=x.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=x.nextInt();
		}
		System.out.print("Elements:");
		p(arr,0,n);
	}
}
