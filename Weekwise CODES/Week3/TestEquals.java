package Week3;
class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Overriding equals method to compare Date objects by day, month, and year
    public boolean equals(Object d) {
       if(d instanceof Date) {
    	   Date myd = (Date)d;
    	   return (this.day == myd.day) && (this.month == myd.month) && (this.year == myd.year);
        }
       return false;
    }
}
public class TestEquals {
    public static void main(String[] args) {
        Date date1 = new Date(10, 2, 2022);
        Date date2 = new Date(15, 6, 2023);
        Date date3 = new Date(10, 2, 2022);

        System.out.println("date1.equals(date2): " + date1.equals(date2)); 
        System.out.println("date1.equals(date3): " + date1.equals(date3)); 
    }
}


