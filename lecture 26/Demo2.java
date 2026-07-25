public class Demo2 {
    public static void main(String[] args) {
        String s1 = new String("Aditya");
        String s2 = new String("abd");

        // length/emptiness
        // System.out.println(s1.length());
        // System.out.println(s1.isEmpty()); // false
        // System.out.println(s1.isBlank()); // false

        // Character access
        // System.out.println(s1.charAt(2));
        // char[] arr = s1.toCharArray(); // {'A', 'd', 'i', 't', 'y', 'a'}

        // Comparison
        // System.out.println(s1.equals(s2));// String have override equals method which compares value of string not reference which it usually does

        // System.out.println(s1.equalsIgnoreCase(s2));
        
        // Lexicographical Comparison
        // System.out.println(s1.compareTo(s2));
        

        // Searching
        // System.out.println(s1.contains("itya"));
        // System.out.println(s1.indexOf("ity"));
        // System.out.println(s1.lastIndexOf("ity"));
        // System.out.println(s1.startsWith("ad"));
        // System.out.println(s1.endsWith("a"));


        // Extraction or Transformation

        // System.out.println(s1.substring(1/*inclusive */, 6 /*exclusive */));
        // System.out.println(s1.toUpperCase());
        // System.out.println(s1.toLowerCase());
        // System.out.println(s1.trim());
        // System.out.println(s1.strip()); // unicode friendly
        // System.out.println(s1.repeat(3));
        // System.out.println(s1.replace("ity", "abc"));
        // System.out.println(s1.replaceAll("a", "l"));

        // String s3 = "Aditya-Rohit-Rohan";
        // String arr[] = s3.split("-");
        // for (String string : arr) {
        //     System.out.println(string);
        // }

        // System.out.println(String.join("-", "a", "b", "c"));


        // Conversion
        // String s4 = new String(String.valueOf(10));
        // byte arr[] = s1.getBytes();
        // for(byte i: arr){
        //     System.out.print(i+", ");
        // }

        // Advance -> intern(), format()
        String s5 = new String("Hello");
        String s6 = s5.intern();

        // System.out.println(s5 == s6); // false

        // format
        String name ="Aditya";
        int age = 18;
         
        // Hello Aditya, your age is 18

        // System.out.println("Hello" + " " + name+ ", "+ "your age is "+ age);
        System.out.println(String.format("Hello %s, your age is %s", name, age));
    }
}

// compareTo() --> -ve, 0, +ve

/*
String Pool: "Hello" <- s6
Heap: s5 -> "Hello" 

*/