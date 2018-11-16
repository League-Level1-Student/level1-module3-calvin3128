
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
}
}