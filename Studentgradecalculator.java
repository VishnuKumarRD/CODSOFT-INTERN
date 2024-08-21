import java.util.*;
public class Studentgradecalculator {

    public static void main(String[] args){
        Scanner vk = new Scanner(System.in);
        System.out.println("...GRADE ANALYSIS...");

        System.out.print("Enter the number of subjects: ");
        int Sub = vk.nextInt();
        int[] tot_Sub = new int[Sub];

        int tot_Marks = 0;
        for (int i = 0; i < Sub; i++) {
            System.out.print("Enter the Subject mark " + (i + 1) + ": ");
            tot_Sub[i] = vk.nextInt();
        }
        vk.close();

        for (int i = 0; i < Sub; i++) {
            tot_Marks += tot_Sub[i];
        }

        double avg_per = (double) tot_Marks / Sub;

        String grade;
        if (avg_per > 90 && avg_per <= 100) {
            grade = "O";
        } else if (avg_per > 80 && avg_per <= 90) {
            grade = "A+";
        } else if (avg_per > 70 && avg_per <= 80) {
            grade = "A";
        } else if (avg_per > 60 && avg_per <= 70) {
            grade = "B+";
        } else if (avg_per >= 56 && avg_per <= 60) {
            grade = "B";
        } else if (avg_per >= 50 && avg_per < 56) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Student total Mark: " + tot_Marks);
        System.out.println("Average as Percentage: " + avg_per + " % ");
        System.out.println("Your Grade is: " + grade);
    }
}