public class Q3 {
    public static void main (String[] args) {

        final String COLOR = "\033[43m";
        final String RESET = "\033[0m";

        int tele1 = 123;
        int tele2 = 456;
        int tele3 = 7890;

        System.out.printf("%s(%d)%s% d-%d",COLOR,tele1,RESET,tele2,tele3);
        System.out.println();
    }
}
