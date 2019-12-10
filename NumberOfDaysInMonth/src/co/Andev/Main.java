package co.Andev;

public class Main {

    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);

        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
    }

    public static boolean isLeapYear(int year) {

        int year1 = year % 4;
        int year2 = year % 100;
        int year3 = year % 400;
        if (year <= 1 || year > 9999) {
            System.out.println("false");
            return false;
        } else if (year1 == 0 && year2 != 0) {
            System.out.println("true");
            return true;
        } else if (year3 == 0) {
            System.out.println("return true");
            return true;
        } else {
            System.out.println(" false ");
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;

        }


        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    System.out.println("29 days in February on a leap year");
                    return 29;
                } else {
                    System.out.println("regular");
                    return 28;
                }

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:

                if (isLeapYear(year) || !isLeapYear(year)) {
                    System.out.println("31 day months");
                    return 31;
                }

            case 4: case 6: case 9: case 11:
                if (isLeapYear(year) || !isLeapYear(year) && month == 4) {
                    System.out.println("30");
                    return 30;
                }

            default:
                System.out.println("Not a leap year");
                return -1;

        }
    }
}

//case 1:
//                if (isLeapYear(year) && month == 1) {
//                    System.out.println("31 days in January on a leap year");
//                    return 31;
//
//                }
//            case 2:
//                if (isLeapYear(year) && month == 2) {
//                    System.out.println("29 days in February on a leap year");
//                    return 29;
//                } else {
//                    System.out.println("regular");
//                    return 28;
//                }
//            case 3:
//                if (isLeapYear(year) || !isLeapYear(year) && month == 3) {
//                    System.out.println("31");
//                    return 31;
//                }
//            case 4:
//                if (isLeapYear(year) || !isLeapYear(year) && month == 4) {
//                    System.out.println("31");
//                    return 30;
//                }
//            case 5:
//                if (isLeapYear(year) || !isLeapYear(year) && month == 5) {
//                    System.out.println("31");
//                    return 31;
//                }
//            case 6:
//                if (isLeapYear(year) || !isLeapYear(year) && month == 6) {
//                    System.out.println("31");
//                    return 30;
//                }
//            case 7:
//                if (isLeapYear(year) || !isLeapYear(year) && month == 7) {
//                    System.out.println("31");
//                    return 31;
//                }
//            case 8:
//                if (isLeapYear(year) || !isLeapYear(year) && month == 8) {
//                    System.out.println("31");
//                    return 31;
//                }
//            case 9:
//                if (isLeapYear(year) || !isLeapYear(year) && month == 9) {
//                    System.out.println("31");
//                    return 30;
//                }
//            case 10:
//                if (isLeapYear(year) || !isLeapYear(year) && month == 10) {
//                    System.out.println("31");
//                    return 31;
//                }
//            case 11:
//                if (isLeapYear(year) || !isLeapYear(year) && month == 11) {
//                    System.out.println("31");
//                    return 30;
//                }
//            case 12:
//                if (isLeapYear(year) || !isLeapYear(year) && month == 12) {
//                    System.out.println("31");
//                    return 31;
//                }
//
//            default:
//                System.out.println("Not a leap year");
//                return -1;
//        }