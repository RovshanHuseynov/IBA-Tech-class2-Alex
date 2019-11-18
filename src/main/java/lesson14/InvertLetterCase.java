package lesson14;

public class InvertLetterCase {

    public static void main(String[] args) {
        String str = "ABCiosF";
        System.out.println(str);

        int magicNumber = 1<<5; //->32

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<str.length(); i++){
            int digit = (int)str.charAt(i)^magicNumber;
            sb.append((char)digit);
        }

       /* for(int i=0; i<str.length(); i++){
            int digit = (int)str.charAt(i);
            if(digit>90) {
                digit = digit - 32;
                System.out.println(str.charAt(i)+" is in lower case");
            } else {
                digit = digit + 32;
                System.out.println(str.charAt(i)+" is in upper case");
            }

            sb.append((char)digit);


        }*/

        System.out.println(sb.toString());
    }
}
