import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);

        // size
        // System.out.println(c.size());

        // System.out.println(c.isEmpty());
        // c.size() == 0

        // Boolean contains(Object o) --> 1, 2, 3 --> equals()
        // System.out.println(c.contains(2));


        // iterate() --> Iterator
        // Iterator i = c.iterator();

        // while (i.hasNext()) {
        //     System.out.println(i.next());
        // }

        // Object[] toArray();

        // Object[] obj = c.toArray();
        // for (Object object : obj) {
        //     System.out.println(object);
        // }

        // T[] toArray(T[] a);
        
        // Integer[] arr = c.toArray(new Integer[0]);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // boolean add(E e)

        // Boolean b = c.add(3);
        // System.out.println(b);

        // boolean remove(Object o)
        // System.out.println(c.remove(3));

        // for(Integer i: c){
        //     System.out.println(i);
        // }

        // boolean addAll(Collection<? extends E> c)
        // c.addAll(List.of(5, 6,7, 8, 9));

        // System.out.println(c);

        // boolean containsAll(Collection<?> c)
        // System.out.println(c.containsAll(List.of(1, 2, 3)));

        // boolean removeAll(Collection<?> c)
        // System.out.println(c.removeAll(List.of(1, 2, 3)));

        // booolean retainAll(Collection<?> c)
        // c.removeAll(List.of(1,2));
        // c.retainAll(List.of(1, 2));

        // System.out.println(c);


        // clear()
        c.clear();
        System.out.println(c);

        // equals(), hashCode()
    }
}

// add, remove, addAll, removeAll, retainAll, contains, containsAll, toArray
// iterator, size, isEmpty