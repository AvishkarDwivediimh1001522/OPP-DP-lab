import java.util.*;
import java.util.ArrayList;

public class anagram {
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the two string");
        String str1= sc.nextLine();
        String str2= sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //compare the length of 2 string
        if(str1.length()==str2.length()){

            //convert 2 string into charecter array
            char[] charArr1 = str1.toCharArray();
            char[] charArr2 = str2.toCharArray();

            //sort the 2 charecter array
            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            //if sorted string are same then entered strings are anagram
            boolean result = Arrays.equals(charArr1,charArr2);
            if(result){
                System.out.println(str1+" and "+str2+" is anagram");

            }
            else{
                System.out.println(str1+" and "+str2+" are not anagram");
            }
        }
        else{
            System.out.println(str1+" and "+str2+" are not anagram");
        }

    }

}
