
public class Athlete {

    static int nextBibNumber = 1;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

Athlete (String name, int speed){
    this.name = name;
    this.speed = speed;
    bibNumber = nextBibNumber;
    nextBibNumber++;
    
}

static void setting(String loc, String time) {
	raceLocation = loc;
	raceStartTime = time;
}

public static void main(String[] args) {
    Athlete Jim = new Athlete("Jim", 13);
    Athlete Nancy = new Athlete("Nancy", 15);
    setting("Los Angeles","2:00am");
    System.out.println(raceLocation);
    System.out.println(raceStartTime);
    System.out.println(Jim.bibNumber);
    System.out.println(Nancy.bibNumber);
    System.out.println(Jim.speed);
    System.out.println(Nancy.speed);
}
}