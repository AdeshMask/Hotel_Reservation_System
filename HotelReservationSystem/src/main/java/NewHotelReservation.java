import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewHotelReservation {
    static Scanner scanner = new Scanner(System.in);
    static List<HotelData> hotelList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation System: ");
        addHotels();
    }

    private static void addHotels() {
        HotelData hotel1 = new HotelData("Lakewood",110);
        hotelList.add(hotel1);
        HotelData hotel2 = new HotelData("Bridgewood",160);
        hotelList.add(hotel2);
        HotelData hotel3 = new HotelData("Ridgewood",220);
        hotelList.add(hotel3);
        getList();
    }

    private static void getList() {
        System.out.println(hotelList.toString());
    }
}
