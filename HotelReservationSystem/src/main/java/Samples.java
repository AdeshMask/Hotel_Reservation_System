//import java.util.Calendar;
//import java.util.Date;
//
//public class Samples {
//
//    Date date = new Date(2020,9,10);
//    Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
//    int day = cal.get(Calendar.DAY_OF_WEEK);
//        if(day == Calendar.SATURDAY || day == Calendar.SUNDAY){
//        System.out.println(true);
//    }
//        else {
//        System.out.println(false);
//        System.out.println("Rate for the Regular custome on Weekend are: " + rate2);
//    }
//}
/////////////////////////////////////////////////////////////////////////////
//24-May-2017, change this to your desired Start Date
//	LocalDate dateBefore = LocalDate.of(2017, Month.MAY, 24);
//            //29-July-2017, change this to your desired End Date
//            LocalDate dateAfter = LocalDate.of(2017, Month.JULY, 29);
//            long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
//            System.out.println(noOfDaysBetween);