package ra;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> linkedListStudent = new LinkedList<>();
        Student firstStudent = new Student("SV001", "Nguyen Van A", 20);
        Student secondStudent = new Student("SV002", "Nguyen Van B", 18);
        Student thirdStudent = new Student("SV003", "Nguyen Van C", 22);
        Student fourStudent = new Student("SV004", "Nguyen Van C", 19);
        Student fiveStudent = new Student("SV005", "Nguyen Van C", 21);
        linkedListStudent.add(firstStudent);
        linkedListStudent.add(secondStudent);
        linkedListStudent.add(thirdStudent);
        linkedListStudent.addFirst(fourStudent);
        linkedListStudent.addLast(fiveStudent);
        linkedListStudent.removeFirst();
        for (Student st : linkedListStudent) {
            System.out.println(st.toString());
        }
    }
}
