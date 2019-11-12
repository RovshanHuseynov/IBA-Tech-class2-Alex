package lesson12;

public class OddEvenCheck {

    public static void main(String[] args) {

        int N=8;

        if((N&1)==0) {
            System.out.println("first bit 0 -> Number is Even");

        } else {
            System.out.println("first bit 1 -> Number is Odd");

        }
        /* Explanation

        and
     N  0000 1000 -> 8
        0000 0001 -> 1
        ---------
        0000 0000 -> int 0

        and
     N  0000 0111 -> 7
        0000 0001 -> 1
        ---------
        0000 0001 -> int 1
         */
    }
}
