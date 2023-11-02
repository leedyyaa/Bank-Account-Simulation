
/**
 * Describes any class whose objects 
 * can be measured. Ref 10.1.2
 *
 * @author Lydia Kim
 * @version 5/1/21
 */
import java.util.ArrayList;
public interface MeasurableLK
{
    /**
     * List the REQUIRED methods that must be in ALL 
     * classes that "implements Measurable"
     */
    double getMeasure();

    /**
     * Pre Java 8 Release (2014) the methods implemented
     * below had to be in a separate "Data" class and not
     * in the interface file.
     */
    /**
    Computes the average of the measures of the given objects.
    @param objects an array of Measurable objects
    @return the average of the measures
     */
    public static double average(MeasurableLK[] objects)
    { 
        double sum = 0;
        for (MeasurableLK obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0) 
        { 
            return sum / objects.length; 
        }
        else 
        { 
            return 0; 
        }
    }

    /**
    Computes the largest of the measures of the given objects.
    @param objects an array of Measurable objects
    @return the largest of the measures
     */
    public static double max(MeasurableLK[] objects)
    {
        double maxV = objects[0].getMeasure();
        for (MeasurableLK obj : objects)
        {
            double amt = obj.getMeasure();
            if(amt > maxV)
                maxV = amt;
        }
        if (objects.length > 0) 
        { 
            return maxV; 
        }
        else 
        { 
            return -1; 
        }
    }

    /**
    Computes the smallest of the measures of the given objects.
    @param objects an array of Measurable objects
    @return the smallest of the measures
     */
    public static double min(MeasurableLK[] objects)
    {
        double minV = objects[0].getMeasure();
        for (MeasurableLK obj : objects)
        {
            double amt = obj.getMeasure();
            if(amt > minV)
                minV = amt;
        }
        if (objects.length > 0) 
        { 
            return minV; 
        }
        else 
        { 
            return -1; 
        }
        
        
    }

    /**
    Find the largest object
    @param objects an array of Measurable objects
    @return the largest object NOT THE measure
     */
    public static MeasurableLK largest(MeasurableLK[] objects)
    {
    	//not implemented
        return objects[0];
    }

    /**
    Find the smallest Object
    @param objects an array of MeasurableYIobjects
    @return the minimum of the measures, null if array is empty
     */
    public static MeasurableLK smallest(MeasurableLK[] objects)
    {
        //not implemented
        return objects[0]; 
    }

    public static double average(ArrayList<MeasurableLK> objects)
    { 
        double sum = 0;
        for (MeasurableLK obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        //qqq rewrite this "one liner" for easy reading
        if (objects.size() > 0) { return sum / objects.size(); } else { return 0; }
    }
}
