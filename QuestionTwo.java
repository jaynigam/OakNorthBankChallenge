import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class QuestionTwo {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] pierArray = line.split(" ");
		ArrayList<Integer> resultingArray = new ArrayList<Integer>();
	      for(int i=0; i<pierArray.length; i++) {
	    	  resultingArray.add(Integer.parseInt(pierArray[i]));
	      }
		
		/* find the maximum no of soldiers */
	    int totalSoldiersSaved = 0;
	    int noToRemove = 0;
	    
	    while(!resultingArray.isEmpty()) {
	    	noToRemove = soldiersSaved(resultingArray);
	    	totalSoldiersSaved += noToRemove;

	    	if(noToRemove!=0) {
	    		resultingArray.remove((Object)noToRemove);
	    		resultingArray.remove((Object)(noToRemove-1));
	    		resultingArray.remove((Object)(noToRemove+1));
	    	}
	    }
		System.out.println( totalSoldiersSaved);
	}
	
	public static int soldiersSaved(ArrayList<Integer> arr) {
		int maxSoldiers = maximumNo(arr);
		return maxSoldiers;
	}
	
	public static int maximumNo(ArrayList<Integer> arr) {
		int maxCount = 0;
		Collections.sort(arr);
		maxCount = arr.get(arr.size()-1);
		return maxCount;
	}
}
