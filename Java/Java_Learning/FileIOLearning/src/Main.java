import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        // Learning the basics of reading and writing to a file.
        // Using BufferedWriter & BufferedReader. (There are other ways too, but this one's efficient).

        String[] names = {"John", "Jesse", "Micheal"};

        // --- Writing to a file ---

        // Surrounding in try catch because FileWriter can throw exceptions.
        try {
            // Initialize our BufferedWriter.
            // Pass in a FileWriter to the constructor. (Tells it we are writing to a file).
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            // write() vs append().
            // write() will override, append() will add.

            // Writing raw values
            writer.write("Hello! I am writing in a file.");
            writer.write("\nHere is a new line.");

            // Writing variables
            for (String name: names) {
                writer.write("\n" + name);
            }

            // Don't forget to close the file after writing to it! Resources leaks can occur if you don't.
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // --- Reading a file ---

        // Same stuff as the writer to set up, but this time it's with readers.

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            // Read one line
            System.out.println(reader.readLine());

            // Read the whole file
            String line;
            // reader.readLine() will keep reading lines. When it reaches the end of the file and therefore
            // returns null, stop the loop.
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // printing every line it reads.
            }

            reader.close(); // again don't forget to close the reader!

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}