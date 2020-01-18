package classWorks.lesson2;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerForDouble {
    private static String filename = "C:\\Users\\arsen\\Desktop\\Новый текстовый документ.txt";

    public static void main(String[] args) {

        try {
            Scanner scaner = new Scanner(new File(filename));

            while (scaner.hasNext()) {
                if (scaner.hasNextDouble() && !scaner.hasNextInt()) {

                    try {
                        System.out.println(scaner.nextDouble());
                    } catch (InputMismatchException e) {
                        System.out.println(scaner.nextDouble());
                    }
                } else {
                    scaner.next();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //work in Console
        Console con = System.console(); 

        if (con != null) {
            String login = con.readLine();
            char[] password = con.readPassword();
            System.out.println("Login" + login + "; Pas" + password);
        } else {
            System.exit(0);
        }
    }
}
