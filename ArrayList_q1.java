/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist_q1;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author BIT
 */
public class ArrayList_q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt(),i;
        
        ArrayList<Integer> arr1= new ArrayList<Integer> (n);   //array list declaration
         
        for(i=0;i<n;i++){
             arr1.add(i, sc.nextInt());
    }
     
        System.out.print("\narray 1 consisting of integer is : "+arr1 );
       
        System.out.printf("\nenter the element has to be inserted : ");
        int k= sc.nextInt();
        arr1.add(1,k);
        System.out.println("\nafter insertion : "+arr1);
        
        System.out.print("after deletion : ");
        arr1.remove(3);
        System.out.println("array1 after deletion : "+arr1);
        Comparator<? super Integer> ArrayList;
        
        Collections.sort(arr1);
        System.out.println("array after sorting :"+arr1);
         
    }
}