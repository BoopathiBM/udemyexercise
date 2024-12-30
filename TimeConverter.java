import java.util.*;

public class TimeConverter{
    public static int convertHoursToMinutes(int hours) {
        
        return hours * 60;
    }
    
    public static int convertDaysToMinutes(int days) {
        
        return days * 24 * 60;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter hours: ");
        int hours = scanner.nextInt();
        System.out.println("enter days: ");
        int days = scanner.nextInt();
        convertHoursToMinutes(hours);
        convertDaysToMinutes(days);
        int h = convertHoursToMinutes(hours);
        System.out.println(h + "min");
        int d= convertDaysToMinutes(days);
        System.out.println(d + "days");

    }
}