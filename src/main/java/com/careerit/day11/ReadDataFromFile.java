package com.careerit.day11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("E:\\git\\jfs_11jan2024\\jan16_java\\src\\main\\resources\\college1.csv"); // Specify the filename
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
/*
public class ReadDataFromFile {
    public static void main(String[] args) {
      /*  //ClassLoader classLoader = ReadDataFromFile.class.getClassLoader();
        File file = new File(ReadDataFromFile.class.getResource("/randomdata.txt").getFile());
        //inputStream = new FileInputStream(file);
       List<String> lines=files.readAllLines(file.toPath());
        Path path = Paths.get("randomdata.txt");

        String read = Files.readAllLines(path).get(0);
        for (String line : lines) {
            System.out.println(line);
        }

    }
}*/
