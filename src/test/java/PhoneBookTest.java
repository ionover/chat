import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        assertEquals("Вася", phoneBook.findByNumber("8 (999) 777-88-00"));
    }

    @Test
    void findByNameGiveAnswer() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Вася", "8 (999) 777-88-00");
        assertEquals("8 (999) 777-88-00", phoneBook.findByName("Вася"));
    }


    @Test
    void printAllNamesGiveAnswer() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Вася", "8 (999) 777-88-00");
        phoneBook.add("Петя", "8 (999) 777-88-11");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        phoneBook.printAllNames();

        System.setOut(originalOut);

        String expected =
                "Вася" + System.lineSeparator() +
                        "Петя" + System.lineSeparator();

        assertEquals(expected, outContent.toString());
    }
}
