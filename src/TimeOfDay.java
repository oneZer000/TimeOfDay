import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter hour of day: ");
        int hourOfDay = in.nextInt();
        String timeOfDay;
        if(hourOfDay >= 6 & hourOfDay < 10){
            timeOfDay = "Утро";
        } else if (hourOfDay >= 10 & hourOfDay < 18) {
            timeOfDay = "День";
        }else if (hourOfDay >= 18 & hourOfDay < 22) {
            timeOfDay = "Вечер";
        }else if (hourOfDay == 22 | hourOfDay == 23 | (hourOfDay >= 0 & hourOfDay < 6)) {
            timeOfDay = "Ночь";
        }else {
            timeOfDay = "Ошибка";
        }
        System.out.printf("%s", timeOfDay);
        in.close();
    }
}
