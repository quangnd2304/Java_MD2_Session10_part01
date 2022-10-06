package ra;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSetDemo {
    public static void main(String[] args) {
        Student firstStudent = new Student("SV001", "Nguyen Van A", 20);
        Student secondStudent = new Student("SV002", "Nguyen Van B", 18);
        Student thirdStudent = new Student("SV003", "Nguyen Van C", 22);
        //Khoi tao danh sach tu Set Interface va HashSet Class
        Set<Student> setStudent = new HashSet<>();
        setStudent.add(firstStudent);
        setStudent.add(secondStudent);
        setStudent.add(thirdStudent);
        setStudent.add(firstStudent);
        for (Student st : setStudent) {
            System.out.println(st.toString());
        }
    }
}
