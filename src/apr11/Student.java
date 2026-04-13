package apr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Student {

    private final String name;
    private final Integer studentId;
    private final List<String> phoneNos;

    public Student(String name, Integer studentId, List<String> phoneNos) {
        this.name = name;
        this.studentId = studentId;
        this.phoneNos = phoneNos;
    }

    public String getName() {
        return name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public List<String> getPhoneNos() {
        return new ArrayList<>( phoneNos);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(studentId, student.studentId) && Objects.equals(phoneNos, student.phoneNos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, phoneNos);
    }
}
