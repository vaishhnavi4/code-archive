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
        String result = str1.concat(str2);
        System.out.println(result);
    }

    public static void main(String[] args) {

        HashShift h = new HashShift();

        String str = "Move#Hash#to#Front";
        int n = str.length();
        h.moveHash(str, n);

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
 */