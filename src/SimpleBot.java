import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Viktor", "2025");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
        System.out.println("(Enter your name below)");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainder of dividing your age by 3.");
        int remainder3 = scanner.nextInt();
        System.out.println("Enter remainder of dividing your age by 5.");
        int remainder5 = scanner.nextInt();
        System.out.println("Enter remainder of dividing your age by 7.");
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        System.out.println("(Please don't enter very large numbers, otherwise I'll get tired of counting.)");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your Ukrainian culture knowledge.");
        System.out.println("What’s a very “Ukrainian grandma” thing to do when you visit?");
        System.out.println("1. Offer you green tea and cookies.");
        System.out.println("2. Ask you to fix her Wi-Fi.");
        System.out.println("3. Feed you five meals in a row.");
        System.out.println("4. Offer you yoga and meditation.");
        System.out.println("(Enter correct number below)");

        while (true) {
            int answer = scanner.nextInt();
            if (answer == 3) {
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }

    static void end() {
        System.out.println("Congratulations!");
        System.out.println("And small bonus for you;)");
        System.out.println("When a Ukrainian says “Come for tea,”\n" +
                "they actually mean:\n" +
                "✔ soup\n" +
                "✔ salad\n" +
                "✔ potatoes\n" +
                "✔ meat\n" +
                "✔ cake\n" +
                "✔ 3-hour conversation\n" +
                "✔ and, finally… tea");
        System.out.println("Have a nice day!");

    }
}

