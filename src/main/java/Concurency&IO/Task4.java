package SoftServe.Concurency;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<String> data = null;
        try {
             data = readFromFile("resume.txt");
        }catch (IllegalArgumentException | IOException e){
            System.out.println(e.getMessage());
            //handle this situation
        }

       int numberOfLineFromFileOne = data != null ? data.size() : 0;

       String longestLineFromFileOne = data != null ? data.stream()
               .max(Comparator.comparingInt(String::length))
               .toString()
               : null;

       String nameAndBirth = data != null ? data.stream()
               .limit(2)
               .collect(Collectors.joining(" "))
               : null;

       try {
           writeDataToFile("resume2.txt", String.valueOf(numberOfLineFromFileOne), true);
           writeDataToFile("resume2.txt", longestLineFromFileOne, true);
           writeDataToFile("resume2.txt", nameAndBirth, true);

       }catch (IllegalArgumentException | IOException e){
           System.out.println(e.getMessage());
           //handle this situation
       }

        List<String> data2 = null;
        try {
            data2 = readFromFile("resume2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (data2 != null) {
            data2.forEach(System.out::println);
        }

    }


    private static void writeDataToFile(String fileName, String data, boolean append) throws IllegalArgumentException, IOException {
        if (fileName == null) {
            throw new IllegalArgumentException("File name cannot be null");
        }

        Path path = FileSystems.getDefault().getPath(fileName);
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream(path.toFile(),append), StandardCharsets.UTF_8))){

            bw.write(data);
            bw.newLine();
            bw.flush();

        }catch (FileNotFoundException e){
            throw new IOException("File not found", e);
        }
    }

    private static List<String> readFromFile(String fileName) throws IllegalArgumentException, IOException{
        if (fileName == null) {
            throw new IllegalArgumentException("File name cannot be null");
        }

        Path path = FileSystems.getDefault().getPath(fileName);
        List<String> dataFromFile = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path.toFile()))
        ){
            String dataTmp;
            while ((dataTmp = br.readLine()) != null){
                dataFromFile.add(dataTmp);
            }

        } catch (FileNotFoundException e) {
            throw new IOException("File not found", e);
        }

        return dataFromFile;
    }

}
