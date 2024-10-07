package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void addCategory(Category category) {
        System.out.println("Category added  with Hibernate"+category.getName());
    }

    @Override
    public void addCourse(Course course) {
        System.out.println("Course added with Hibernate"+course.getName());


    }
    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Instructor added with Hibernate"+instructor.getName());
    }
}
