public class Main {
    public static void main(String[] args) {
        int a1 = 1010;

        char[] charArray = String.valueOf(a1).toCharArray();

        int minVal =Integer.MAX_VALUE;
        for (int i=0; i< charArray.length; i++){
            if (charArray[i]=='0'){
                minVal = Math.min(minVal, i);
            }
        }

        charArray[minVal] = '1';

        String string = new String(charArray);
        int i = Integer.parseInt(string, 2);


        System.out.println(i);

    }
}