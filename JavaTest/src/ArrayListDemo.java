import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	String[] somethings = {"ganesh", "sagar", "rhutuja", "divya"};
	String[] morethings= {"ganesh", "sagar", "rhutuja", "blessing", "sonali"};
	List<String> list1 = new ArrayList<String>();
	List<String> list2 = new ArrayList<String>();
	
	public void addList()
	{
		for(String x: somethings)
		{
			list1.add(x);
		}
		for(String y: morethings)
		{
			list2.add(y);
		}
		
		for(String a: list1)
		{
			System.out.println("List 1: "+a);
		}
		System.out.println("----------------------------");
		for(String b: list2)
		{
			System.out.println("List 2: "+b);
		}
		
		editList(list1,list2);
		
		for(String a: list1)
		{
			System.out.println("List 1: "+a);
		}
		System.out.println("----------------------------");
		for(String b: list2)
		{
			System.out.println("List 2: "+b);
		}
		
		
	}
	public void editList(Collection<String> c1, Collection<String>c2)
	{
		Iterator<String> it1 = c1.iterator();
		Iterator<String> it2 = c2.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());;
			if(c2.contains(it1.next()))
			{
				//System.out.println("it1.next()"+it1.next()+"it1"+it1);
				it1.remove();
			}
		}
		while(it2.hasNext())
		{
			System.out.println(it2.next());;
			/*if(c2.contains(it.next()))
			{
				it.remove();
			}*/
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListDemo ar = new ArrayListDemo();
		ar.addList();
		
	}

}
