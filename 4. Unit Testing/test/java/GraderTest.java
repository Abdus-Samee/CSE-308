import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    public void creditThreeCheckForA(){
        var grader = new Grader();
        assertEquals("A", grader.calculateGrade(240, 3));
    }

    @Test
    public void creditThreeBoundaryCheckForA(){
        var grader = new Grader();
        assertEquals("A", grader.calculateGrade(239.5, 3));
    }

    @Test
    public void creditThreeCheckForB(){
        var grader = new Grader();
        assertEquals("B", grader.calculateGrade(239, 3));
    }

    @Test
    public void creditThreeBoundaryCheckForB(){
        var grader = new Grader();
        assertEquals("A", grader.calculateGrade(209.5, 3));
    }

    @Test
    public void creditThreeCheckForC(){
        var grader = new Grader();
        assertEquals("C", grader.calculateGrade(200, 3));
    }

    @Test
    public void creditThreeBoundaryCheckForC(){
        var grader = new Grader();
        assertEquals("A", grader.calculateGrade(179.5, 3));
    }

    @Test
    public void creditThreeCheckForF(){
        var grader = new Grader();
        assertEquals("F", grader.calculateGrade(179, 3));
    }

    @Test
    public void creditThreeBoundaryCheckForF(){
        var grader = new Grader();
        assertEquals("A", grader.calculateGrade(178.5, 3));
    }

    @Test
    public void creditThreeCheckForLessThanLB(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
           grader.calculateGrade(-241, 3);
        });
    }

    @Test
    public void creditThreeCheckForGreaterThanUB(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.calculateGrade(400.5, 3);
        });
    }

    @Test
    public void creditFourCheckForA(){
        var grader = new Grader();
        assertEquals("A", grader.calculateGrade(320, 4));
    }

    @Test
    public void creditFourBoundaryCheckForA(){
        var grader = new Grader();
        assertEquals("A", grader.calculateGrade(319.5, 4));
    }

    @Test
    public void creditFourCheckForB(){
        var grader = new Grader();
        assertEquals("B", grader.calculateGrade(319, 4));
    }

    @Test
    public void creditFourBoundaryCheckForB(){
        var grader = new Grader();
        assertEquals("A", grader.calculateGrade(279.5, 4));
    }

    @Test
    public void creditFourCheckForC(){
        var grader = new Grader();
        assertEquals("C", grader.calculateGrade(240, 4));
    }

    @Test
    public void creditFourBoundaryCheckForC(){
        var grader = new Grader();
        assertEquals("A", grader.calculateGrade(239.5, 4));
    }

    @Test
    public void creditFourCheckForF(){
        var grader = new Grader();
        assertEquals("F", grader.calculateGrade(239, 4));
    }

    @Test
    public void creditFourBoundaryCheckForF(){
        var grader = new Grader();
        assertEquals("A", grader.calculateGrade(238.5, 4));
    }
}
