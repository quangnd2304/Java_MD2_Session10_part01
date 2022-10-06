import ra.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //KHoi tao 1 danh sach sinh vien tu List Interface va ArrayList Class
        List<Student> listStudent = new ArrayList<>();
        List<Student> secondListStudent = new ArrayList<>();
        //Cac doi tuong sinh vien
        Student firstStudent = new Student("SV001", "Nguyen Van A", 20);
        Student secondStudent = new Student("SV002", "Nguyen Van B", 18);
        Student thirdStudent = new Student("SV003", "Nguyen Van C", 22);
        Student fourStudent = new Student("SV004", "Nguyen Van C", 19);
        Student fiveStudent = new Student("SV005", "Nguyen Van C", 21);
        //add cac doi tuong vao listStudent
        listStudent.add(firstStudent);
        listStudent.add(secondStudent);
        listStudent.add(thirdStudent);
        secondListStudent.add(fourStudent);
        secondListStudent.add(fiveStudent);

        //addAll
        listStudent.addAll(secondListStudent);
        //clear
//        listStudent.clear();
        System.out.println(listStudent.isEmpty());
        ;
        //contains
        System.out.println(listStudent.contains(fiveStudent));
        //equals
        System.out.println(listStudent.equals(listStudent));
        //Cach 1: Su dung Iterator de duyet cac phan tu
//        Iterator<Student> studentIterator = listStudent.iterator();
//
//        //In ra cac phan tu
//        while (studentIterator.hasNext()){
//            System.out.println(studentIterator.next().toString());;
//        }

        //remove(Object o)
        listStudent.remove(thirdStudent);
        listStudent.removeAll(secondListStudent);

        //size()
        System.out.println("So phan tu cua mang: " + listStudent.size());
        //toArray
        Object[] arrStudent = listStudent.toArray();
        //get(int index)
        //In ra thong tin sinh vien co chi so la 1 trong danh sach
        System.out.println(listStudent.get(1).toString());
        //IndexOf(Object o)
        System.out.println("Chi so cua doi tuong sinh vien SV001 trong danh sach: " + listStudent.indexOf(firstStudent));
        //set(int index, Object o): De vao vi tri index
        listStudent.set(1, thirdStudent);
        //add(int index, Object o): Chen vao vi tri index
        //subList(int fromIndex, int toIndex): cat danh sach tu chi so fromIndex den chi so <toIndex

        listStudent.add(1, fourStudent);
        //Cach 2: Duyet cac danh sach bang foreach
        for (Student student : listStudent) {
            System.out.println(student.toString());
        }
        List<Student> thirdListStudent = listStudent.subList(0, 2);
        System.out.println("THONG TIN DANH SACH SINH VIEN 3: ");
        for (Student st : thirdListStudent) {
            System.out.println(st.toString());
        }

        //Khoi tao danh sach thu tu ma chua tat ca du lieu cua danh sach 2
        List<Student> fourListStudent = new ArrayList<>(secondListStudent);
        System.out.println("THONG TIN DANH SACH SINH VIEN 4: ");
        for (Student st : fourListStudent) {
            System.out.println(st.toString());
        }
//        secondListStudent.add(3,firstStudent);
//        System.out.println("THONG TIN DANH SACH SINH VIEN 2: ");
//        for (Student st : secondListStudent) {
//            System.out.println(st.toString());
//        }



    }
}