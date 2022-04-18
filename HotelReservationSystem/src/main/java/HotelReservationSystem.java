import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
    public Scanner scanner = new Scanner(System.in);
    static List<HotelData> hotelsList = new ArrayList<HotelData>();
    public static int week_Day_Regualr_Rates;
    static int week_Day_Rewards_Rates;
    static int week_End_Regular_Rates;
    static int week_End_Rewards_Rates;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotels hotels = new Hotels();
        System.out.println("\nWelcome to hotel reservation system:");
        addHotels();
    }

    private static void addHotels() {
        HotelData hotel1 = new HotelData("Lakewood",110);
        hotelsList.add(hotel1);
        HotelData hotel2 = new HotelData("Bridgewood",160);
        hotelsList.add(hotel2);
        HotelData hotel3 = new HotelData("Ridgewood",220);
        hotelsList.add(hotel3);
        getList();
    }
    private static void getList() {
        System.out.println(hotelsList.toString());
    }
}
