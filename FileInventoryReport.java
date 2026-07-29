package Java_5;

public class FileInventoryReport {
    public static void main(String[] args) {
        String[] records = {
                "photo.png,340",
                "app.java,8",
                "report.pdf,150",
                "music.mp3,5200",
                "notes.txt,12",
                "image.gif,450",
                "data.xlsx,75"
        };
        int totalSize = 0;
        int documentCount = 0;
        int imageCount = 0;
        int audioCount = 0;
        int codeCount = 0;
        int otherCount = 0;
        String largestFile = "";
        int largestSize = 0;
        for (String record : records) {
            String[] parts = record.split(",");
            if (parts.length != 2) {
                IO.println("Skipping malformed record: " + record);
                continue;
            }
            String fileName = parts[0].trim();
            int size = Integer.parseInt(parts[1].trim());
            int dotIndex = fileName.lastIndexOf('.');
            String extension = "";
            if (dotIndex != -1 && dotIndex != fileName.length() - 1) {
                extension = fileName.substring(dotIndex + 1).toLowerCase();
            }
            String type;
            switch (extension) {
                case "txt":
                case "pdf":
                case "docx":
                case "xlsx":
                    type = "Document";
                    documentCount++;
                    break;
                case "jpg":
                case "png":
                case "gif":
                    type = "Image";
                    imageCount++;
                    break;
                case "mp3":
                case "wav":
                    type = "Audio";
                    audioCount++;
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
            totalSize += size;
            if (size > largestSize) {
                largestSize = size;
                largestFile = fileName;
            }
            IO.println("File Name: " + fileName);
            IO.println("Extension: " + extension);
            IO.println("Type: " + type);
            IO.println("Size: " + size + " KB");
            IO.println("-");
        }
        IO.println("Total Files: " + records.length);
        IO.println("Total Size: " + totalSize + " KB");
        IO.println("Documents: " + documentCount);
        IO.println("Images: " + imageCount);
        IO.println("Audio: " + audioCount);
        IO.println("Code: " + codeCount);
        IO.println("Other: " + otherCount);
        IO.println("Largest File: " + largestFile);
        IO.println("Largest Size: " + largestSize + " KB");
    }
}
