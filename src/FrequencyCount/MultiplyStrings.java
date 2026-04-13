package FrequencyCount;

public class MultiplyStrings {
    public static void main(String[] args) {

        String s1 = "1234";
        String s2 = "2";

        int val1 = convertToNum(s1);
        int val2 = convertToNum(s2);

        int res = val1 * val2;

        System.out.println(convertToString(res));
    }

    static int convertToNum(String s){
        int num = 0;
        for(int i=0;i < s.length();i++){
            num = num * 10 + (s.charAt(i) - '0');
        }

        return num;
    }

    static String convertToString(int num){

        String result = "";

        while(num > 0){
            int digit = num % 10;
            result = (char)(digit + '0') + result;
            num = num / 10;
        }

        return result;
    }
}
