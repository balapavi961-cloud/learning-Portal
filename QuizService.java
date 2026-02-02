import java.util.List;
import java.util.Scanner;

public class QuizService {
    public void conductQuiz(List<Question> questions) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("\n--- MOCK TEST STARTED ---");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            System.out.println("\nQ" + (i + 1) + ": " + q.getQuestion());

            String[] options = q.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            System.out.print("Enter your answer (1-" + options.length + "): ");
            int answer = sc.nextInt();

            if (answer == q.getCorrectOption()) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong!");
                System.out.println("Correct Answer: " + q.getCorrectOption());
            }
        }

        System.out.println("\n--- MOCK TEST COMPLETED ---");
        System.out.println("🎯 Your Score: " + score + " / " + questions.size());

        // Result feedback
        if (score >= questions.size() / 2) {
            System.out.println("🎉 Result: PASS");
        } else {
            System.out.println("📌 Result: NEEDS IMPROVEMENT");
        }
    }
}
