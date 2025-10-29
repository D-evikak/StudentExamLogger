package studentexamlogger;	

public class Main{

public static void main(String[] args) {

// initialize a scoreWriter object to write files

ScoreWriter writer = new ScoreWriter("scores.csv");

// students execute on different threads to give marks

StudentLoggerThread sd1 = new StudentLoggerThread(new Student("pooja", 108, 88.6), writer);

StudentLoggerThread sd2 = new StudentLoggerThread(new Student("priya", 102, 92.7), writer);

StudentLoggerThread sd3 = new StudentLoggerThread(new Student("devana", 101, 76.0), writer);

// execute threads

sd1.start();

sd2.start();

sd3.start();

try

{
// wait for all threads to complete execution

sd1.join();

sd2.join();

sd3.join();
}

// takes care of any interruption
catch (InterruptedException e) {
	e.printStackTrace();

}

System.out.println("All students have submitted their scores successfully.");

// confirmation message

}

}
