import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== WELCOME TO JAVA QUIZ =====");

        // ask name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // start confirmation
        System.out.print("Do you want to start the quiz? (yes/no): ");
        String start = sc.nextLine();

        if (!start.equalsIgnoreCase("yes")) {
            System.out.println("Okay " + name + ", quiz exited. Thank you!");
            sc.close();
            return;
        }

        System.out.println("\nHello " + name + ", let's start the quiz!");

        // questions
        String[] questions = {
            "1. Which programming language is used for Android development?",
            "2. Which keyword is used to inherit a class in Java?",
            "3. What does JVM stand for?",
            "4. Which data type is used to store decimal numbers in Java?",
            "5. Which method is the entry point of a Java program?",
            "6. What is the size of int in Java?",
            "7. Which collection allows duplicate elements in Java?",
            "8. Which operator is used for logical AND in Java?",
            "9. What does SQL stand for?",
            "10. Which loop is guaranteed to execute at least once?"
        };

        String[][] options = {
            {"1. Python", "2. Java", "3. C++", "4. JavaScript"},
            {"1. implements", "2. extends", "3. inherits", "4. interface"},
            {"1. Java Virtual Machine", "2. Java Visual Method", "3. Java Variable Memory", "4. Just Virtual Machine"},
            {"1. int", "2. float", "3. char", "4. boolean"},
            {"1. main()", "2. start()", "3. run()", "4. execute()"},
            {"1. 2 bytes", "2. 4 bytes", "3. 8 bytes", "4. depends on compiler"},
            {"1. Set", "2. Map", "3. List", "4. Tree"},
            {"1. &", "2. &&", "3. |", "4. ||"},
            {"1. Structured Query Language", "2. Simple Query Language", "3. Standard Question Language", "4. Sequential Query Language"},
            {"1. for loop", "2. while loop", "3. do-while loop", "4. for-each loop"}
        };

        int[] answers = {2, 2, 1, 2, 1, 2, 3, 2, 1, 3};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = sc.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + options[i][answers[i] - 1]);
            }
        }

        // result
        double percentage = (score * 100.0) / questions.length;
        String grade;

        if (percentage >= 90) grade = "A";
        else if (percentage >= 75) grade = "B";
        else if (percentage >= 50) grade = "C";
        else grade = "Fail";

        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score + "/" + questions.length);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
