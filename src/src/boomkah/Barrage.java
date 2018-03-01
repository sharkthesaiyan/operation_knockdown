
package boomkah;

/**
 *
 * @author shark
 */
public class Barrage {
    private int damagePerShot;
    private int numberOfShots = 15;
    private int level;
    private int energyCost;
    private double scatterRadius = 3.0;
    private double blastRadius = 1.49;
    private int[] damageTable = {190,209,230,253,278,306,337,370,407,448,493,542,596,656,722,794,873,960};
    
    public Barrage(int level) {
        damagePerShot = damageTable[level-1];
        this.level = level;
        energyCost = 10;
        
        //DAMAGETABLE IS WRONG!!! CHANGE!!!!
    }
    
    public int getEnergyCost() {
        return energyCost;
    }
    
    public void increaseEnergyCost() {
        energyCost = energyCost + 6;
    }
    
    public int getDamagePerShot() {
        return damagePerShot;
    }
    
    public int getNumberOfShots() {
        return numberOfShots;
    }
    
    public double getScatterRadius() {
        return scatterRadius;
    }
    
    public double getBlastRadius() {
        return blastRadius;
    }
    
    public int getLevel() {
        return level;
    }
    
    @Override
    public String toString(){
        return "Barrage, lvl:"+level+", damage per shot: "+damagePerShot;
    }
}