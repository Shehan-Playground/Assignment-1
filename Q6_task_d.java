public class Q6_task_d {
    public static void main (String[] args) {

        final String COLOR = "\033[3";
        final String RESET = "\033[0m";
        final String BOLD = "\033[1m";

        String item1 = "Apples";
        String item2 = "Oranges";

        int qty1 = 5;
        int qty2 = 10;

        float price1 = 0.99f;
        float price2 = 1.49f;

        

        final String REPEAT1 = String.format("-".repeat(10));
        final String REPEAT2 = String.format("-".repeat(7));

        final String TABLEFORMAT1 = String.format("%2$s3m+%1$s+%1$s+%3$s+\n",REPEAT1,COLOR,REPEAT2);
        final String TABLEFORMAT2 = String.format("+%2$s2m%1$s%2$s3m+%1$s+%2$s2m%4$s%2$s3m+\n",REPEAT1,COLOR,RESET,REPEAT2);

        System.out.printf("%7$s|%3$s %2$s%4$-9s%3$s%1$s3m|%3$s %2$s%5$-9s%3$s%1$s3m|%3$s %2$s%6$-6s%3$s%1$s3m|\n",COLOR,BOLD,RESET,"ITEM","QUANTITY","PRICE",TABLEFORMAT1);

        System.out.printf("%7$s|%3$s %4$-9s%1$s3m| %3$s%1$s4m%5$8d %1$s3m| %1$s2m$%1$s5m%6$-4.2f %1$s3m|\n",COLOR,BOLD,RESET,item1,qty1,price1,TABLEFORMAT2);

        System.out.printf("|%3$s %4$-9s%1$s3m| %3$s%1$s4m%5$8d %1$s3m| %1$s2m$%1$s5m%6$-4.2f %1$s3m|\n",COLOR,BOLD,RESET,item2,qty2,price2);

        System.out.println(TABLEFORMAT2);

    }
}
