package gradebook;

import java.util.Scanner;

public class GradeBook {

    private String courseName;

    public GradeBook(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {

        return courseName;
    }

    public void setCourseName(String courseName) {

        this.courseName = courseName;
    }
    public String displayMessage(){

        return getCourseName();
    }

    public void determineClassAverage(){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;
        int grade;
        int average;

        while (gradeCounter <=10){
            System.out.println("Ingrese la nota: ");
            grade=input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        average = total /10;
        System.out.println("\n Total de todos los 10 notas suman: " + total );
        System.out.println("\n El promedio es de: " + average );

    }




}
