package ex_01_05012025_Java_Program;

public class Lab0010_Score {
    public static void main(String[] args) {
        int score = 2;
        String grade = (score>=90 && score<=100) ? "A Grade":
                (score>=80 && score<=89) ? "B grade":
                        (score>=70 && score<=79) ? "C Grade":
                                (score>=60 && score<=69) ? "D Grade":
                                        (score>=0 && score<=59) ? "F Grade": "Invalid score";
        System.out.println(grade);


    }
}
