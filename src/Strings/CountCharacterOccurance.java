package Strings;

class CountCharacterOccurance {
    public static void main(String[] args) {
        String s = "My name is praveen and My hobby is sport";
        System.out.println(countOccurance(s, "blah"));
    }


    private static int countOccurance(String string, String substring) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            if (substring.charAt(j) == string.charAt(i)) {
                j++;
            } else {
                j = 0;
            }
            if (j == substring.length()) {
                count++;
                j = 0;
            }
        }
        return count;
    }
}
