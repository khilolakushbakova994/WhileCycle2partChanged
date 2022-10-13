public class Part1 {
    public static void main(String[] args) {
        System.out.println("Task Number 1\n");
        int amountInTheBeginning = 0;
        int monthlyInvest = 15_000;
        int i = 0;
        while (amountInTheBeginning <= 2_459_000) {
            amountInTheBeginning = amountInTheBeginning + monthlyInvest;
            amountInTheBeginning = amountInTheBeginning + amountInTheBeginning / 100;
            amountInTheBeginning++;
            i++;
            System.out.println("месяц  " + i + "  сумма общих накоплений равна  " + amountInTheBeginning);
        }

        System.out.println(" Task Number 2\n");


        int m = 1;
        while (m <= 10) {
            System.out.print(m++ + "   ");
        }
        System.out.println();
        int l;
        for (l = 10; l > 0; l--) {
            System.out.print(l + "   ");
        }

        System.out.println();
        System.out.println("Task Number 3\n");

        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int deathRate = 8 * population / 1000;
        for (int p= 1; p<=10; p++) {
            population += birthRate;
            population -= deathRate;
            System.out.printf("Год %d, численность %d\n", p, population);
        }


    }
}