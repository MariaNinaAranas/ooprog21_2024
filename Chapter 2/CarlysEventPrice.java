import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args){
        
        System.out.println("***************************************");
        System.out.println("* Carly's makes the food that makes  *");
        System.out.println("*               it a party            *");
        System.out.println("***************************************");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of attendees: ");
        int guestCount = scanner.nextInt();
        
        final int COST_PER_PERSON = 35;
        int totalCost = COST_PER_PERSON * guestCount;
        System.out.println("Number of Attendees: " + guestCount);
        System.out.println("Cost per Person is: $35");
        System.out.println("The total cost is: $" + totalCost);
        
        if(guestCount >= 50){
            System.out.println("Is it a large event? True");
        } else {
            System.out.println("Is it a large event? False");
        }
        
    }
}
