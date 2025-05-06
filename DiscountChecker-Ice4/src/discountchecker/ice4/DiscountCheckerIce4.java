package discountchecker.ice4;

import java.util.Scanner;

public class DiscountCheckerIce4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Get user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Get membership status
        System.out.print("Are you a premium member? (true/false): ");
        boolean isPremiumMember = scanner.nextBoolean(); // using true/false operations to determine if premium member 

        // Check discount eligibility using OR operator
        boolean isEligibleForDiscount = (age >= 65) || (isPremiumMember);
        // if user is 65 or older regardless of membership will be legible for discount using the OR (||) operation 

        // Display result
        if (isEligibleForDiscount) {
            System.out.println("Congratulations! You are eligible for a discount."); // if elible msg displayed 
        } else {
            System.out.println("Sorry, you are not eligible for a discount."); // if not msg displayed
        }

        scanner.close();
    }
}
