import be.hopcyn.jenkins.domain.Person;
import be.hopcyn.jenkins.repository.PersonRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();

        for (Person p : personRepository.getPeople()) {
            System.out.println(String.format("-%s", p));
        }

    }
}
