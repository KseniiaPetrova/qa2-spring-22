package hw;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LoopsHW {


    @Test
    public void loops2 (){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i + 1);
        }

        for (Integer i: numbers) {
            if (i % 2 == 0 && i / 2 == 4) {
                System.out.println(i);
            }
        }

        for (Integer i : numbers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public class Student {
        private String firstName;
        private String lastName;
        private Integer age;
        private String personalCode;
        private Integer courseNumber;

        public Student(String firstName, String lastName, Integer age, String personalCode, Integer courseNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.personalCode = personalCode;
            this.courseNumber = courseNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getPersonalCode() {
            return personalCode;
        }

        public void setPersonalCode(String personalCode) {
            this.personalCode = personalCode;
        }

        public Integer getCourseNumber() {
            return courseNumber;
        }

        public void setCourseNumber(Integer courseNumber) {
            this.courseNumber = courseNumber;
        }
    }

    @Test
    public void student () {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "Petrov", 22, "230500-45321", 3));
        students.add(new Student("Igor", "Perov", 23, "211299-45343", 4));
        students.add(new Student("Anna", "Vetrova", 21, "130501-33221", 2));
        students.add(new Student("Inga", "Durova", 22, "020500-42341", 3));
        students.add(new Student("Lola", "Ora", 19, "260503-31122", 1));

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(i + 1 + ". " + student.getFirstName() + " " + student.getLastName());
        }

        for (Student student : students) {
            if (student.getCourseNumber() == 3) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }
    }
}
