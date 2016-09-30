import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Demo90 {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		List<Cars> cars = new ArrayList<Cars>();
		
		for(int i=0;i<cars.size();i++)
		{
			cars.get(i).drive();
		}
	}

}
