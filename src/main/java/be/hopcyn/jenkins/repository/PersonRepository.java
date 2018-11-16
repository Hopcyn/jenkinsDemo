package be.hopcyn.jenkins.repository;

import be.hopcyn.jenkins.domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonRepository {

    private List<Person> people;
    {
        Person p1 = new Person("Robin", "Couck");
        Person p2 = new Person("Jonas", "De Nauw");
        Person p3 = new Person("Thijs", "Coremans");
        Person p4 = new Person("Ivo", "Ivoriaan");

        this.people = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));
    }


    public List<Person> getPeople() {
        return this.people;
    }

    public Boolean addPerson(Person p) {
        return this.people.add(p);
    }

    public Boolean removePerson(Person p){
        return this.people.remove(p);
    }
}
