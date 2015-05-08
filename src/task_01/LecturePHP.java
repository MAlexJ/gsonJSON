package task_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 04.05.2015.
 */
public class LecturePHP {

    private Map<Integer, Student> mapStudent = new HashMap<>();


    public Collection<Student> getStudentList() {
        return mapStudent.values();
    }

    public void setMapStudent(Integer id, Student student) {
        if (id < 0 & student == null) {
            throw new IllegalArgumentException(">>>>>>>>>> public void setMapStudent(Integer id, task_01.Student student) ->>>>  id < 0 & student == null ");
        }

        this.mapStudent.put(id, student);
    }
}
