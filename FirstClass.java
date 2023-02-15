import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the number of a month and a year to see how many days are in that month:  ");
        int month = scnr.nextInt();
        int year = scnr.nextInt();

        getDaysInMonth(month, year);

        System.out.println("There are " + getDaysInMonth(month, year) + " days in " + month + ", " + year);

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        }
        else {
            return false;
        }
    }
        public static int getDaysInMonth(int month, int year) {
            if ((month < 1) || (month > 12)) {
                return -1;
            }
            if ((year < 1) || (year > 9999)) {
                return -1;
            }

            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    return 31;
                }
                case 2 -> {
                    if (isLeapYear(year)) {
                        return 29;
                    } else if (!isLeapYear(year)) {
                        return 28;
                    }
                }
                case 4, 6, 9, 11 -> {
                    return 30;
                }
            }
            return -1;
        }
    }

