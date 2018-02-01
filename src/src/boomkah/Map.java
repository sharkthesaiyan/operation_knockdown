/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boomkah;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author peter
 */
public class Map {
    private ArrayList<Building> buildings;
    private int xMax;
    private int yMax;
    
    public Map(String FileName) {
        buildings = new ArrayList();
        try {
                FileReader fileReader = new FileReader(FileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                ArrayList<String> lines = new ArrayList();
                String line;
                while(( line = bufferedReader.readLine()) != null) {
                    if(line.contains("xmax")){
                        xMax = Integer.parseInt(line.split(":")[1]);
                    } else if(line.contains("ymax")) {
                        yMax = Integer.parseInt(line.split(":")[1]);
                    } else if(line.contains("building")) {
                        int health = Integer.parseInt(line.split(":")[1]);
                        ArrayList<Tile> tiles = new ArrayList();

                        int x;
                        int y;
                        for (String coordinate : line.split(":")) {
                            if(coordinate.contains(",")) {
                                x = Integer.parseInt(coordinate.split(",")[0]);
                                y = Integer.parseInt(coordinate.split(",")[1]);
                                tiles.add(new Tile(x,y));
                            }
                        }
                        buildings.add(new Building(health, tiles));
                    }

                }

                bufferedReader.close();

        } catch (FileNotFoundException  e) {
            System.out.println("asd");
        } catch (IOException ex) {
            System.out.println("qwe"); 
        }
        
    }
    
    @Override
    public String toString() {
        return xMax + "," + yMax + String.join(", ",Arrays.toString(buildings.toArray()));
    }
    
}
