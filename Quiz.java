import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ": " + options[i]);
            }
            System.out.print("Your answer: ");
            int userAnswerIndex = scanner.nextInt() - 1;

            if (question.isCorrectAnswer(userAnswerIndex)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + options[question.getCorrectAnswerIndex()] + "\n");
            }
        }

        System.out.println("Quiz finished! Your score: " + score + "/" + questions.size());
        scanner.close();
    }
}
