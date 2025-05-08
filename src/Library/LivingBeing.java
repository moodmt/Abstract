package Library;

public abstract class LivingBeing {
    protected int energyLevel;
    protected String name;


    public abstract LivingBeing reproduction();
    public abstract void eat();
    public abstract void interact(Object o);

    @Override
    public String toString(){
        return name;
     }

}
