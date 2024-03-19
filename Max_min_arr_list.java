/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max_min_arr_list;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BIT
 */
public class Max_min_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int m= sc.nextInt(),i,j;
        System.out.println("enter element you want to delete");
        int k= sc.nextInt();
        ArrayList<Integer> arr1= new ArrayList<Integer>(n);
        ArrayList<Integer> arr2= new ArrayList<Integer>(m);
        
        for(i=0;i<n;i++){
        arr1.add(i,sc.nextInt());
        }
        System.out.println("array list 1 is: "+arr1);
                
        
        for(i=0;i<m;i++){
        arr2.add(i,sc.nextInt());
        }
        System.out.println("array list 2 is : "+arr2);
        
        ArrayList<Integer> arr3= new ArrayList<Integer>();
        arr3.addAll(arr1);
        arr3.addAll(arr2);
        System.out.println("new merged array list is : "+arr3);
      
        int min= arr3.get(0);
        int max= arr3.get(0);
        
        for(i=1;i<arr3.size();i++){
            if(arr3.get(i)<min){
                min=arr3.get(i);
        }
        if(arr3.get(i)>max){
        max= arr3.get(i);
        }
        if(arr3.get(i)==k){
            arr3.remove(k);
        }
        }
        System.out.println("minimum number is :"+ min);
        System.out.println("the maximum no is :"+max);
        System.out.println("after removing entered no : "+arr3);
    }
    
     
    
}
