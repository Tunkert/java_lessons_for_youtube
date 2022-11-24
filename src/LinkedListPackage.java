import java.util.LinkedList;

public class LinkedListPackage {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Tim");
        names.add("Sarah");
        names.add("Sean");
        System.out.println(names);
        names.addFirst("Joe");
        names.addLast("Aaron");
        System.out.println(names);

        // a LinkedList is more efficient at certain things like first and last items in a list
    }
}
