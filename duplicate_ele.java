import java.util.*;
public class duplicate_ele {
    public static void main(String[] args) {
        System.out.println("enter the size of array : ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt(),val=0,i,j;
        int [] arr= new int[n];
        System.out.println("enter the array elements : ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements are : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        //duplicate element finding code
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]==arr[j] && i != j){
                    val=1;
                    System.out.printf("\n Duplicate element are found at location %d and %d ",i,j);
                }
            }
            if(val==0)
                System.out.println("\n No duplicate element found ");

        }
    }
}
