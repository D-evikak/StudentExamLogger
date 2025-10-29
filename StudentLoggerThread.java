package studentexamlogger;

//File Name:StudentThread.java

//StudentLoggerThread class to make one student post exam information in parallel.

public class StudentLoggerThread extends Thread {

private final Student studentobj;

private final ScoreWriter writer;

public StudentLoggerThread(Student studentobj, ScoreWriter writer)

{ // store store information

this.studentobj = studentobj;

this.writer = writer;

// share the same writer reference so all threads write into the same file

}

@Override

public void run() {

try {

writer.writeStudentRecord(studentobj);

System.out.println("Submitted: " + studentobj.toCSV());

} catch (Exception e) {

System.err.println("Error writing score: " + e.getMessage());

}

}

}
