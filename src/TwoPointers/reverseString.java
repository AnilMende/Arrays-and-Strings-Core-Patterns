package TwoPointers;

public class reverseString {
    public static void main(String[] args) {

        System.out.println(reverse("abcd"));
    }

    static String reverse(String s){
        int i = 0;
        int j = s.length() - 1;

        char ch[] = s.toCharArray();

        while(i <= j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        StringBuilder sb = new StringBuilder();

        for(int ind=0;ind < ch.length;ind++){
            sb.append(ch[ind]);
        }

        return sb.toString();
    }
}
