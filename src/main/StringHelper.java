/** A class that contains several methods for manipulating strings */
public class StringHelper {

    /**
     * Returns the number of vowels (letters a, e, i, o, u)
     * in a given string.
     * @param message
     * @return the number of vowels
     */
    public static int countVowels(String message) {
        int n = message.length();
        int k=0;
        for (int i=0;i<n;i++){
            if (message.charAt(i) == 'a' || message.charAt(i) == 'e' || message.charAt(i) == 'i' || message.charAt(i) == 'o' || message.charAt(i) == 'u')
                k=k+1;
        }
        return k;
    }

    /**
     * Returns the message encrypted using "Ceasar cipher"
     * with the given shift amount.
     *
     * If the shift is greater than 26 the method returns null.
     * If the message contains any characters that are not upper
     * or lower case letters the method returns null.
     *
     * Example: (abc, 2) -> cde
     * 'a' was shifted by two characters (became 'c'),
     * 'b' became 'd', 'c' became 'e'.
     * @param message
     * @param shift
     * @return
     * @author Prof. Rollins
     */
    public static String encrypt(String message, int shift) {
        if (shift>26){
            return null;
        }

        int n = message.length();
        for(int i=0;i<n;i++){
            char c = message.charAt(i);
            if ( !(    (   c>='a'&& c<='z'    )    ||   (    c>='A'&& c<='Z'   )  ) ){
                return null;
            }
        }

        for(int i=0;i<n;i++){
            char cx = message.charAt(i);
            cx = cx + shift;
            String new_mwssage = cx + message.substring(i+1,n);
        }

        return message;
    }

    /** Main method: runs methods of class StringHelper */
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Original string: " + s);
        System.out.println("Number of vowels: " + StringHelper.countVowels(s));
        System.out.println("After encrypting: " + StringHelper.encrypt(s, 3));
    }

}

