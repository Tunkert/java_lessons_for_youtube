public class NestedClasses {
    public static class Teacher {
        String tName;
        int age;

        public Teacher(String name, int age) {
            this.tName = name;
            this.age = age;
        }
    }
    public static void main(String[] args) { // need to leave out static
        NestedClasses.Teacher tim = new Teacher("Timothy Unkert", 46);
        System.out.println(tim.tName + " is " + Integer.toString(tim.age) + " years old.");
    }
}
