import java.util.*;
public class string_method{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.printf("enter the string you want : %s \n", str);

        // System.out.println("you entered string : "+str);
        int val = str.length();
        System.out.println("length of string is : " + val);
        System.out.println("string converted into lower case : " + str.toLowerCase());

    }
}
