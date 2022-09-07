package staff.management;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Keith","JA34343C", 38000, "Teaching");
    }



    @Test
    public void hasName(){
        assertEquals("Keith", manager.getName());
    }


    @Test
    public void hasniNumber(){
        assertEquals("JA34343C", manager.getniNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(38000, manager.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2.0);
        assertEquals(76000, manager.getSalary(), 0.0);
    }

    @Test
    public void cannotRaiseSalary(){
        manager.raiseSalary( -2.0);
        assertEquals(38000, manager.getSalary(), 0.0);
    }


    @Test
    public void payBonus(){
        assertEquals(380 , manager.payBonus(), 0.00);
    }

    @Test
    public void setName(){
        manager.setName("bob");
        assertEquals("bob",manager.getName());
    }
    @Test
    public void setNoName(){
        manager.setName(" ");
        assertEquals("Keith",manager.getName());
    }
}