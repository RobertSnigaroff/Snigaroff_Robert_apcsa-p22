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
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		Toy newToy = new Toy(toys);
		toyList.add(newToy);
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
  		int bigCount = 0;
  		int count = 0;
  		for (int i=0;i<toyList.size();i++) {
  			for (int j=0;j<toyList.size();j++) {
  				if (toyList.get(i) == toyList.get(j)) {
  					count++;
  				}
  			}
  			if (count > bigCount) {
  				bigCount = count;
  			}
  			count = 0;
  			
  		}
  		return toyList.get(bigCount).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
		String output = "[]\\n[";
		
	   for (int i=0;i<toyList.size();i++) {
		   output = output + toyList.get(i).getName() + " " + toyList.get(i).getCount();
	   }
	   output = output + "]\n" + "max = " + getMostFrequentToy();
	   return output;
	}
}