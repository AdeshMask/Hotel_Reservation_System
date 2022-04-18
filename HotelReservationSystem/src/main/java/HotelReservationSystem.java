import java.util.Scanner;

public class HotelReservationSystem {
    public Scanner scanner = new Scanner(System.in);
    public static int week_Day_Regualr_Rates;
    static int week_Day_Rewards_Rates;
    static int week_End_Regular_Rates;
    static int week_End_Rewards_Rates;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotels hotels = new Hotels();
        System.out.println("Welcome to hotel reservation system:");
        System.out.println("Select your Hotel"+"\n1 Lakewood \n2 Bridgewood \n3 ridgewood");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                hotels.lakeWood();
                break;
            case 2:

                break;
            case 3:
                System.out.println("Welcome to lakeWood hotel:");
                System.out.println("Enter Customer type: ");
                int ch2 = scanner.nextInt();
                if (ch2 == 1){
                    week_Day_Regualr_Rates = 220;
                    week_Day_Rewards_Rates = 100;
                    hotels.regularRates(week_Day_Regualr_Rates,week_Day_Rewards_Rates);
                }
                else {
                    week_End_Regular_Rates = 150;
                    week_End_Rewards_Rates = 40;
                    hotels.rewardsrates(week_End_Regular_Rates, week_End_Rewards_Rates);
                }
                break;
            default:
                System.out.println("Invalid choice....");
        }
    }
}
