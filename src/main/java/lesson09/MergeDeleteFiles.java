package lesson09;

import java.io.*;

public class MergeDeleteFiles {

    public static void main(String[] args) throws IOException {

        File result = new File("result_file.txt");
        try {
            result.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter writer =
                null;
        try {
            writer = new BufferedWriter(
                    new FileWriter(result));
        } catch (IOException e) {
            e.printStackTrace();
        }

        File folder = new File("C:/Users/geekbrains_java/src/main/java/lesson03");
        for (File file : folder.listFiles()) {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(
                        new FileReader(file));
                int nextByte;
                while (reader.ready()) {
                    nextByte = reader.read();
                    writer.write((char) nextByte);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        writer.close();

        folder = new File("C:/Users/geekbrains_java/test");
        if (folder.exists()) {
            deleteFolder(folder);
        }
        else System.out.println("Folder does not exist.");
    }

    public static void deleteFolder (File folder) {
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                deleteFolder(file);
                file.delete();
            }
            else {
                file.delete();
            }
        }
        folder.delete();
    }
}
