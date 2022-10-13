public class Part2 {
    public static void main(String[] args) {


        int firstDeposit = 15000;
        int monthNumber = 1;
        while (firstDeposit <= 12_000_000) {
            firstDeposit *= 1.07;
            System.out.printf("месяц %d, сумма %d \n", monthNumber, firstDeposit);
            monthNumber++;
        }


        System.out.println("Task Number 2\n");

        int deposit = 15000;
        for (int i = 1; deposit <= 12_000_000; i++) {
            deposit *= 1.07;
            if (i % 6 == 0) {
                System.out.printf("месяц %d, сумма %d \n", i, deposit);

            }

        }
        System.out.println("Task Number 3");

        int initialAmmount = 15000;
        for (int k = 1; k < 9; k += 6) {
            int sumBefore= initialAmmount;
            initialAmmount *= 1.07* 6;
            System.out.printf("сумма накоплений %d , месяц %d \n", k, initialAmmount);
        }
        System.out.println("Task Number 4\n");

        int firstFriday = 3;
        for (int currentFriday = firstFriday; currentFriday <=31; currentFriday += 7) {
            System.out.println("Сегодня пятница, "+ currentFriday + "ое число  " + "необходимо подготовить отчет");
        }
    }
}
