package extra;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {

public static void main(String[] args) {
	World wrld = new World();
	wrld.show();
	Bug bug = new Bug();
	Location loc = new Location(3,4);
	wrld.add(loc, bug);
	Random rand = new Random();
	int rloca = rand.nextInt(9);
	int rlocb = rand.nextInt(9);
	Location loc2 = new Location(rloca,rlocb);
	Bug bug2 = new Bug(Color.blue);
	wrld.add(loc2, bug2);
	bug2.turn();
	bug2.turn();
	
	Flower fl = new Flower(Color.pink);
	Flower fr = new Flower(Color.CYAN);
	Location fll = new Location(rloca, rlocb-1);
	Location frl = new Location(rloca, rlocb+1);
	wrld.add(fll, fl);
	wrld.add(frl, fr);
	Flower flow = new Flower(Color.RED);
	Flower flowwhite = new Flower(Color.WHITE);
	Flower flowblue = new Flower(Color.BLUE);
	for (int x = 0; x < 10; x++) {
	for (int i = 0; i < 10; i++) {
		Location locc = new Location(i,x);
		if(x<5 && i<5) {
		if(i%2==0 || x%2==0) {
			wrld.add(locc, flowblue);
		}else {
			wrld.add(locc, flowwhite);
		}
		
		
		}else if(i%2==0) {
		wrld.add(locc, flow);
		}else {
		wrld.add(locc, flowwhite);
		}
		System.out.println("loop?");
	}
	}
	
	
}
}
