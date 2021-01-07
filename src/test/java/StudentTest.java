import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student1;
    Student student2;

    @Before
    public void createStudent(){
        student1 = new Student(1, "Mace Windu");
        student1.addGrade(80);
        student1.addGrade(89);
        student1.addGrade(99);

        student2 = new Student(2, "Grogu");
        student2.addGrade(90);
        student2.addGrade(87);
        student2.addGrade(94);
    }

    @Test
    public void ifStudentHasId() {
        assertEquals(1, student1.getId());
        assertEquals(2, student2.getId());
    }

    @Test
    public void ifStudentHasName(){
        assertEquals("Mace Windu", student1.getName());
        assertEquals("Grogu", student2.getName());
    }


}
