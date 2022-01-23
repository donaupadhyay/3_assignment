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
public class Q7_encapsulation {
   private String name;
   private String idNum;
   private int age;
   public int getAge() {
      return age;
   }
   public String getName() {
      return name;
   }
   public String getIdNum() {
      return idNum;
   }
   public void setAge( int newAge) {
      age = newAge;
   }
   public void setName(String newName) {
      name = newName;
   }
   public void setIdNum( String newId) {
      idNum = newId;
   }
   public static void main(String args[]) {
      Q7_encapsulation encap = new Q7_encapsulation();
      encap.setName("Abc");
      encap.setAge(15);
      encap.setIdNum("797425");
      System.out.print("Name : "+encap.getName()+" Age : "+encap.getAge());
   }
}