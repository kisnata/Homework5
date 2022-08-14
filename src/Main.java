public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void task1() {
        byte n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        for (n = 10; n > 0; n--) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private static void task2() {
        int Friday = 5;
        int daysWeek = 7;
        int daysMonth = 31;
        for (int n = 1; n <= daysMonth; n++) {
            if (n == Friday) {
                System.out.println("Сегодня пятница, " + n + "-е число. Необходимо подготовить отчет.");
                Friday = Friday + daysWeek;
                {

                }
            }

        }
    }

    private static void task3() {
        int yearStart = 1822;
        int yearFinish = 2122;
        int n = 0;
        while (n < yearFinish) {
            if (n >= yearStart) {
                System.out.println(n);
            }
            n = n + 79;

        }
    }
}


