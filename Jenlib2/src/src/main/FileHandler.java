package src.main;

import java.io.File;
import java.util.Scanner;

public class FileHandler {
    private static Scanner reader;

    public static String readLine(String filename, int line, String extension){
        File file;
        try {
            if (filename.endsWith(extension)) {
                file = new File(filename);
                reader = new Scanner(file);
                for (int i = 0; i < line - 1; i++) {
                    reader.nextLine();
                }
                return reader.nextLine();
            } else {
                return "Incorrect file extension";
            }
        } catch (Exception e) {
            return "Error opening file";
        }
    }

    public static String readFile(String filename, String extension){
        File file;
        String contents = "";
        try {
            if (filename.endsWith(extension)) {
                file = new File(filename);
                reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    contents = contents.concat(reader.nextLine()+" ");
                }
                return contents;
            } else {
                return "Incorrect file extension";
            }
        } catch (Exception e) {
            return "Error opening file";
        }
    }
}
