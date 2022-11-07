package javafx;

public abstract class Vehicle
{
    private boolean vehicletype;
    public Vehicle(){   
    }
    
    
    public abstract String getmodel(int m);
    public abstract String getplate(boolean k, int s);
    public abstract String getcolor(boolean k, int s);
    public abstract void setauto(boolean y);
    public abstract boolean getauto();
    
    
    

}
