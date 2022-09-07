package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
    director = new Director("Andrew", "EF4t34T", 100000,"Leadership",50);

    }

    @Test
    public void getBudget() {
        assertEquals(50 , director.getBudget(),0.00);
    }

    @Test
    public void payBonus(){
        assertEquals(2000, director.payBonus(), 0.00);
    }
}