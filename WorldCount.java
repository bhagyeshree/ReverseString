import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


public class WorldCount {
	
	public static void main(String[] args) throws  IOException {
		
		//create input stream and scanner 
		
		FileInputStream file = new FileInputStream("//Users//shree//Documents//workspace//CoreJava//src//readwords.txt");
		
		Scanner fileInput = new Scanner(file);
		
		//create the array list type string 
		
		ArrayList<String> words = new ArrayList<String>();
		
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		
		//read throw file find the word
		while(fileInput.hasNext()){
			//get the next word
			String nextWord = fileInput.next();
			
			//Determine if the word is in the ArrayList
			//if the word is availabe  increment by 1 if we didnt find word set it to one add it as a new index
			
			if(words.contains(nextWord)){
				int index = words.indexOf(nextWord);
				count.set(index, count.get(index ) + 1);
			}
			else{
				words.add(nextWord);
				count.add(1);
			}
			

		}
		
		//close
		fileInput.close();
		file.close();

		
		//print out the results 
		for(int i=0; i < words.size(); i++)
		{
			System.out.println(words.get(i) + " occurred :  " +count.get(i) + " times(s) : ");
		}
		

	}
	


}
