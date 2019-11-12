package lesson12;

public class DecimalToBinary {

    public static void main(String[] args) {

        byte n = 8; //-> has 8 bits
        StringBuffer output = new StringBuffer();

        for(int i=7; i>=0; i--) { //that is why iterates 8 times with right shift >>
            int bit = (n>>i)&1;
            output = output.append(bit);
        }

        System.out.println("Bin of "+n+" is:"+output.toString());
    }
}
