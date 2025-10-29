package studentexamlogger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.File;

public class ScoreWriterTest {

@Test
public void testFileWrite() throws Exception {

ScoreWriter writer = new ScoreWriter("test_output.csv");

Student sd = new Student("TestUser", 1, 92.5);

writer.writeStudentRecord(sd);

//check that the csv file was generated as expected

File file = new File("test_output.csv");

assertTrue(file.exists(), "File should be created successfully");

}

}

