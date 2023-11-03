package sortingGPA;

class Student {
    private int iDNumber;
    private double GPA;

    public Student(int iDNumber, double GPA) {
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", GPA=" + GPA +
                '}';
    }
}



