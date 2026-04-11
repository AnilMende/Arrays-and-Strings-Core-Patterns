package FrequencyCount;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String strs[] = {"eat", "tea", "tan","ate","nat", "bat"};

        System.out.println(groupAnagrams(strs));

    }

    static List<List<String>> groupAnagrams(String strs[]){

        List<List<String>> result = new ArrayList<>();

        boolean visited[] = new boolean[strs.length];

        for(int i=0;i < strs.length;i++){

            if(visited[i]){
                continue;
            }

            String s = strs[i];
            List<String> list = new ArrayList<>();
            list.add(s);
            visited[i] = true;

            for(int j = i+1; j < strs.length;j++){

                String t = strs[j];

                if(!visited[j] && isAnagram(s,t)){
                    list.add(t);
                    visited[j] = true;
                }
            }

            result.add(list);

        }

        return result;
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

        for(int ind = 0;ind < 26;ind++){
            if(count[ind] != 0){
                return false;
            }
        }

        return true;
    }
}
