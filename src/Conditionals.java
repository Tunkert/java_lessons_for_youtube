public class Conditionals {
    public static void main(String[] args) {
        boolean isTeacher = true;
        if (isTeacher) {
            System.out.println("Tim is a teacher");
        } else {
            System.out.println("Tim is not a teacher.");
        }

        // we can also have else if
        boolean isProgrammer = true;
        boolean isDoctor = false;
        if (isDoctor) {
            System.out.println("Tim is a doctor.");
        } else if (isDoctor && isProgrammer) {
            System.out.println("Tim is a doctor and a programmer.");
        } else if (isTeacher && isProgrammer) {
            System.out.println("Tim is a teacher and a programmer.");
        } else {
            System.out.println("Tim is a teacher.");
        }
    }
}
