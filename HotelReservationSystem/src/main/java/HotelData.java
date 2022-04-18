public class HotelData {
    String hotelName;
    int rates1;

    public HotelData(String hotelName , int rates1) {
        this.hotelName = hotelName;
        this.rates1 = rates1;
    }
    public String getHotelName() {
        return hotelName;
    }
    public int getRates1() {
        return rates1;
    }

    @Override
    public String toString() {
        return "Hotel \n{ " +
                "hotelName='" + hotelName + '\'' +
                ", rates1= " + rates1 +
                '}' +"\n";
    }
}
