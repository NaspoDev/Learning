package me.naspo.customfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CustomFile {

    //The file itself. (Optional dir, file name)
    // This will create the file. If the file already exists it will not create/overwrite. (No need for a
    //creation class/method.
    private File file = new File("DataFolder", "data.txt");

    private FileWriter fw; //Allows you to write to a file.
    private PrintWriter pw; //A more advanced version of FileWriter. Allows you to write to a file through the FileWriter.
    private Scanner scan = new Scanner(System.in);

    public void setup() {
        //Initialization and operations in try catch because FW could throw error.
        try {
            fw = new FileWriter(file, true); //append to true will not overwrite everytime.
            pw = new PrintWriter(fw);

            System.out.print("Write to file: ");
            String write = scan.nextLine();
            pw.println(write);
            pw.println("test1");
            pw.close(); //Don't forget to close the FW or PW when done!
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public File get() {
        return file;
    }
}

