package boomkah;
import java.util.ArrayList;
public class Building {
    private int health;
    private ArrayList<Tile> tiles;

public Building(int health, ArrayList<Tile> tiles) {
    this.health = health;
    this.tiles = tiles;
}

public int getHealth() {
    return health;
}

public void takeDamage(int amount) {
    health = health - amount;
}

@Override
public String toString() {
    String string = health + ":";
    for (Tile tile : tiles) {
        string = string + tile + ":";
    }
    
    return string;
}

}
