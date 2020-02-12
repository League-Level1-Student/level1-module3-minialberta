package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
    	nextBibNumber=nextBibNumber+1;
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete joe= new Athlete("Joe", 10);
    	Athlete bob= new Athlete("Bob", 15);
    	System.out.println("Joe, "+joe.bibNumber+" "+joe.raceLocation);
    	System.out.println("Bob, "+bob.nextBibNumber+" "+bob.raceLocation);
    	
    }
}