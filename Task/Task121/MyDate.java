package Task121;

public class MyDate {
    public static void main(String[] args) {

        int true = 10;

        DateTask date1 = new DateTask();
        DateTask date2 = new DateTask();
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        // display leapyears
        
        date1.setMonth(1);
        date1.setDay(1);
        date1.setYear(1978);
       
        date2.setMonth(9);
        date2.setDay(21);
        date2.setYear(1984);

        System.out.println("Date 1: " + date1.toString());
        System.out.println("Date 2: " + date2.toString());

        DateTask.leapYears();
       
    }
}