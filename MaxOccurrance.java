package shashank.ashtikar.dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MaxOccurrance {


	public static HashMap<Integer, Integer> map;

	public static void main(String args[]){
		
		int maxValue=0;
		int maxKey=0;
		map = new HashMap<Integer, Integer>();
	int valArray[] = {1,2,7,54,4,7,54,54,54,54,9,2};
	for (int i=0;i<valArray.length;i++)
	{
		checkPresent(valArray[i]);
	}
	
	Set<Entry<Integer, Integer>> set = map.entrySet();
	java.util.Iterator<Entry<Integer, Integer>> it =set.iterator();
	
	while(it.hasNext())
	{
		Map.Entry me = (Map.Entry) it.next();
		
		if ((int)me.getValue()>maxValue)
		{
			maxValue = (int) me.getValue();
			maxKey = (int) me.getKey();
		}
	}	
	System.out.println("The most frequently occurring element is: "+maxKey+" with "+maxValue+" occurances");
	}


static void checkPresent(int a)
{
	if (!(map.containsKey(a))){		
		map.put(a, 1);		
	}
	else
	{
		map.put(a, ((int)map.get(a)+1));
		
	}
}

}
