public class Part3 {
    public static void main(String[] args) {


        System.out.println("Task Number 1");


        int currentYear = 2022;
        int beggining = currentYear - 200;
        int ending = currentYear + 100;
        for (int i= beggining; i < ending; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Task Number 2\n");

        int a = 1;
        int b = 2;
        while (a < 10) {
            a ++;
            System.out.println( b + "*" + a + "равно" + a*b);
        }
    }
}

