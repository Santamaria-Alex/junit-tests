import org.junit.*;
import static org.junit.Assert.*;

public class CohortTest {

    private Cohort cohort;
    private Student stud;
    private Student jenn;
    private Student jim;

    @Before
    public void setUp(){
        this.cohort = new Cohort();
        this.stud = new Student(1, "Stud Body");
        this.jenn = new Student(12, "Jenn Ann Hologram");
        this.jim = new Student(7, "Jim Johnly");
    }

    @Test
    public void testAddStudent(){
        Cohort cohort = new Cohort();
        cohort.addStudent(jim);
        assertEquals(1, cohort.getStudents().size());
        cohort.addStudent(jenn);
        assertEquals(2, cohort.getStudents().size());
        cohort.addStudent(stud);
        assertEquals(stud, cohort.getStudents().get(2));
    }

    @Test
    public void testGetStudents(){
        Cohort cohort = new Cohort();
        cohort.addStudent(new Student(7, "Jim Johnly"));
        cohort.addStudent(new Student(7, "Jim Johnly"));
        cohort.addStudent(new Student(7, "Jim Johnly"));
        assertEquals(3, cohort.getStudents().size());
        assertEquals("Jim Johnly", cohort.getStudents().get(0).getName());

    }

    @Test
    public void testGetCohortAverage(){
        Cohort cohort = new Cohort();
        Student stud = new Student(1, "Stud Body");
        stud.addGrade(50);
        stud.addGrade(75);
        stud.addGrade(25);
        Student jenn = new Student(12, "Jenn Ann Hologram");
        jenn.addGrade(100);
        jenn.addGrade(100);
        jenn.addGrade(100);
        cohort.addStudent(stud);
        cohort.addStudent(jenn);
        assertEquals(75, cohort.getCohortAverage(), 0);
    }

}
