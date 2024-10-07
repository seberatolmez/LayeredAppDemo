import business.CourseManager;
import core.logginng.DatabaseLogger;
import core.logginng.FileLogger;
import core.logginng.Logger;
import core.logginng.MailLogger;
import dataAccess.HibernateCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new FileLogger(),new MailLogger(),new DatabaseLogger()};
        Course course1 = new Course("Java Tutorial",1000,new Category());
        
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course1);

        System.out.println(course1.getName());
    }
}