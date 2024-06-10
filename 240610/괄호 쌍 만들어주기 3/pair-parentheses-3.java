public class Main {
    public static void main(String[] args) {
        String str = ")(()())";
        char[] charArray = str.toCharArray();

        System.out.println(Main.solution(charArray));
    }

    private static Integer solution(char[] charArray) {
        int result =0;

        for (int i=0; i<charArray.length; i++){
            for (int j=i; j<charArray.length; j++){
                if (charArray[i] == '(' && charArray[j]==')'){
                    result ++;
                }
            }
        }

        return result;
    }

}