package extra;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {

public static void main(String[] args) {
	World wrld = new World();
	wrld.show();
	Bug bug = new Bug();
	Location loc = new Location(1,3);
	
}
}
