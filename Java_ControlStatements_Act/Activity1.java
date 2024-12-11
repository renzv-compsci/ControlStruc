import java.util.Scanner; 

public class Activity1 {
    public static void main (String[] args) {
        
        
        System.out.println("Welcome to DaysCalc Pro \n");

        System.out.println("1. Continue"); 
        System.out.println("2. Exit\n");
        System.out.print("Enter your choice: "); 
        Scanner c1Scan = new Scanner(System.in);
        int inputC1 = c1Scan.nextInt();

        do {
            if (inputC1 == 1){
                break;
            } else if (inputC1 == 2){
                System.out.println("Thank you for using DaysCalc Pro");
                return;
            } else {
                System.out.println("Invalid input. Exiting the program....");
                return;
            }
        } while (true); 

        System.out.println("\nLets get started!");
        
        System.out.print("Enter the month number: ");
        Scanner num = new Scanner (System.in);
        int inputNum = num.nextInt();

        System.out.print("Enter the year: ");
        Scanner year = new Scanner (System.in);
        int inputYear = num.nextInt();

        if (inputNum == 1){
            System.out.println("January " + inputYear + " has 31 days");
        } else if (inputNum == 2){
            if (inputYear %4 == 0){
                System.out.println("February " + inputYear + " has 29 days. It is a leap year!");
            } else {
                System.out.println("February " + inputYear + " has 28 days");
            }
        } else if (inputNum == 3){
            System.out.println("March " + inputYear + " has 31 days");
        } else if (inputNum == 4){
            System.out.println("April " + inputYear + " has 30 days");
        } else if (inputNum == 5){
            System.out.println("May " + inputYear + " has 31 days");
        } else if (inputNum == 6){
            System.out.println("June " + inputYear + " has 30 days");
        } else if (inputNum == 7){
            System.out.println("July " + inputYear + " has 31 days");
        } else if (inputNum == 8) {
            System.out.println("August " + inputYear + " has 31 days");
        } else if (inputNum == 9){
            System.out.println("September " + inputYear + " has 30 days");
        } else if (inputNum == 10){
            System.out.println("October " + inputYear + " has 31 days");
        } else if (inputNum == 11){
            System.out.println("November " + inputYear + " has 30 days");
        } else if (inputNum == 12){
            System.out.println("December " + inputYear + " has 31 days");
        }

    }
} 