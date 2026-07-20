public class Demo5 {
    public static void main(String[] args) {
        // Direction[] directions = Direction.values(); // return array of all directions
        // for (Direction direction : directions) {
        //     System.out.println(direction.name());
        // }

        Direction d = Direction.valueOf("EAST");
        System.out.println(d);

        System.out.println(d.ordinal());
        
    }
}

// values() --> compiler generated // we can iterate in this enum
// valueOf() --> compiler generate // Convert string into an enum constant
// name() --> gives name of Enum Object, can't be overriden
// toString() --> does same thing as name(), but can be overriden
// ordinal() --> give index of enum object
// every other methods of Object class
// we can't extends any class in enum as it already implements Enum class, but we can implement interfaces
enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST;

    @Override
    public String toString() {
    return (this.name() + " Direction");
    }
}