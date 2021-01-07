import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setup(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student student1 = new Student(1, "Student One");
        student1.addGrade(90);

        cohortWithOne.addStudent(student1);

        Student student2 = new Student(2, "Student Two");
        student2.addGrade(98);
        student2.addGrade(95);

        Student student3 = new Student(2, "Student Three");
        student3.addGrade(99);
        student3.addGrade(92);

        cohortWithMany.addStudent(student2);
        cohortWithMany.addStudent(student3);
    }

    @Test
    public void testAddStudent() {
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());
        assertEquals(2, cohortWithMany.getStudents().size());
    }

    @Test
    public void testCurrentStudentList() {
        assertNotSame(cohortWithOne, cohortWithMany);
        assertSame(emptyCohort, emptyCohort);
    }

    @Test
    public void testAverageIsCorrect(){
        assertEquals(90.0, cohortWithOne.getCohortAverage(), 0);
        assertEquals(96.0, cohortWithMany.getCohortAverage(), 0);
    }

}
