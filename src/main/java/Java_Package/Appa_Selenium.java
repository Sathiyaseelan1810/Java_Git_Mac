package Java_Package;

//import org.apache.log4j.LogManager;
import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.log4j.Logger;


public class Appa_Selenium {

    private static Logger logger = LogManager.getLogger(Appa_Selenium.class);

    public static void main(String[] args) throws FileNotFoundException

    {

        logger.error("Hi! This is Error Message");
        System.out.println("-------Starting---------");
        Scanner s = new Scanner(new File("/Users/sathiyaseelan/IdeaProjects/mavenexample/src/main/java/Java_Package/inputs.txt"));
        ArrayList<Integer> lst = new ArrayList<Integer>();
        while (s.hasNextLine())
            lst.add(s.nextInt());
        for (int i=0;i<lst.size();i++)
        {

            System.out.println(lst.get(i));
            //logger.info("is Completed");
        }
        logger.warn("Warning Message");







    }




}
