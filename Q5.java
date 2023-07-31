public class Q5 {
    public static void main (String[] args){

        final String COLOR = "\033[3";
        final String RESET = "\033[0m";

        int num1 = 978;
        int num2 = 3;
        int num3 = 16;
        int num4 = 1484100;

        System.out.printf("%1$s1m%3$d%2$s-%1$s2m%4$d%2$s-%1$s3m%5$d%2$s-%1$s4m%6$d%2$s",COLOR,RESET,num1,num2,num3,num4);
        System.out.println();



    }
}
