package boomkah;

/**
 *
 * @author shark
 */
public class Artillery {
    private int damage;
    private int level;
    private double range = 0.49;
    private int[] damageTable = {700,777,862,957,1063,1180,1309,1453,1613,1791,1988,
                        2206,2449,2718,3017,3349,3718,4127,4580,5084,5644,6264};
    private int energyCost;
    
    
    public Artillery(int level) {
        this.damage = this.damageTable[level-1];
        this.level = level;
        this.energyCost = 3;
    }
    
    public int getDamage(){
        return damage;
    }

    public int getEnergyCost() {
        return energyCost;
    }
    
    public void increaseEnergyCost() {
        energyCost = energyCost + 2;
    }
    
    @Override
    public String toString(){
        return "Artilley, lvl:"+level+", damage: "+damage;
    }
        
}
