
    import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int timeLimit = 15; // Set the time limit for each question (in seconds)

        // Quiz questions and options
        String[] questions = {
            "Who invented Java Programming?",
            "Which statement is true about Java?",
            "Which component is used to compile, debug, and execute Java programs?",
            "Which one of the following is not a Java feature?",
            "Which of these cannot be used for a variable name in Java?",
            "What is the extension of Java code files?"
        };

        String[][] options = {
            {"a) Guido van Rossum", "b) James Gosling", "c) Dennis Ritchie", "d) Bjarne Stroustrup"},
            {"a) Java is a sequence-dependent", "b) Java is a code-dependent",
             "c) Java is a platform-dependent", "d) Java is a platform-independent"},
            {"a) JRE", "b) JIT", "c) JDK", "d) JVM"},
            {"a) Object-oriented", "b) Use of pointers", "c) Portable", "d) Dynamic and Extensible"},
            {"a) Identifier & keyword", "b) Identifier", "c) Keyword", "d) None of the mentioned"},
            {"a) .js", "b) .txt", "c) .class", "d) .java"}
        };

        char[] correctAnswers = {'b', 'd', 'c', 'b', 'c', 'd'};

        // Display questions and get user input with a timer
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Start the timer
            long startTime = System.currentTimeMillis();
            System.out.print("Your answer (a/b/c/d): ");
            char userAnswer = scanner.next().charAt(0);
            long endTime = System.currentTimeMillis();

            // Check if the user answered within the time limit
            if (endTime - startTime <= timeLimit * 1000) {
                if (userAnswer == correctAnswers[i]) {
                    score++;
                }
            } else {
                System.out.println("Time's up! Moving to the next question.");
            }
        }

        // Display final score
        System.out.println("\nYour score: " + score + " out of " + questions.length);
    }
}


