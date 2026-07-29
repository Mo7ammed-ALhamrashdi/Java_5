package Java_5;
import java.util.ArrayList;
import java.util.List;
public class FileTypeClassifier {
    public static void main(String[] args) {
        List<String> files = new ArrayList<>();
        files.add("report.pdf");
        files.add("notes.txt");
        files.add("photo.jpg");
        files.add("image.png");
        files.add("Program.java");
        files.add("script.js");
        files.add("python.py");
        files.add("README");
        int documentCount = 0;
        int imageCount = 0;
        int codeCount = 0;
        int otherCount = 0;
        for (String file : files) {
            int dotIndex = file.lastIndexOf('.');
            String extension = "";
            if (dotIndex != -1 && dotIndex != file.length() - 1) {
                extension = file.substring(dotIndex + 1).toLowerCase();
            }
            String type;
            switch (extension) {
                case "txt":
                case "pdf":
                case "docx":
                    type = "Document";
                    documentCount++;
                    break;
                case "jpg":
                case "png":
                    type = "Image";
                    imageCount++;
                    break;
                case "java":
                case "py":
                case "js":
                    type = "Code";
                    codeCount++;
                    break;
                default:
                    type = "Other";
                    otherCount++;
                    break;
            }
            IO.println("File: " + file + " | Type: " + type);
        }
        IO.println("-");
        IO.println("Total Files: " + files.size());
        IO.println("Documents: " + documentCount);
        IO.println("Images: " + imageCount);
        IO.println("Code: " + codeCount);
        IO.println("Other: " + otherCount);
    }
}