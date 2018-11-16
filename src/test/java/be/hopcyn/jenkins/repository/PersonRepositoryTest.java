package be.hopcyn.jenkins.repository;

import be.hopcyn.jenkins.domain.Person;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PersonRepositoryTest {

    private PersonRepository personRepository = new PersonRepository();

    @Test
    public void testGetAllPeople() {
        List<Person> people = personRepository.getPeople();

        assertEquals(4, people.size());
    }

    @Test
    public void testAddPerson() {
        assertTrue(this.personRepository.addPerson(new Person("Sam", "Leirens")));

        assertEquals(5, personRepository.getPeople().size());
    }

    @Test
    public void testRemovePerson() {
        assertTrue(this.personRepository.removePerson(this.personRepository.getPeople().get(0)));

        assertEquals(3, personRepository.getPeople().size());
    }
}
