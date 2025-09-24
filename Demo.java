import java.util.Scanner;

import comCourseStructure.Building;
import comCourseStructure.House;
import comCourseStructure.School;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Building building = new Building();
        System.out.print("Enter square footage for Building: ");
        building.setSquareFootage(input.nextDouble());
        System.out.print("Enter number of stories for Building: ");
        building.setStories(input.nextInt());
        System.out.println("Building: " + building.getSquareFootage() + " sqft, " + building.getStories() + " stories");

        House house = new House();
        System.out.print("Enter square footage for House: ");
        house.setSquareFootage(input.nextDouble());
        System.out.print("Enter number of stories for House: ");
        house.setStories(input.nextInt());
        System.out.print("Enter number of bedrooms: ");
        house.setBedrooms(input.nextInt());
        System.out.print("Enter number of baths: ");
        house.setBaths(input.nextInt());
        System.out.println("House: " + house.getSquareFootage() + " sqft, " + house.getStories() + " stories, " +
                           house.getBedrooms() + " bedrooms, " + house.getBaths() + " baths");

        School school = new School();
        System.out.print("Enter square footage for School: ");
        school.setSquareFootage(input.nextDouble());
        System.out.print("Enter number of stories for School: ");
        school.setStories(input.nextInt());
        System.out.print("Enter number of classrooms: ");
        school.setClassrooms(input.nextInt());
        input.nextLine(); 
        System.out.print("Enter grade level: ");
        school.setGradeLevel(input.nextLine());
        System.out.println("School: " + school.getSquareFootage() + " sqft, " + school.getStories() + " stories, " +
                           school.getClassrooms() + " classrooms, Grade Level: " + school.getGradeLevel());

        input.close();
    }
}
