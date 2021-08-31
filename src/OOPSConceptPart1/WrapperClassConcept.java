package OOPSConceptPart1;

public class WrapperClassConcept {
    public static void main(String[] args) {
        String s="100";
        System.out.println(s+20);

        // data conversion: String to int

        int i = Integer.parseInt(s);
        System.out.println(i+20);

        // String to double
        String str = "07.53";
        double d = Double.parseDouble(str);
        System.out.println(d+10);

        // string to boolean
        String s1 = "true";
        boolean b = Boolean.parseBoolean(s1);
        System.out.println(b);

        // int to String
        int a = 7;
        String s2 = String.valueOf(a);
        System.out.println(s2+10);

        // string to char
        String s3="M";
        char c = s3.charAt(0);
        System.out.println(c);

        String s4 = "102B"; // when we try to convert this string to int then it will throw NumberFormatException
        //int j = Integer.parseInt(s4);
        //System.out.println(j);
    }
}
