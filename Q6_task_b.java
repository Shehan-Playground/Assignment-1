public class Q6_task_b {
    public static void main(String[] args) {

        final String COLOR = "\033[3";
        final String RESET = "\033[0m";
        final String BOLD = "\033[1m";

        String name1 = "Alice";
        String name2 = "Bob";

        int age1 = 24;
        int age2 = 30;

        System.out.printf("%s1m+",COLOR);
        System.out.print("-".repeat(15));
        System.out.print("+");
        System.out.print("-".repeat(5));
        System.out.println("+");

        // System.out.printf("|%s",RESET);
        // System.out.printf("%1$s%3$sNAME%2$11s| AGE |\n",COLOR,"",BOLD);
        System.out.printf("| %1$s4m%3$s%2$-14s%4$s%1$s1m| %3$s%1$s4mAGE%4$s %1$s1m|\n+",COLOR,"NAME",BOLD,RESET);

        // System.out.printf("%s1m+",COLOR);
        System.out.print("-".repeat(15));
        System.out.print("+");
        System.out.print("-".repeat(5));
        System.out.println("+");

        System.out.printf("| %1$s4m%2$-14s%1$s1m| %1$s4m%3$-3d %1$s1m|\n",COLOR,name1,age1);

        System.out.printf("| %1$s4m%2$-14s%1$s1m| %1$s4m%3$-3d %1$s1m|\n+",COLOR,name2,age2);

        System.out.print("-".repeat(15));
        System.out.print("+");
        System.out.print("-".repeat(5));
        System.out.println("+");
     }
}
