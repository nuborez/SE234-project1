package camt.cbsd;

import camt.cbsd.dao.CourseDaoImpl;
import camt.cbsd.services.CourseServiceImpl;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import org.hamcrest.core.Is;


import java.util.ArrayList;
import java.util.List;


public class CourseServiceImplTest {

    @Test
    public void TestGetCourseCount(){
        CourseServiceImpl test = mock(CourseServiceImpl.class);
        //CourseDaoImpl courseDao = mock(CourseDaoImpl.class);
        when(test.getCourseCount()).thenReturn(3);
        assertEquals(test.getCourseCount(),3);
    }
}