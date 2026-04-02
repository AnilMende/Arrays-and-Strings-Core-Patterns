package SlidingWindow;

import java.util.HashMap;

public class LongestSubstingWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String s = "accabcdabc";

        System.out.println("Longest Substring is " + maxLength(s));
    }

    //we need to find the substring without repeating characters
    //in that substring the occurrences of all the characters should be equal to 1
    //when a substring contains repeating character then it is invalid substring
    static int maxLength(String s){

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxlen = 0;
        //right is to iterate over the string s
        //and add the character at right to map to it's index
        for(int right = 0;right < s.length();right++){

            if(map.containsKey(s.charAt(right))){
                //if the character is already in the map
                //then left will be the characters previous index + 1
                //we are using the Math.max(previousind + 1, left)
                //because if there are multiple occurences of a character then
                // we have to move to the latest index + 1 that is max index of character
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }

            map.put(s.charAt(right), right);

            //map does not contain the character then we are int the valid substring
            //so max length is the current substring length
            maxlen = Math.max(maxlen, right -  left + 1);
        }

        return maxlen;
    }
}
