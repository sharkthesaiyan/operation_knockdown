package boomkah;
public class Tile {
    private int x;
    private int y;
    
   public Tile (int x, int y) {
       this.x = x;
       this.y = y;
   } 
    
   public int getX() {
       return this.x;
   }
   
   public int getY() {
       return this.y;
   }
    
    @Override
   public String toString(){
       return ""+this.x+","+this.y;
   } 
}
