import java.util.*;
public class bank_statement {
    public static boolean validate(String name, int age) {
        // check if the name contains only alphabets
        if (name.matches("[A-Za-z]+")) {
            // check if the age is between 3 and 15
            if (age > 3 && age < 15) {
                // both conditions are met, return true
                return true;
            }
        }
        // either condition is not met, return false
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        String str= sc.nextLine();
        System.out.println("after checking the information");
        validate(str,age);
    }
}
