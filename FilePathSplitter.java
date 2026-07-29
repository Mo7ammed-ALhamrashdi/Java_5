package Java_5;
import java.util.Scanner;
public class FilePathSplitter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IO.println("Enter full file path:");
        String path = input.nextLine().trim();
        if (path.isEmpty()) {
            IO.println("Invalid path.");
            input.close();
            return;
        }
        boolean isWindows = path.contains("\\");
        String newPath = path.replace('\\', '/');
        int slashIndex = newPath.lastIndexOf('/');
        String folder;
        String fileName;
        if (slashIndex != -1) {
            folder = newPath.substring(0, slashIndex);
            fileName = newPath.substring(slashIndex + 1);
        } else {
            folder = "";
            fileName = newPath;
        }
        String extension = "none";
        int dotIndex = fileName.lastIndexOf('.');

        if (dotIndex != -1 && dotIndex != fileName.length() - 1) {
            extension = fileName.substring(dotIndex + 1).toLowerCase();
        }
        IO.println("Path: " + path);
        IO.println("Folder: " + folder);
        IO.println("File Name: " + fileName);
        IO.println("Extension: " + extension);
        if (isWindows) {
            IO.println("Path Style: Windows Path");
        } else {
            IO.println("Path Style: Unix Path");
        }
        input.close();
    }
}