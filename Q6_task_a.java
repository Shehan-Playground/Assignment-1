public class Q6_task_a {
    public static void main (String[] args) {

        final String COLOR = "\033[4";
        final String RESET = "\033[0m";


        System.out.printf("%1$s1m[%3$8s5%2$s%1$s2m0%%%3$7s]%2$s",COLOR,RESET,"");
        System.out.println();


    }
    
}
