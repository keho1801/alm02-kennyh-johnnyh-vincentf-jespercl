/*
 */

package pack;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kenny
 */
public class PersonTest {

    Person person = new Person("Kenny","Hoang","male");
    
    @Test
    public void test1(){
        assertEquals("kenny",person.getName());
    }
}
