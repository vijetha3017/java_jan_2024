package com.careerit.day13;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingDataFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(ReadingDataFromFile.class.getResourceAsStream("\"E:\\\\git\\\\jfs_11jan2024\\\\jan16_java\\\\src\\\\main\\\\java\\\\com\\\\careerit\\\\day13\\\\test1.txt\""));
        //Scanner sc = new Scanner(Objects.requireNonNull(ReadingDataFromFile.class.getResourceAsStream("/test1.txt")));
       File myObj = new File("E:\\git\\jfs_11jan2024\\jan16_java\\src\\main\\java\\com\\careerit\\day13\\test1.txt"); // Specify the filename
       Scanner sc = new Scanner(myObj);
        String str = null;
        while((str = sc.nextLine()) != null){
            System.out.println(str.toUpperCase());
        }
    }
}
