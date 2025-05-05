import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

class PhoneBookTest {

    @Test
    void addReturnsOneWhenInputIsOne() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Вася", "8 (999) 777-88-88"));
    }

    @Test
    void addReturnsTwoWhenInputIsTwo() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Вася1", "8 (999) 777-88-11"));
        assertEquals(2, phoneBook.add("Вася2", "8 (999) 777-88-22"));
    }

    @Test
    void addReplaceWhenSameName() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Вася1", "8 (999) 777-88-11"));
        assertEquals(1, phoneBook.add("Вася1", "8 (999) 777-88-22"));
        assertEquals(1, phoneBook.add("Вася1", "8 (999) 777-88-33"));
    }


    @Test
    void findByNumberGiveAnswer() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Вася", "8 (999) 777-88-00");
        assertEquals("Вася", phoneBook.findByNumber("8 (999) 777-88-11"));
    }
}
