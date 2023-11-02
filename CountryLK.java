
/**
A country with a name and area.
 * @author Lydia Kim
 * @version 5/1/21
 */
public class CountryLK                                        //implements M, C
{
    private String name;
    private double area;

    /**
    Constructs a country.
    @param aName the name of the country
    @param anArea the area of the country
     */
    public CountryLK(String aName, double anArea) 
    { 
        name = aName;
        area = anArea;
    }

    /**
    Gets the country name.
    @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
    Gets the area of the country.
    @return the area
     */
    public double getArea() 
    {
        return area; 
    }

    public double getMeasure() 
    {
        return getArea(); 
    }

    public int compareTo(Object otherObject)
    {
        CountryLK other = (CountryLK) otherObject;
        return 0;
    } 

}

