
/**
 * Write a description of class ClientCountryYI here.
 *
 * @author Lydia Kim
 * @version 5/1/21
 */

public class ClientCountryLK
{
    public void test1Country()
    {
        // Calling the average method with an array of Country objects
        MeasurableLK[] countries = new MeasurableLK[3];
        countries[0] = new CountryLK("Uruguay",  176220);
        countries[1] = new CountryLK("Thailand", 513120);
        countries[2] = new CountryLK("Japan",   30510);

        double averageArea = MeasurableLK.average(countries);
        System.out.println("Average area: " + averageArea);
        System.out.println("Expected: 239950"); 

        double largest = MeasurableLK.max(countries);
        MeasurableLK largCountry = MeasurableLK.largest(countries);
        CountryLK ct = (CountryLK)largCountry;
        String  name = ct.getName();
        System.out.println("largest is " + name +" = "+largest);

        double smallest = MeasurableLK.min(countries);
        MeasurableLK smallCountry = MeasurableLK.smallest(countries);
        System.out.printf("smallest is %s = %.1f", 
            ((CountryLK)smallCountry).getName(),
            smallest);
    }

    public void test2Country()
    {
        // Calling the average method with an array of Country objects
        MeasurableLK[] countries = new MeasurableLK[3];
        countries[0] = new CountryLK("Uruguay",  176220);
        countries[1] = new CountryLK("Thailand", 513120);
        countries[2] = new CountryLK("Japan",   30510);

        double averageArea = MeasurableLK.average(countries);
        System.out.println("Average area: " + averageArea);
        System.out.println("Expected: 239950");

        double largest = MeasurableLK.max(countries);
        System.out.print("Largest population="+largest);

        MeasurableLK largCountry = MeasurableLK.largest(countries);
        CountryLK ct = (CountryLK)largCountry;
        String  name = ct.getName();
        System.out.println("(" + name +")");

        double smallest = MeasurableLK.min(countries);
        MeasurableLK smallCountry = MeasurableLK.smallest(countries);
        System.out.printf("smallest is %s = %.1f", 
            ((CountryLK)smallCountry).getName(),
            smallest);

        //Arrays.sort(countries);
    }

}
