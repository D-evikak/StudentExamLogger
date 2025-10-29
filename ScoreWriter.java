package studentexamlogger;

import java.io.FileWriter;

import java.io.IOException;

 

public class ScoreWriter {

private final String filename;

 

public ScoreWriter(String filename) {

this.filename = filename;

}

public synchronized void writeStudentRecord(Student studobj) throws IOException

{

try (FileWriter fw = new FileWriter(filename, true)) {

fw.write(studobj.toCSV());

}

}

}