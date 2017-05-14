package camt.cbsd;
import camt.cbsd.dao.CourseDaoImpl;
import camt.cbsd.entity.Course;
import camt.cbsd.entity.Student;
import camt.cbsd.entity.security.User;
import camt.cbsd.services.CourseServiceImpl;
import camt.cbsd.services.StudentServiceImpl;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import static org.hamcrest.core.Is.is;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 5/14/2017.
 */
public class StudentServiceImplTest {


    @Test
    public void TestGetUserName(){
        List<Course> courses = new ArrayList<>();
        StudentServiceImpl test = mock(StudentServiceImpl.class);
        when(test.getUsername("mitsuha")).thenReturn(new Student(1,"SE-001","Mitsuha","Miyamizu",2.15,"...",true,0,"beloved",courses,new User()));
        assertEquals(test.getUsername("mitsuha"),(new Student(1,"SE-001","Mitsuha","Miyamizu",2.15,"...",true,0,"beloved",courses,new User())));
        assertEquals(test.getUsername("nonuser"),null);
    }

    @Test
    public void TestQueryStudent(){
        List<Student> stuList = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();
        List<Student> testBlank = new ArrayList<>();
        List<Student> testquery = new ArrayList<>();

        testquery.add(new Student(1, "SE-001", "Mitsuha", "Miyamizu", 2.15, "...", true, 0, "The most beloved one", courseList, new User()));

        stuList.add(new Student(1, "SE-001", "Mitsuha", "Miyamizu", 2.15, "...", true, 0, "The most beloved one", courseList, new User()));
        stuList.add(new Student(2, "SE-002", "Prayuth", "The minister", 3.59, "...", false, 15,"The great man ever!!!!", courseList, new User() ));
        stuList.add(new Student(3, "SE-003", "Jurgen", "Kloop", 2.15, "...", true, 2,"The man for the Kop", courseList, new User()));

        StudentServiceImpl test = mock(StudentServiceImpl.class);
        when(test.queryStudent("")).thenReturn(stuList);
        when(test.queryStudent("Mitsuha")).thenReturn(testquery);


        assertEquals(test.queryStudent(""),stuList);
        assertEquals(test.queryStudent("Mitsuha"),testquery);
        assertEquals(test.queryStudent("nonfromabove"),testBlank);


    }
}
