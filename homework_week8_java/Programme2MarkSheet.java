package homework_week8_java;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3 programmes) using if else and while loop.
 * * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * * _______________________________
 * * | |
 * * | Mark Sheet |
 * * |_______________________________|
 * * | Name : Jay |
 * * | Roll No: 08 |
 * * |_______________________________|
 * * | Subjects : Marks |
 * * |_______________________________|
 * * | Math : 98 |
 * * | Science : 90 |
 * * | English : 85 |
 * * |_______________________________|
 * * | Total : 273 |
 * * |_______________________________|
 * * | Percentage : 91.0 |
 * * | Result : Pass |
 * * | Grade : A+ |
 * * |_______________________________|
 */
public class Programme2MarkSheet {

    public static void main(String[] args) {

        Programme2MarkSheet m = new Programme2MarkSheet();
        m.marksheet();

    }

    public void marksheet() {

        Scanner s = new Scanner(System.in); //Scanner to ask user for the Input
        System.out.print("Enter student Name: ");
        String name = s.nextLine();
        System.out.print("Enter student Roll No: ");
        int rollNo = s.nextInt();
        double mathMarks, scienceMarks, englishMarks;

        do {
            System.out.println("Enter Math Marks (0-100): ");
            mathMarks = s.nextDouble();
        } while (mathMarks < 0 || mathMarks > 100);
        do {
            System.out.println("Enter Science Marks (0-100): ");
            scienceMarks = s.nextDouble();
        } while (scienceMarks < 0 || scienceMarks > 100);
        do {
            System.out.println("Enter English marks (0-100): ");
            englishMarks = s.nextDouble();
        } while (englishMarks < 0 || englishMarks > 100);
        double total = mathMarks + scienceMarks + englishMarks;
        double percent = (total / 300) * 100;
        String result;
        String grade;
        if (percent >= 80) {
            grade = "A+";
        } else if (percent >= 60) {
            grade = "A";
        } else if (percent >= 50) {
            grade = "B";
        } else if (percent >= 35) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        if (percent >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        s.close(); // scanner close to prevent leakage

        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                |");
        System.out.println("| Roll No:" + rollNo + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathMarks + "                |");
        System.out.println("| Science:" + scienceMarks + "             |");
        System.out.println("| English:" + englishMarks + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percent + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}


