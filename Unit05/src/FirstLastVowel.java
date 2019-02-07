//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Robert Snigaroff
//Date - 02/07/19


public class FirstLastVowel
{
   public static String go( String a )
	{
	  String[] vowels = {"i","e","a","o","u","A","E","I","O","U"};
	  String ans = "";
	  for (int i=0;i<vowels.length;i++) {
		  
	   if (a.substring(0,1).equals(vowels[i]) || a.substring(a.length()-1).equals(vowels[i])) {
		  ans = "yes";
		  break;
	   }
	   else {
		  ans = "no";
	   }
	   
	  }
	  return ans;
	}
}
