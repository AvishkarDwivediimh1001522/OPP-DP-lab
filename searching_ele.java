
import java.util.*;

public class searching_ele {
    public static int main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the size of array : ");
        int n= sc.nextInt(),i;
        int [] arr= new int[n];
        System.out.println("enter the elements of array : ");
        for(i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("array elements are : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println("\nenter any element you want for comparison : ");
        int ele = sc.nextInt();
        for(i=0;i<n;i++) {
            if (arr[i] == ele) {
                //
                ele = arr[i];
                System.out.printf("%d element present in array",ele);
            } else {
                System.out.printf("%d element is not present in array \n", arr[i]);
            }
        }
           return ele;


    }
}
