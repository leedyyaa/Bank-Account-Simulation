
/**
 * ref BJE07 pg 346
 *
 * @author Lydia Kim
 * @version 5/1/21
 */

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.*;
import java.util.Random;
public class ClientAcctLK
{
    //private ArrayList<Pupil> bio23;
    public void test1Accts( )
    {
        Random rrrr = new Random(); 
        int size = 4;
        //accounts with random balances
        MeasurableLK[] accounts = {
                new BankAccountLK(900), 
                new BankAccountLK(700), 
                new BankAccountLK(800), 
                new BankAccountLK(400) };

        double averageBalance = MeasurableLK.average(accounts);
        System.out.println("Average balance: " + averageBalance);

        double mx = MeasurableLK.max(accounts);
        System.out.printf("Max=%.2f\n",mx);

        double mn = MeasurableLK.min(accounts);
        System.out.println("Min="+mn);

    }
    //private ArrayList<Pupil> bio23;
    public void test2Accts( )
    {
        Random rrrr = new Random(); 
        int size = 4;
        //accounts with random balances
        MeasurableLK[] accounts = {
                new BankAccountLK(900), 
                new BankAccountLK(700), 
                new BankAccountLK(800), 
                new BankAccountLK(400) };

        System.out.print("DBG Original: "+Arrays.toString(accounts));
        //
        //

        double averageBalance = MeasurableLK.average(accounts);
        System.out.println("Average balance: " + averageBalance);

        System.out.println("Finished");
    }

}
