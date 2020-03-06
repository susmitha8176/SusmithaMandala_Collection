package com.epam.Collections;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
      customCollection<Integer> list = new customCollection<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      list.add(7);
      list.add(8);
      list.add(9);
      list.add(10);
      System.out.println("Enter your choice Add,remove,get");
      String s=sc.nextLine();
      if(s.equals("Add"))
      {
        System.out.println("Enter element to add in the list");
        list.add(sc.nextInt());
        list.display(); 
      }
      else if(s.equals("remove")){
        System.out.println("Enter index to remove element in the list");
        System.out.println(list.remove(sc.nextInt()));
        list.display(); 
      }
      else if(s.equals("get")){
        System.out.println("Enter index to get element in the array");
        System.out.println(list.get(sc.nextInt()));
        list.display(); 
      }
      else{
    	  System.out.println("enter correct choice");
      }
      //list.display();   
      }
}