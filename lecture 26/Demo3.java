public class Demo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Aditya");
        sb.append(" Ray");
        sb.append("aaaaaaa");

        // System.out.println(sb);

        // sb.insert(2, 'o');

        // System.out.println(sb);

        // sb.delete(0/*inclusive */, 2/*exclusive */);

        // System.out.println(sb);

        // sb.deleteCharAt(0);

        // System.out.println(sb);

        // sb.replace(0, 4, "Aditya");
        // System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);

        // sb.charAt(1);
        // sb.setCharAt(0, 'B');
        // System.out.println(sb);

        // System.out.println(sb.length());
        System.out.println(sb.capacity());

        // sb.ensureCapacity(100);
        // System.out.println(sb.capacity());

        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}