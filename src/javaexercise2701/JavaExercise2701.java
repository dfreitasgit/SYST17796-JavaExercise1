package javaexercise2701;

import java.util.Scanner;

/*
 * @author David Freitas
 */
public class JavaExercise2701 {

    /*
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter School number(1-Business, 2-Engineering, 0-Exit): ");
        int school = input.nextInt();
        
        while(true) {
            try {
                if(school >= 0 && school <= 2)
                    break;
                else
                    System.out.println("Please enter a number(1-Business, 2-Engineering, 0-Exit): ");
            } catch(Exception ex) {
                System.out.println("Please enter a number(1-Business, 2-Engineering, 0-Exit): ");
            }
            school = input.nextInt();
        }
        if(school == 0) {
            System.out.println("Have a nice day!");
        } else {
            System.out.println("Your grade is: " + gradeConverter(school));
        }
    }
    
    public static String gradeConverter(int school) {
        int numGrade = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number grade: ");
        while(true) {
            try {
                numGrade = input.nextInt();
                if(numGrade >= 0 && numGrade <= 100)
                    break;
                else
                    System.out.println("Please enter a valid number grade(1-100): ");
            } catch(Exception ex) {
                System.out.println("Please enter a valid number grade(1-100): ");
            }
            numGrade = input.nextInt();
        }
        
        switch(school) {
            case 1:
                if(numGrade <= 100 && numGrade >= 90)
                    return "A+";
                else if(numGrade <= 89 && numGrade >= 80)
                  return "A";
                else if(numGrade <= 79 && numGrade >= 70)
                  return "B";
                else if(numGrade <= 69 && numGrade >= 65)
                    return "B";
                else if(numGrade <= 64 && numGrade >= 60)
                    return "C+";
                else if(numGrade <= 59 && numGrade >= 55)
                    return "C";
                else if(numGrade <= 54 && numGrade >= 50)
                    return "D";
                else
                    return "F";
            case 2:
                if(numGrade <= 100 && numGrade >= 95)
                    return "A+";
                else if(numGrade <= 94 && numGrade >= 90)
                    return "A";
                else if(numGrade <= 89 && numGrade >= 85)
                    return "B";
                else if(numGrade <= 84 && numGrade >= 80)
                    return "B";
                else if(numGrade <= 79 && numGrade >= 75)
                    return "C+";
                else if(numGrade <= 74 && numGrade >= 70)
                    return "C";
                else if(numGrade <= 69 && numGrade >= 50)
                    return "D";
                else
                    return "F";
            default:
                return"";
        }
    }
}