package AFewTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.matchesPattern;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSomWords {

    private String name;
    private String occupation;
    private String email;

    @BeforeEach
    public void setUp(){
        name = "Dave";
        occupation = "Web Developer";
        email = "dave@email.com";
    }

    @Test
    public void testNameLength(){
        assertTrue(name.length() < 100 && name.length() > 1);
    }

    @Test
    public void testOccupation(){
        assertThat(occupation, matchesPattern("\\W"));
    }
}
