import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // System.out.println(list.get(1));

        // list.set(1, 5);

        // list.addAll(0, List.of(9, 8, 7));

        // System.out.println(list);

        // list.remove(0);
        // System.out.println(list);

        // System.out.println(list.indexOf(1));
        // System.out.println(list.lastIndexOf(2));

        // ListIterator<Integer> it = list.listIterator(3);

        // while(it.hasPrevious()){
        //     System.out.println(it.previous());
        // }

        List<Integer> l = List.of(1,2,3,4,5,6,7,8); // immutable
        // l.add(9); // UnsupportedOperationException

        List<Integer> l2 = List.copyOf(l); // immutable
        l2.add(12); // UnsupportedOperationException


        System.out.println(l2);
    }
}

// 1, 2, 3