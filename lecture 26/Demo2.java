public class Demo2 {
    public static void main(String[] args) {
        String s1 = new String("Aditya");
        // length/emptiness
        // System.out.println(s1.length());
        // System.out.println(s1.isEmpty()); // false
        // System.out.println(s1.isBlank()); // false

        // Character access
        System.out.println(s1.charAt(2));
        char[] arr = s1.toCharArray(); // {'A', 'd', 'i', 't', 'y', 'a'}
        
    }
}