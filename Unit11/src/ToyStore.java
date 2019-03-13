//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		int count = 0;
		for (int i=0;i<toyList.size();i++) {
			if (toyList.get(i).getName().equals(toys)) {
				toyList.get(i).setCount(toyList.get(i).getCount() + 1);
				count++;
			}
		}
		if (count == 0) {
			Toy newToy = new Toy(toys);
			toyList.add(newToy);
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		int number = 0;
  		for (int i=0;i<toyList.size();i++) {
  			if (toyList.get(i).getName().equals(nm)) {
  				number = i;
  			}
  		}
  		return toyList.get(number);
  	}
  
  	public String getMostFrequentToy()
  	{
  		String name = "";
  		int count = 0;
  		
  		for (int i=0;i<toyList.size();i++) {
  			if (toyList.get(i).getCount() > count) {
  				count = toyList.get(i).getCount();
  				name = toyList.get(i).getName();
  			}
  		}
  		return name;
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
		String output = "[]\n[";
		
	   for (int i=0;i<toyList.size();i++) {
		   output = output + toyList.get(i).getName() + " " + (toyList.get(i).getCount()+1) + " ";
	   }
	   output = output + "]\n" + "max = " + getMostFrequentToy();
	   return output;
	}
}