package task_02;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Alex on 08.05.2015.
 */
public class TestMainJSON {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd' 'HH:mm:ss").create();

        Student student = new Student(1, "Vasja", 23, "21655569");
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
