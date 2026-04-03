package FrequencyCount;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "tea";
        String t = "eat";

        System.out.println("Valid Anagrams " + isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        int count[] = new int[26];

        for(int i=0;i < s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        //check for the character counts in string t with the count array
        for(int j=0;j < 26;j++){
            if(count[j] != 0){
                return false;
            }
        }
        return true;
    }
}
