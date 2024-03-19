/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge_2arraylist;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author BIT
 */
public class Merge_2arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int m= sc.nextInt(),i,j;
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
        
        arr3.size();
        
        int k= sc.nextInt();
        for(i=0;i<arr3.size();i++){
        
        
        }
        if (arr3.contains(k))
            System.out.println(" given element is present in array list");
        else
            System.out.println("given element is not present in array list");
        
        
    }
    
}
