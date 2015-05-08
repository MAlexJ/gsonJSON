package task_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alex on 08.05.2015.
 */
public class Student {

    private int id;
    private String name;
    private int age;
    private Date date;

    public Student() {
    }

    public Student(int id, String name, int age, String date) {
        this.id = id;
        this.name = name;
        this.age = age;
        try {
            this.date= new SimpleDateFormat("yyyyMMdd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
