
public class GasPedal extends CarComponent
{
    private double surfaceAreaInCentimeters;
    public GasPedal(String nameOfComponent, boolean isWorking, double surfaceAreaInCentimeters)
    {
        super(nameOfComponent, isWorking);
        this.surfaceAreaInCentimeters = surfaceAreaInCentimeters;
    }

    public void setSurfaceAreaInCentimeters(double surfaceAreaInCentimeters)
    {
        this.surfaceAreaInCentimeters = surfaceAreaInCentimeters;
    }

    public double getSurfaceAreaInCentimeters()
    {
        return surfaceAreaInCentimeters;
    }

    public String accelerate()
    {
        if(getIsWorking()){
            if((int)((Math.random()*100))+1>90)
            {
                setIsWorking(false);
                return getNameOfComponent() + " does not accelerate.";
            }
            else
            {
                return getNameOfComponent() + " accelerates.";
            }
        }
        return getNameOfComponent() + " does not accelerate.";
    }
    public String decelerate()
    {
        if(getIsWorking()){
            if((int)((Math.random()*100))+1>90)
            {
                setIsWorking(false);
                return getNameOfComponent() + " does not decelerate.";
            }
            else
            {
                return getNameOfComponent() + " decelerates.";
            }
        }
        return getNameOfComponent() + " does not decelerate.";
    }
    @Override
    public String action1()
    {
        return accelerate();
    }
    @Override
    public String action2()
    {
        return decelerate();
    }
    @Override
    public String fix()
    {
        setIsWorking(true);
        if(getIsWorking())
        {
            return getNameOfComponent() +" was already fine and does not need to be fixed.";
        }
        return getNameOfComponent() + " has been fixed and is now working"; 
    }
    @Override
    public String damage()
    {
        setIsWorking(false);
        return getNameOfComponent() + " has ben damaged and does not work";
    }
}
