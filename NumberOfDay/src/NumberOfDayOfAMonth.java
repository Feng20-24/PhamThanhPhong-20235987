import java.util.Scanner;
public class NumberOfDayOfAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int strYear = sc.nextInt();
        sc.skip("\n");
        System.out.println("Enter the month: ");
        String strMonth = sc.next();

        String strDay="";
        if (strMonth.equals("January") || strMonth.equals("Jan") || strMonth.equals("Jan.") || strMonth.equals("1")) {
            strDay = "31";
        } else if (strMonth.equals("March") || strMonth.equals("Mar") || strMonth.equals("Mar.") || strMonth.equals("3")) {
            strDay = "31";
        } else if (strMonth.equals("April") || strMonth.equals("Apr") || strMonth.equals("Apr.") || strMonth.equals("4")) {
            strDay = "30";
        } else if (strMonth.equals("May") || strMonth.equals("May") || strMonth.equals("5")) {
            strDay = "31";
        } else if (strMonth.equals("June") || strMonth.equals("Jun") || strMonth.equals("June") || strMonth.equals("6")) {
            strDay = "30";
        } else if (strMonth.equals("July") || strMonth.equals("Jul") || strMonth.equals("July") || strMonth.equals("7")) {
            strDay = "31";
        } else if (strMonth.equals("August") || strMonth.equals("Aug") || strMonth.equals("Aug.") || strMonth.equals("8")) {
            strDay = "31";
        } else if (strMonth.equals("September") || strMonth.equals("Sep") || strMonth.equals("Sept.") || strMonth.equals("9")) {
            strDay = "30";
        } else if (strMonth.equals("October") || strMonth.equals("Oct") || strMonth.equals("Oct.") || strMonth.equals("10")) {
            strDay = "31";
        } else if (strMonth.equals("November") || strMonth.equals("Nov") || strMonth.equals("Nov.") || strMonth.equals("11")) {
            strDay = "30";
        } else if (strMonth.equals("December") || strMonth.equals("Dec") || strMonth.equals("Dec.") || strMonth.equals("12")) {
            strDay = "31";
        } else if (strMonth.equals("February") || strMonth.equals("Feb") || strMonth.equals("Feb.") || strMonth.equals("2")) {
            if (strYear % 400 == 0) {
                strDay = "29";
            } else if (strYear % 100 == 0) {
                strDay = "28";
            } else if (strYear % 4 == 0) {
                strDay = "29";
            } else {
                strDay = "28";
            }
    } else System.out.println("Invalid month");
        System.out.println("The number of days of the month is:" + strDay);
    }
}
