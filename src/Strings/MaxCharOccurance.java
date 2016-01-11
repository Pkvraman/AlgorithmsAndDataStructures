package Strings;
//string count occurance

class MaxCharOccurance {
    public static void main(String[] args) {
        String s = "My name is praveen is and My hobby is is sport";
        System.out.println(maxOccurance(s));
    }


    private static String maxOccurance(String string) {
        int count[] = new int[string.length()];
        String[] array = string.split("\\s");
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                String match = array[j];
                if (match.equals(array[i])) {
                    count[j]++;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int k = 0; k < count.length; k++) {
            if (count[k] > max) {
                max = count[k];
                index = k;
            }

        }
        return array[index];
    }
}
