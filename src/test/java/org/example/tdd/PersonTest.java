package org.example.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Driven Development: Red, Green, Refactor
 *
 * Requirements:
 *  - class Person has a variable that holds the 'age' of a person
 *  - we need to create a method that returns is person is a teenager
 *  - a teenager is a person older than 10 years and younger than 20
 *
 * RED:
 *  - write tests for all scenarios that this method should handle with
 *  - tests will fail as the method is not implemented
 *
 * GREEN:
 *  - implement method making the tests pass
 *
 * REFACTOR:
 *  - after all tests pass, figure out if there is some improvement that can be applied to your implementation
 */

class PersonTest {

    @Test
    public void givenPersonWithAgeOf13_whenCallIsTeenager_thenReturnTrue() {
        Person person = new Person(13);
        Assertions.assertThat(person.isTeenager()).isTrue();
    }

    @Test
    public void givenPersonWithAgeOf22_whenCallIsTeenager_thenReturnFalse() {
        Person person = new Person(22);
        Assertions.assertThat(person.isTeenager()).isFalse();
    }

}