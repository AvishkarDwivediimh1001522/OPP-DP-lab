import java.util.*;
public class user_def_arr {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt(),i;
        int [] arr = new int[n];
        System.out.println("enter the elements of array");
        for(i=0;i<n;i++){
             arr[i]= sc.nextInt();
        }
        System.out.println ("array elements are : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        
    }

}
