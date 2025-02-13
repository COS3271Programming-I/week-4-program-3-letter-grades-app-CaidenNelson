import java.util.Scanner;

class LetterGrade {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a test score:");
        String gradeModifier = "";
        int testscore = userinput.nextInt();
        //note that in ASCII ... A is 65, B is 66, C is 67, etc.
        //this converts from grade to ASCII value ... the higher the grade the lower the ASCII value
        int ascii = 74 - (testscore / 10);
        if (ascii > 68) {ascii = 70;}
        if (testscore % 10 <= 2 && testscore > 59) {gradeModifier = "-";}
        if (testscore % 10 >= 7 && testscore > 59 && testscore < 93)  {gradeModifier = "+";}

        System.out.println("Grade = " +(char)ascii+gradeModifier);

    }
}
