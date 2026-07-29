package Java_5;
import java.util.Scanner;
public class FileNameAnalyzer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        IO.println("Enter file name:");
        String fileName = input.nextLine().trim();

        int dotIndex = fileName.lastIndexOf('.');
        if (fileName.isEmpty() || dotIndex <= 0 || dotIndex == fileName.length() - 1) {
            IO.println("Invalid file name.");
            input.close();
            return;
        }

        String baseName = fileName.substring(0, dotIndex);
        String extension = fileName.substring(dotIndex + 1).toLowerCase();

        String type;

        switch (extension) {
            case "txt":
            case "pdf":
            case "docx":
                type = "Document";
                break;

            case "jpg":
            case "png":
            case "gif":
                type = "Image";
                break;

            case "mp3":
            case "wav":
                type = "Audio";
                break;

            default:
                type = "Other";
        }

        IO.println("File Name: " + fileName);
        IO.println("Base Name: " + baseName);
        IO.println("Extension: " + extension);
        IO.println("Classification: " + type);
        input.close();
    }
}
