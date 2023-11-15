package task1;

public class Group {
    private Student student;

    public Group() {
        this.student = new Student("", "", 0, null);
    }
    Student getFirst(){
        return student;
    }
    Student getLast(){
        Student st = this.student;
        while (st.getNext()!=null)
            st = st.getNext();
        return st;
    }
    public void insert(String name, String group, int age){
        if (this.getLast().getNext()==null) {
            this.getLast().setNext(new Student(name, group, age, null));
        }
        else{
            this.getLast().setNext(new Student(name, group, age, this.getLast().getNext()));
        }
    }

    public void deleteLast(){
        Student st = student;
        while (st.getNext().getNext()!=null){
            st = st.getNext();
        }
        st.setNext(null);
    }
    public boolean isEmpty(){
        return student.getNext() == null;
    }
    public void clear(){
        student.setNext(null);
    }

    @Override
    public String toString() {
        if (student.getNext() == null) return "В списке нет студентов";
        else {
            Student st = student.getNext();
            String str = "";
            do {
                str = str + st.toString() + "\n";
                st = st.getNext();
            } while (st != null);
            return str;
        }
    }
}