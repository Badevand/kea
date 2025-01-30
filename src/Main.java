import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    private static ArrayList<Trip> trips = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Create trip");
            System.out.println("2. List trip");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    createTrip();
                    break;
                case 2:
                    listTrips();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (choice != 3);
    }

    public static void createTrip()
    {
        System.out.println("Choose the type of trip:");
        System.out.println("1. Beach trip");
        System.out.println("2. Ski trip");
        int tripChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter duration in days: ");
        int duration = scanner.nextInt();
        System.out.println("Enter number of travelers: ");
        int travelers = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter destination country: ");
        String country = scanner.nextLine();
        System.out.println("Enter transportation method: ");
        String transportation = scanner.nextLine();

        if (tripChoice == 1)
        {
            System.out.println("Enter beach type (e.g., sandy, rocky): ");
            String beachType = scanner.nextLine();


            System.out.println("Is snorkeling available?");
            System.out.println("1: yes");
            System.out.println("2: no");
            int snorkelingChoice = scanner.nextInt();
            boolean hasSnorkeling = (snorkelingChoice == 1);


            System.out.println("Is surfing available?");
            System.out.println("1: yes");
            System.out.println("2: no");
            int surfingChoice = scanner.nextInt();
            boolean hasSurfing = (surfingChoice == 1);
            scanner.nextLine();


            trips.add(new BeachTrip(duration, travelers, country, transportation, beachType, hasSnorkeling, hasSurfing));
            System.out.println("Beach trip created!");

        } else if (tripChoice == 2)
        {
            System.out.println("Enter ski resort name: ");
            String skiResort = scanner.nextLine();


            System.out.println("Is ski rental available?");
            System.out.println("1: yes");
            System.out.println("2: no");
            int skiRentalChoice = scanner.nextInt();
            boolean hasSkiRental = (skiRentalChoice == 1);


            System.out.println("Is snowboarding available?");
            System.out.println("1: yes");
            System.out.println("2: no");
            int snowboardingChoice = scanner.nextInt();
            boolean hasSnowboarding = (snowboardingChoice == 1);
            scanner.nextLine();


            System.out.println("Enter difficulty level (beginner, intermediate, expert): ");
            String difficultyLevel = scanner.nextLine();


            trips.add(new SkiTrip(hasSkiRental, hasSnowboarding, difficultyLevel, duration, travelers, country, transportation, skiResort));
            System.out.println("Ski trip created!");

        } else
        {
            System.out.println("Invalid option, please try again.");
        }
    }

    public static void listTrips()
    {
        if (trips.isEmpty())
        {
            System.out.println("No trips available.");
        } else
        {
            System.out.println("Listing all trips:");
            for (Trip trip : trips)
            {
                trip.displayTrip();
            }
        }
    }
}
