package Strings;

public class StringLibrary {
    public static void main(String[] args) {
        String s = "abc d e f";
        System.out.println(removeWhiteSpaces(s));
        System.out.println(removeElement(s.toCharArray(), 2));
        String str = "my name is abc        ";
        System.out.println(replaceAll(str, "%20"));
        System.out.println(replaceAll(str, "abc", "prashanth"));
        System.out.println(replaceAllNew(str, "abc", "prashanthddd"));
    }


    private static String replace(String s, String r, String p) {
        char h='h';
        char j='i';
        char[] result = new char[s.length()];
        int count =0;
        for(int i=0;i<s.length()-1;) {
            if(s.charAt(i)==h && s.charAt(i+1)==j) {
                result[count]='\0';
                result[count+1]='\0';
                count=count+2;
                i=i+2;
            } else {
                result[count]=s.charAt(i);
                count++;
                i++;
            }
        }
        return String.valueOf(result);
    }

    private static String removeWhiteSpaces(String s) {
        char[] a = s.toCharArray();
        int count = 0;
        for(int j=0;j<a.length;j++) {
            if(a[j]!=' ') {
                a[count]=a[j];
                count++;
            }
        }
        for(int j=count;j<a.length;j++)
            a[j]=' ';

        return String.valueOf(a);
    }


    public static String removeElement( char[] arr, int remIndex ) {
        for ( int i = remIndex ; i < arr.length - 1 ; i++ ) {
            arr[ i ] = arr[ i + 1 ] ;
        }
        arr[arr.length-1]=' ';
        return String.valueOf(arr);

    }
    public static String replaceAll(String s, String r) {
        int spaceCount = 0;
        int index;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        index = s.length()+2*spaceCount;
        char[] str=new char[index];
        // System.out.println(newstr);
        str[index-1] = '\0';
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index-1] = s.charAt(i);
                index--;
            }
        }
        return String.valueOf(str);
    }

    public static String replaceAll(String s, String r, String p) {
        StringBuilder sb= new StringBuilder();
        String[] a=s.split(" ");
        for(int i=0;i<a.length;i++) {
            if(a[i].equals(r) || a[i].contains(r)) {
                String leftover=a[i].substring(r.length());
                sb.append(p);
                sb.append(leftover);
                sb.append(" ");
            } else {
                sb.append(a[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String replaceAllNew(String s, String r, String p) {
        String[] a=s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<a.length;i++) {
            if(a[i].equals(r)) {
                a[i]=p;
            }
            sb.append(a[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
