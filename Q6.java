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
public class Q6 {
    int add(int num1,int num2)
    {
        return num1+num2;
    }
    int add(int num1,int num2,int num3)
    {
        return num1+num2+num3;
    }
    int add(int num1,int num2,int num3,int num4)
    {
        return num1+num2+num3+num4;
    }
    public static void main(String[] args) 
    {    
    	Q6 obj = new Q6();
        System.out.println("Sum of two numbers: "+obj.add(10, 20));
        System.out.println("Sum of three numbers: "+obj.add(10, 20, 30));
        System.out.println("Sum of four numbers: "+obj.add(10,20,30,40));
    }
}