package business;

import core.logginng.Logger;
import dataAccess.ICourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private ICourseDao iCourseDao;
    private Logger[] loggers;
    private final List<Course> courses = new ArrayList<>();

    public CourseManager(ICourseDao iCourseDao, Logger[] loggers) {
        this.iCourseDao = iCourseDao;
        this.loggers = loggers;
    }
    public void add(Course course) throws Exception {
        for (Course c : courses) {
            if (c.getName().equals(course.getName())) {
                throw new Exception("Course name already exists");
            }
        }

        if (course.getPrice() < 0){
            throw new Exception("Course price cannot be negative");
        }

        iCourseDao.addCourse(course);
        courses.add(course);


        for (Logger logger : loggers) {
            logger.log(course.getName());
        }


    }

}

