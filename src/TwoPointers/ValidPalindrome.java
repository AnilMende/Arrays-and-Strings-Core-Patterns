package TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("mam"));
    }

    static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1 != ch2){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
