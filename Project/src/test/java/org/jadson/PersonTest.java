package org.jadson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * 
 * @author jadson
 *
 * <p><i>This program is distributed without any warranty and it
 * can be freely redistributed for research, classes or private studies, 
 * since the copyright notices are not removed.</i></p>
 *
 */
public class PersonTest {
	
	// Só queria ouvir uma do Bob Marley
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
