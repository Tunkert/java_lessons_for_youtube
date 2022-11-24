public class Student extends Teacher {
    // inheritance
    private int ID; // encapsulation

    public Student(String fullName, int age, double GPA) {
        super(fullName, age, GPA);
    }

    // setter
    public void setID(int newID) {
        this.ID = newID;
    }

    // getter
    public int getID() {
        return ID;
    }
}
