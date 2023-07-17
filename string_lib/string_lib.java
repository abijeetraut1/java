public class StringFunc {
    public static void main(String[] args) {

        // String length
        String str = " HelloWrold ";
        int length = str.length();
        System.out.println("String length : " + length);

        // String to upperCase
        String upperCaseString = str.toUpperCase();
        System.out.println("uppercase string : " + upperCaseString);

        // String Trim
        String trimmedString = str.trim();
        System.out.println("Trimmed string : " + trimmedString);

        // replace
        String replacedString = str.replace("H", "p");
        System.out.println("replaced H to P" + replacedString);

        // to lowercase
        String convertTolowerCase = str.toLowerCase();
        System.out.println("convert to lowercase" + convertTolowerCase);

        // Compare 2 String
        String s1 = "hello";
        String s2 = "world";
        int out = s1.compareTo(s2);
        System.out.println(out);

        // isEmpty
        String emptyString = "";
        System.out.println(emptyString.isEmpty());
    }
}
