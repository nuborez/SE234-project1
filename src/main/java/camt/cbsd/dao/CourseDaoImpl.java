package camt.cbsd.dao;

import camt.cbsd.entity.Course;
import camt.cbsd.repository.CourseRepository;
import jersey.repackaged.com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dto on 07-Apr-17.
 */
@Repository
public class CourseDaoImpl implements CourseDao {
    CourseRepository courseRepository;
    List<Course> courses;

    public CourseDaoImpl(){
        courses = new ArrayList<>();
        courses.add(new Course());
        courses.add(new Course());
    }

    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course add(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> list() {
        return Lists.newArrayList(courseRepository.findAll());
    }

    @Override
    public int size() {
        return (int) courseRepository.count();
    }


}
