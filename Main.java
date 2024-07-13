public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        String[] options1 = {"Java", "Python", "C++", "JavaScript"};
        quiz.addQuestion(new Question("Which programming language is used to develop Android apps?", options1, 0));

        String[] options2 = {"Lion", "Elephant", "Tiger", "Giraffe"};
        quiz.addQuestion(new Question("Which animal is known as the King of the Jungle?", options2, 0));

        String[] options3 = {"Earth", "Mars", "Jupiter", "Venus"};
        quiz.addQuestion(new Question("Which planet is known as the Red Planet?", options3, 1));

        quiz.start();
    }
}
