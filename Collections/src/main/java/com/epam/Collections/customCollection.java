package com.epam.Collections;

import java.util.Arrays;
import java.util.*;
class customCollection<T> {
   private static final int INITIAL_CAPACITY = 10;
   private int size = 0;
   private Object data[] = {};
   
   public customCollection() {
      data = new Object[INITIAL_CAPACITY];
   }
   
   public int add(T e) {
      if (size == data.length) {
        ensureCapacity(); 
      }
      data[size++] = e;
	return size;
   }
    @SuppressWarnings("unchecked")
   public T get(int index) {
       if (index < 0 || index >= size) {
         throw new IndexOutOfBoundsException("Index: " + index + ", Size "+ index);
       }
      return (T) data[index]; 
   }
   public Object remove(int index) {
      if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size "+ index);
      }
      Object removedElement = data[index];
      for (int i = index; i < size - 1; i++) {
        data[i] = data[i + 1];
      }
      size--; 
      return removedElement;
   }
 
   private void ensureCapacity() {
      int newIncreasedCapacity = data.length * 2;
      data = Arrays.copyOf(data, newIncreasedCapacity);
   }
   
   public void display() {
      System.out.print("Displaying list : ");
      for (int i = 0; i < size; i++) {
        System.out.print(data[i] + " ");
      }
   }
}