public class NextDayCalculator {

    public static boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static int maxDayinMonth(int month, int year) {
        int maxDayinMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDayinMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDayinMonth = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    maxDayinMonth = 29;
                } else {
                    maxDayinMonth = 28;
                }
                break;
        }
        return maxDayinMonth;
    }


    public static String findNextDay(int day, int month, int year){
        if (day == maxDayinMonth(month, year)){
            if (month == 12){
                day = 1;
                month = 1;
                year += 1;
            } else {
                month += 1;
                day = 1;
            }
        } else {
            day += 1;
        }
        return day+"/"+month+"/"+year;
    }
}
