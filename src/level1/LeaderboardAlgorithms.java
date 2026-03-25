package level1;

import java.util.ArrayList;

/**
 * STUDENT TODO FILE
 *
 * You will implement sorting and binary search for the Leaderboard Terminal.
 */
public class LeaderboardAlgorithms {

    /**
     * TODO: Sort the list by score DESCENDING (highest score first).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     * - You may use Collections.sort + Comparator for the first version.
     * - Week 8 challenge/extra credit: replace with merge sort or quicksort.
     */
    public static void sortByScoreDescending(ArrayList<ScoreEntry> list) {
    	//selection sort
    	//this outer loop resizes the list as it is sorted (ignoring sorted values)
        for(int i = 0; i < list.size() - 1; i++) {
        	//assuming current position is (i)  the max
        	int maxIndex = i;
        	//loop scans the remaining list to find the greatest value
        	for(int j = i + 1; j < list.size(); j++) {
        		//comparing the score (j) with the current max position/value
        		// '>' '<' dictates whether the list is in ascending or descending order
        		if (list.get(j).getScore() > list.get(maxIndex).getScore()) {
        			//once you find that higher value you now hold that position as the max
        			maxIndex = j;
        		}
        	}
        	// after checking the list we swap the largest found score with the score at the current position(i)
        	ScoreEntry temp = list.get(maxIndex); //saves the highest score temp
        	list.set(maxIndex, list.get(i));//puts the smaller score at the back of the list
        	list.set(i, temp);// places the high score in the front of the list
        }
    }

    /**
     * TODO: Sort the list by username ASCENDING (A -> Z).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     */
    public static void sortByUsernameAscending(ArrayList<ScoreEntry> list) {
        // TODO
    	//for (int i = 1; i < numbers.length; i++) {
    	for (int i = 1; i < list.size(); i++) {
    		int j = i; 
    		//insert number[i] into sorted part
    		//stopping once numbers[i] in correct position 
    		//while (j > 0 && numbers[j] < numbers[j -1]) 
    		while (j > 0 && list.get(j).getUsername().compareToIgnoreCase(list.get(j - 1).getUsername()) < 0) {
    			
    			//Swap numbers[j] and numbers [j - 1]
    			//int temp = numbers[j];
    			ScoreEntry temp = list.get(j);
    			//numbers[j] = numbers [j - 1];
    			list.set(j, list.get(j - 1));
    			//numbers[j - 1] = temp;
    			list.set(j-1,  temp);
    			j--;
    		}
    	}
    
    }

    /**
     * TODO: Binary search for an EXACT username match.
     *
     * Precondition: list must already be sorted by username ascending!
     *
     * @return index of the matching entry, or -1 if not found
     */
    public static int binarySearchByUsername(ArrayList<ScoreEntry> list, String username) {
        //'low' and 'high' variables used to define the scope of my list
    	int low = 0;
    	int high = list.size() - 1; 
    	
    	//as long as were within the scope of the list continue through the list
    	while( low <= high) {
    		//find the mid point of our list(typical binary search low + high/ 2) for integers
    		//but using strings and looking out for scope errors
    		int mid = low +(high - low) / 2; 
    		String midUser = list.get(mid).getUsername();
    		
    		//comparing our midpoint will return 0 if they are equal,
    		//negative if mid comes before target and positive if after 
    		int comparison = midUser.compareTo(username);
    		//check if we found a match
    		if(comparison == 0) {
    			return mid;
    		}
    		//if midUser comes before target username alphabetically
    		if (comparison < 0) {
    			low = mid + 1;// searches the right half of list 
    		}
    		//if target comes after target username alphabetically
    		else {
    			high = mid - 1;//searches the left half of list
    		}
    		//with every iteration list is cut in half
    	}
    	// if we dont find target in list 
        return -1;
    }
    
    
    public static int binarySearchByScore(ArrayList<ScoreEntry> list, int targetScore) {
    	//defining 'low' and 'high' giving us a range to search through
    	int low = 0;
    	int high = list.size() - 1;
    	//finding our midpoint within our defined scope
    	while(low <= high) {
    		//typically written (low + high) / 2 for binary 
    		//but addressing overflow errors
    		int mid = low + (high - low) / 2;
    		int midScore = list.get(mid).getScore();
    		//checking if our mid is our targt value
    		if(midScore == targetScore) {
    			return mid;
    		}
    		//if mid is GREATER than our target than we assume
    		//our target must be further into the list(higher index)
    		if (midScore > targetScore) {
    			low = mid + 1;
    		}
    		//if the mid is LESS than our target, than we assume 
    		//our target must be closer to the front of the list(lower index)
    		else {
    			//narrowing search to the left
    			high = mid - 1;
    		}
    		//after every iteration, our list(search range) is cut in half
    	}
    	//once 'low' passes 'high' and we didnt find our target
    	return -1;
    }
}
