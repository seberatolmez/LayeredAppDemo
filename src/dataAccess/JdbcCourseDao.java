package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcCourseDao implements ICourseDao {

    @Override
    public void addCourse(Course course) {
        System.out.println("Adding new course with JDBC: " + course.getName());

    }

    @Override
    public void addCategory(Category category) {
        System.out.println("Adding new category with JDBC: " + category.getName());

    }
    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Adding new instructor with JDBC: " + instructor.getName());
    }
}



