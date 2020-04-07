import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class list {
    private static final String csvFile = "articles.csv";

    public static void main(String[] args) throws IOException, CsvValidationException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(csvFile));
                CSVReader csvReader = new CSVReader(reader);
        ) {
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("Title: " + nextRecord[0]);
//                System.out.println("Body: " + nextRecord[1]);
//                System.out.println("Name: " + nextRecord[2]);
//                System.out.println("Publish Date: " + nextRecord[3]);
//                System.out.println("Last Edit Date: " + nextRecord[4]);
                System.out.println("==========================");
            }
        }
    }
}