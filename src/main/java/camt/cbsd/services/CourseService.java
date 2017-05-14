package camt.cbsd.services;

import camt.cbsd.dao.CourseDaoImpl;
import camt.cbsd.entity.Course;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

/**
 * Created by Dto on 16-Apr-17.
 */
public interface CourseService {

    List<Course> list();
    Course add(Course course);
    int getCourseCount();
}
