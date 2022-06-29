import java.util.Objects;

public class pokemon {


    private int m_nLevel;
    private int m_nAttackPower;
    private int m_nHitPoints;
    private String m_nName;




    public pokemon(int m_nLevel,String m_nName){
        this.m_nLevel = m_nLevel;
        this.m_nName = m_nName;
    }



    public int getLevel(){
    return this.m_nLevel;
    }
    public int getAttackPower(){
    return this.m_nAttackPower;
    }
    public int getHitPoints(){
    return this.m_nHitPoints;
    }
    public String getName(){
     return this.m_nName;
    }

    public void setLevel(int Level){
        this.m_nLevel = Level;
    }
    public void setAttackPower(){
        this.m_nAttackPower = this.m_nLevel * 5;
    }
    public void setHitPoints(){
        this.m_nHitPoints = this.m_nLevel * 3;
    }
    public void setName(String name){
        this.m_nName = name;
    }

    public void attack(pokemon p){
        if((p != this)&&(p.getLevel() < this.getLevel()*2)){
            System.out.println("ATTACK succeeded");
        }else{
            System.out.println("ATTACK failed");
        }
    }

    public boolean isAlive(){
        return this.getHitPoints() != 0;
    }





    public void printStatus(){
        System.out.println("-----------------------");
        System.out.println("pokemon status:");
        System.out.println("-----------------------");
        System.out.println("pokemon name: " + this.getName());
        System.out.println("pokemon level: " + this.getLevel());
        System.out.println("pokemon HP: " + this.getHitPoints());
        System.out.println("pokemon Attack Power: " + this.getAttackPower());
        System.out.println("-----------------------");
    }
}

