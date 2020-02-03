package Mjuk19_package;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    @Test
    public void examokTest(){
        Employee emp1= new Employee("azmat", "noor",45,1000);
        String expected = "azmat";
        assertEquals(expected,emp1.getFirstName());

        String expected1 = "noor";
        assertEquals(expected1,emp1.getLastName());

    }
}
