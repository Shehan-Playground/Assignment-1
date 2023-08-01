public class Q6_task_c {
    public static void main (String[] args) {

        final String COLOR = "\033[3";
        final String RESET = "\033[0m";
        final String BOLD = "\033[1m";

        String city1 = "Los Angeles";
        String city2 = "New York";

        String state1 = "Californea";
        String state2 = "New York";

        int population1 = 3966936;
        int population2 = 8336817;

        System.out.printf("%s1m",COLOR);

        final String REPEAT = String.format("-".repeat(15));

        final String TABLEFORMAT = String.format("+%1$s+%1$s+%1$s\n",REPEAT);
        // System.out.print("+");
        // System.out.print("-".repeat(15));
        // System.out.print("+");
        // System.out.print("-".repeat(15));
        // System.out.print("+");
        // System.out.print("-".repeat(15));
        // System.out.println("+");

        System.out.printf("%7$s|%3$s %2$s%4$-14s%3$s%1$s1m|%3$s %2$s%5$-14s%3$s%1$s1m|%3$s %2$s%6$-14s%3$s%1$s1m|\n",COLOR,BOLD,RESET,"CITY","STATE","POPULATION",TABLEFORMAT);

        // System.out.print("+");
        // System.out.print("-".repeat(15));
        // System.out.print("+");
        // System.out.print("-".repeat(15));
        // System.out.print("+");
        // System.out.print("-".repeat(15));
        // System.out.println("+");

        System.out.printf("%7$s|%3$s %4$-14s%1$s1m| %3$s%5$-14s%1$s1m| %1$s5m%6$-,14d%1$s1m|\n",COLOR,BOLD,RESET,city1,state1,population1,TABLEFORMAT);

        System.out.printf("|%3$s %4$-14s%1$s1m| %3$s%5$-14s%1$s1m| %1$s5m%6$-,14d%1$s1m|\n",COLOR,BOLD,RESET,city2,state2,population2);

        System.out.println(TABLEFORMAT);
        
        // System.out.print("+");
        // System.out.print("-".repeat(15));
        // System.out.print("+");
        // System.out.print("-".repeat(15));
        // System.out.print("+");
        // System.out.print("-".repeat(15));
        // System.out.println("+");
    }
}
