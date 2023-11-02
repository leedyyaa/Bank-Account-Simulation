
/**
 *
 *  
 * @author Lydia Kim
 * @version 5/8/21
 */
//These 3 imports needed for reading a text file
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.Random;
public class ReadCountry
{
    final int SIZE = 50;
    String[] nameList = new String[SIZE];
    int[]    areaList = new int[SIZE];
    //Reading data from a text file of ints
    //Step 1: include the 3 imports at top of this code
    //Step 2: copy/paste method readAnyTextFile()
    //Step 3: copy/paste method processOneLine()
    public void readFile() throws FileNotFoundException
    {
        //Step 4: Enter data file name
        //   CountryData file format ex USA, 54321 
        String inputFileName = "CountryData.txt";
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);

        //Count number of lines
        int count = 0;
        while(in.hasNext()) //while(in.hasNextInt())//check if any ints left
        {
            //int oneData = in.nextInt();
            String oneName = in.next();
            int oneArea = in.nextInt();
            //Now you do anything you need with oneData.
            //if(oneData > 0) //optional
            if(oneName.length() > 0) //optional
            {
                //processOneData( oneData, count+1 );
                processOneData( oneName, oneArea, count+1 );
                count++;
            }
        }
        in.close(); //like clicking X to close the file
    }

    //public void processOneData(int oneData, int count)
    public void processOneData(String oneName, int oneArea, int count)
    {
        //Step 5: Add code, example 
        //  
        System.out.println("DBGi"+count+": "+oneName+" "+oneArea);
    }
}
 