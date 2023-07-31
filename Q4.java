public class Q4 {
    public static void main (String[] args) {

        final String COLOR = "\033[3";
        final String RESET = "\033[0m";

        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        System.out.printf("%1$s1m%3$d%2$s/%1$s2m%4$d%2$s/%1$s3m%5$d%2$s %1$s4m%6$d%2$s:%1$s5m%7$d%2$s:%1$s6m%8$d%2$s",COLOR,RESET,month,day,year,hour,minute,second);
        System.out.println();
    }
}
