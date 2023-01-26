package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int daysInMonth = 0;
        boolean isLeap = false;

        if (year > 0) {
            if (month >= 1 && month <= 12) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    isLeap = true;
                }
                daysInMonth = switch (month) {
                    case 2 -> isLeap ? 29 : 28;
                    case 4, 6, 9, 11 -> 30;
                    default -> 31;
                };
                System.out.println(daysInMonth);
            } else {
                System.out.println("invalid date");
            }
        } else {
            System.out.println("invalid date");
        }
    }
}
