package Lab2;

public class LetterRunner {
    public static void main(String[] args) {
        LetterGrade grader = new LetterGrade();
        String grade3 = grader.gradeV3(80);
        System.out.println(grade3);
        String grade4 = grader.gradeV4(80);
        System.out.println(grade4);
    }
}
