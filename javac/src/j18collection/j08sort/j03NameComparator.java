package j18collection.j08sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class j03NameComparator implements Comparator<j03Bank>
{

	@Override
	public int compare(j03Bank o1, j03Bank o2) {
		
		return o1.bname.compareTo(o2.bname); // sort by ascending 
		//return o2.bname.compareTo(o1.bname); // sort by ascending
	}

	
		

}
