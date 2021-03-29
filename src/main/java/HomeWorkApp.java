public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign(){
        int a, b;
        a = 3;
        b = -5;
        if (a + b >= 0) { System.out.println("Сумма положительная"); }
        else { System.out.println("Сумма отрицательная"); }
    }

    private static void printColor() {
        int value;
        value = 25;
        if (value <= 0) { System.out.println("Красный"); }
        else if ( value > 0 && value <= 100) { System.out.println("Желтый"); }
        else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(){
        int a, b;
        a = 30;
        b = 50;
        if (a >= b) { System.out.println("a >= b"); }
        else { System.out.println("a < b"); }
    }

}
