package integration_testing.level_3;

import static org.junit.jupiter.api.Assertions.*;

import Implementation.FileHandler;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import Implementation.fileValidator;

import java.io.FileNotFoundException;
import java.util.ArrayList;

//Unit tests for FileHandler class
public class FileHandlerTest {
    private FileHandler fileHandler;
    private String validFilePath = "valid_file.txt";
    private String invalidFilePath = "invalid_file.txt";

    @Before
    public void setUp() {
        try {
            fileHandler = new FileHandler(validFilePath);
        } catch (FileNotFoundException e) {
            fail("File not found: " + validFilePath);
        }
    }

    @Test
    public void testSetPath() {
        String newPath = "new_path.txt";
        fileHandler.setPath(newPath);
        assertEquals(newPath, fileHandler.getFilepath());
    }

    @Test
    public void testGetDataValidFile() {
        try {
            ArrayList<String> data = fileHandler.GetData();
            assertTrue(!data.isEmpty(), "Data is not empty");
        } catch (FileNotFoundException e) {
            fail("File not found: " + validFilePath);
        }
    }

    @Test
    public void testSetInvalidPath() {
        assertThrows(FileNotFoundException.class, () -> fileHandler.setPath(invalidFilePath));
    }

    @Test
    public void testGetDataFromInvalidFile() {
        assertThrows(FileNotFoundException.class, () -> new FileHandler(invalidFilePath));
    }
    
    @Test
    public void testGetDataFromNullPath() {
        assertThrows(NullPointerException.class, () -> fileHandler.setPath(null));
        assertThrows(NullPointerException.class, () -> fileHandler.GetData());
    }

    @Test
    public void testGetDataFromNonexistentFile() {
        assertThrows(FileNotFoundException.class, () -> new FileHandler("nonexistent_file.txt"));
    }



}
