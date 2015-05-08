package task_01;

import com.google.gson.Gson;

/**
 * Created by Alex on 04.05.2015.
 */
public class TestMainJSON {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Student student = new Student(1, "Vasja", 23);
        System.out.println(">>>>>   Object -> task_01.Student");
        System.out.println(student);


        //toJSON
        System.out.println(">>>>>   toJSON");
        String json = gson.toJson(student);
        System.out.println(json);

        //fromJSON
        System.out.println("/>>>>   fromJSON");
        Student studentJSON = gson.fromJson(json, Student.class);
        System.out.println(studentJSON);


    }
}
