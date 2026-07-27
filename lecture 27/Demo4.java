public class Demo4 {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("name: ", 11);

        System.out.println(p1.first + ", "+ p1.second);
    }
}

// Generic
class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second){
        this.first =  first;
        this.second =  second;
    }
}