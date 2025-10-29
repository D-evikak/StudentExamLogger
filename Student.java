package studentexamlogger;

public class Student {

private String Studentname;//name

private int RollNum; //rollnumber

private double Marks; //marks

public Student(String Studentname, int RollNum, double Marks) {

this.Studentname =Studentname;

this.RollNum = RollNum;

this.Marks = Marks;

}

public String toCSV() {

return Studentname + "," + RollNum + "," + Marks + "";

}

}