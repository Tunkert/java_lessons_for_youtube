public class ObjectOrientedStuff {
    public static void main(String[] args) {
        Teacher tim = new Teacher("Timothy Unkert", 46, 4.0);

        // use the class and print attributes out
        System.out.println(tim.tName);
        System.out.println(tim.tAge);
        System.out.println(tim.tGPA);

        Student joe = new Student("Joe", 47, 2.0);
        joe.setID(1);
        System.out.println(joe.getID());
        // we can't do joe.ID = 2;
        // we also can't print joe.ID (we can't access it).

        // if you just use a getter you can't change the id
        // if you just use a setter you can only write the id but can't read it
    }
}
