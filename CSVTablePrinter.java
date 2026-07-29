package Java_5;

public class CSVTablePrinter {
    public static void main(String[] args) {
        String[] csvRows = {
                "Name,Age,City",
                "Ali,25,Muscat",
                "Sara,30,Nizwa",
                "Ahmed,40,Sohar",
                "Fatma,18,Salalah",
                "Bad,Row"
        };
        String[] header = csvRows[0].split(",");
        IO.println(String.format("%-15s %-10s %-15s",
                header[0], header[1], header[2]));
        IO.println("-".repeat(45));
        int rowCount = 0;
        for (int i = 1; i < csvRows.length; i++) {
            String[] fields = csvRows[i].split(",");
            if (fields.length != header.length) {
                IO.println("Skipping malformed row: " + csvRows[i]);
                continue;
            }
            IO.println(String.format("%-15s %-10s %-15s",
                    fields[0].trim(),
                    fields[1].trim(),
                    fields[2].trim()));

            rowCount++;
        }
        IO.println("-");
        IO.println("Data Rows Shown: " + rowCount);
    }
}

