import java.util.ArrayList;

public class ArrayListPackage<S> {
    public static void main(String[] args) {
        // this array can be resized
        ArrayList<String> names = new ArrayList<String>();
        names.add("Tim");
        names.add("Sarah");
        names.add("Billy");
        System.out.println(names);

        // access the first item in the list
        System.out.println(names.get(0));
        // access the last item in the list
        System.out.println(names.get(names.size() - 1));
        // remove an item
        names.remove(0);
        // print the size after removal
        System.out.println(names.size());
        // change name in ArrayList
        names.set(1, "Tim");
        // print names
        System.out.println(names);
    }
}
