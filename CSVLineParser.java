package Java_5;
import java.util.Scanner;
public class CSVLineParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IO.println("Enter record (Name, Age, City):");
        String line = input.nextLine();
        String[] fields = line.split(",");
        if (fields.length != 3) {
            IO.println("Invalid record.");
            input.close();
            return;
        }
        String name = fields[0].trim();
        int age = Integer.parseInt(fields[1].trim());
        String city = fields[2].trim();
        String ageGroup;
        if (age < 18) {
            ageGroup = "Minor";
        } else if (age <= 64) {
            ageGroup = "Adult";
        } else {
            ageGroup = "Senior";
        }
        IO.println("Name: " + name);
        IO.println("Age: " + age);
        IO.println("City: " + city);
        IO.println("Age Group: " + ageGroup);
        input.close();
    }
}

