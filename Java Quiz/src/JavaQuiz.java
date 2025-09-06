import java.util.Scanner;

public class JavaQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== Java Quiz =====");

        // Question 1
        System.out.println("\n1) Who is known as the father of Java?");
        System.out.println("a) James Gosling\nb) Dennis Ritchie\nc) Bjarne Stroustrup\nd) Guido van Rossum");
        System.out.print("Your answer: ");
        char ans1 = sc.next().charAt(0);
        if(ans1 == 'a' || ans1 == 'A') {
            score++;
            System.out.println("Correct! ✅");
        } else {
            System.out.println("Incorrect ❌ ");
        }

        // Question 2
        System.out.println("\n2) What was Java’s original name?");
        System.out.println("a) Latte\nb) Oak\nc) Espresso\nd) Mocha");
        System.out.print("Your answer: ");
        char ans2 = sc.next().charAt(0);
        if(ans2 == 'b' || ans2 == 'B') {
            score++;
            System.out.println("Correct! ✅");
        } else {
            System.out.println("Incorrect ❌ ");
        }

        // Question 3
        System.out.println("\n3) Which of these is the correct way to print in Java?");
        System.out.println("a) print(\"Hello\")\nb) echo(\"Hello\")\nc) System.out.println(\"Hello\")\nd) console.log(\"Hello\")");
        System.out.print("Your answer: ");
        char ans3 = sc.next().charAt(0);
        if(ans3 == 'c' || ans3 == 'C') {
            score++;
            System.out.println("Correct! ✅");
        } else {
            System.out.println("Incorrect ❌");
        }

        // Question 4
        System.out.println("\n4) Java is __________.");
        System.out.println("a) Platform dependent\nb) Platform independent\nc) Only for web apps\nd) Only for mobile apps");
        System.out.print("Your answer: ");
        char ans4 = sc.next().charAt(0);
        if(ans4 == 'b' || ans4 == 'B') {
            score++;
            System.out.println("Correct! ✅");
        } else {
            System.out.println("Incorrect ❌ ");
        }

        // Question 5
        System.out.println("\n5) Which symbol is used to end a statement in Java?");
        System.out.println("a) . (dot)\nb) ; (semicolon)\nc) : (colon)\nd) , (comma)");
        System.out.print("Your answer: ");
        char ans5 = sc.next().charAt(0);
        if(ans5 == 'b' || ans5 == 'B') {
            score++;
            System.out.println("Correct! ✅");
        } else {
            System.out.println("Incorrect ❌");
        }

        // Question 6
        System.out.println("\n6) Which company originally developed Java?");
        System.out.println("a) Oracle\nb) Sun Microsystems\nc) Microsoft\nd) IBM");
        System.out.print("Your answer: ");
        char ans6 = sc.next().charAt(0);
        if(ans6 == 'b' || ans6 == 'B') {
            score++;
            System.out.println("Correct! ✅");
        } else {
            System.out.println("Incorrect ❌ ");
        }

        // Question 7
        System.out.println("\n7) What is the extension of a compiled Java file?");
        System.out.println("a) .java\nb) .class\nc) .exe\nd) .jar");
        System.out.print("Your answer: ");
        char ans7 = sc.next().charAt(0);
        if(ans7 == 'b' || ans7 == 'B') {
            score++;
            System.out.println("Correct! ✅");
        } else {
            System.out.println("Incorrect ❌");
        }

        // Final Score
        System.out.println("\n===== Quiz Completed =====");
        System.out.println("Your Score: " + score + "/7");

        if(score == 7) {
            System.out.println("Excellent! 🎉 You are a Java star!");
        } else if(score >= 4) {
            System.out.println("Good job! 👍 Keep practicing.");
        } else {
            System.out.println("Needs improvement. Keep learning! 💡");
        }

        sc.close();
    }
}
