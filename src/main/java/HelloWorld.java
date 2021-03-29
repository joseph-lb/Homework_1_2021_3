import java.util.Scanner;

public class HelloWorld {
    // psvm main
    public static void main(String[] args) {
        // sout
        System.out.println("Hello world");
        System.out.println("Input two integers");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("Sum: " + (x + y));
    }
}

