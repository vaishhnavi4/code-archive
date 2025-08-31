public class HashShift {

    public void moveHash(String str, int n) {

        String str1 = "";
        String str2 = "";

        for (int i = 0; i < n; ++i) {

            if (str.charAt(i) == '#')
                str1 = str1 + str.charAt(i);
            else
                str2 = str2 + str.charAt(i);
        }

        String res = str1.concat(str2);

        System.out.println(res);
    }

    public static void main(String[] args) {

        HashShift h = new HashShift();

        String str = "Move#Hash#to#Front";
        int n = str.length();
        h.moveHash(str, n);

        /* Siya ka Approach */

        // String str = "##move#";
        // int n = str.length();
        // int size = 0;

        // char[] a = new char[n];
        // int i;

        // for (i = 0; i < n; i++) {
        // if (str.charAt(i) == '#') {
        // a[size++] = str.charAt(i);
        // }
        // }
        // for (i = 0; i < n; i++) {
        // if (str.charAt(i) != '#') {
        // a[size++] = str.charAt(i);
        // }
        // }
        // for (int j = 0; j < size; j++) {
        // System.out.print(a[j]);
        // }

    }

}

/*
 * You have write a function that accepts, a string which length is “len”, the
 * string has some “#”, in it you have to move
 * all the hashes to the front of the string and return the whole string back
 * and print it.
 * char* moveHash(char str[],int n);
 * 
 * Example :-
 * Sample Test Case
 * 
 * Input:
 * Move#Hash#to#Front
 * 
 * Output:
 * ###MoveHashtoFront
 * 
 */
