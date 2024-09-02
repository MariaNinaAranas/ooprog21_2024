import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        final int HOURLY_COST = 40;
        final int EXTRA_MINUTE_COST = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n");

        System.out.print("Enter the total rental minutes: ");
        int rentalMinutes = scanner.nextInt();

        int rentalHours = rentalMinutes / 60;
        int extraMinutes = rentalMinutes % 60;

        double rentalCost;
        if (rentalMinutes < 60) {
            rentalCost = HOURLY_COST;
        } else {
            rentalCost = (rentalHours * HOURLY_COST) + (extraMinutes * EXTRA_MINUTE_COST);
        }

        System.out.println("Total Minutes Rented: " + rentalMinutes);
        System.out.println("Total Hours Rented: " + rentalHours);

        if (rentalMinutes < 60) {
            System.out.println("Additional Minutes: 0");
        } else {
            System.out.println("Additional Minutes: " + extraMinutes);
        }
        System.out.println("Total Cost: $" + rentalCost);
    }
}
