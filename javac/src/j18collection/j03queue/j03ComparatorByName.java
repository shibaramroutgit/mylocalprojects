package j18collection.j03queue;

import java.util.Comparator;

public class j03ComparatorByName implements Comparator<j02School>
{

	@Override
	public int compare(j02School o1, j02School o2) {
		
		return o1.sname.compareTo(o2.sname);
	}

	

}
