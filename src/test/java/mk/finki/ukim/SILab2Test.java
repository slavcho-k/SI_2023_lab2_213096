package mk.finki.ukim;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    public void everyBranchCriteriaTest() {
        everyBranchTestCase1();
        everyBranchTestCase2();
        everyBranchTestCase3();
        everyBranchTestCase4();
    }

    private void everyBranchTestCase1() {
        assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
        assertThrows(RuntimeException.class, () -> SILab2.function(new User(null, null, "SADASDA"), new ArrayList<>()));
        assertThrows(RuntimeException.class, () -> SILab2.function(new User(null, "SADADAD", null), new ArrayList<>()));
        assertThrows(RuntimeException.class, () -> SILab2.function(new User("SADAD", null, null), new ArrayList<>()));
        assertDoesNotThrow(() -> SILab2.function(new User(null, "ASDAD", "SADASDA"), new ArrayList<>()));
    }

    private void everyBranchTestCase2() {
        User testUser = new User(null, "password@", "user@mail.com");
        SILab2.function(testUser, new ArrayList<>());
        Assertions.assertEquals("user@mail.com", testUser.getUsername());
    }

    private void everyBranchTestCase3() {
        User testUser = new User(null, "password", "user@mail.com");
        User testUser2 = new User(null, "sadadada", "user2@mail.com");
        User testUser3 = new User(null, "password", "user@mail.com");
        User testUser4 = new User("testuser", "dsiadao", "test_user@mail.com");
        User testUser5 = new User("testuser", "passworsad", "123@mail.com");

        SILab2.function(testUser, List.of(testUser, testUser2, testUser4, testUser3, testUser5));
        Assertions.assertNotEquals(0, SILab2.same);
    }

    private void everyBranchTestCase4() {
        assertFalse(SILab2.function(new User("user", "pass", "email@mail.com"), new ArrayList<>()));
        assertFalse(SILab2.function(new User("user", "username", "mail@test.com"), new ArrayList<>()));
    }

    @Test
    public void multipleConditionCriteriaTest() {
        multipleConditionUserNotNull();
        multipleConditionPassworNotdNull();
        multipleConditionEmailNotdNull();
    }

    private void multipleConditionUserNotNull() {
        assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
        assertDoesNotThrow(() -> SILab2.function(new User("name", "pass", "email"), new ArrayList<>()));
    }

    private void multipleConditionPassworNotdNull() {
        assertThrows(RuntimeException.class, () -> SILab2.function(new User("user", null, "email"), new ArrayList<>()));
        assertDoesNotThrow(() -> SILab2.function(new User(null, "pass", "email"), new ArrayList<>()));
    }

    private void multipleConditionEmailNotdNull() {
        assertThrows(RuntimeException.class, () -> SILab2.function(new User("user", "asda", null), new ArrayList<>()));
        assertDoesNotThrow(() -> SILab2.function(new User(null, "pass", "email"), new ArrayList<>()));
    }
}