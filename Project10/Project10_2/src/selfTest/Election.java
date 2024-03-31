package selfTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
       System.out.println("2022001167 이조에");
        Calculator calculator = new Calculator();

        try {
            Scanner scanner = new Scanner(new FileInputStream("resource/candidate.txt"));

            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                calculator.addName(name);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found or already opened");
            System.exit(0);
        } catch (NoSuchElementException e) {
            System.err.println("Out of Boundary");
            System.exit(0);
        }

        try {
            File out = new File("resource/election.txt");
            FileWriter writer = new FileWriter(out);

            String allCandidates = calculator.toStringAllList();
            writer.write(allCandidates);

            writer.close();
        } catch (IOException e) {
            System.err.println("IOException");
            System.exit(0);
        }
    }
}
