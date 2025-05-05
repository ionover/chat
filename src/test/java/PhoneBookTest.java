import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

class PhoneBookTest {

    @Test
    void addReturnsTwoWhenInputIsTwo() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(2, phoneBook.add(2));
    }

    @Test
    void addReturnsOneWhenInputIsOne() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add(1));
    }
}
