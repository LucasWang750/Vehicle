public class Wheel extends CarComponent
{
    private int tirePressureInKPA;
    private int rimDiameterInCm;

    public Wheel(int tirePressureInKPA, int rimDiameterInCm)
    {
        super("wheel", true);
        this.tirePressureInKPA = tirePressureInKPA;
        this.rimDiameterInCm = rimDiameterInCm;
    }

    public Wheel(String nameOfComponent, int tirePressureInKPA, int rimDiameterInCm, boolean isWorking)
    {
        super(nameOfComponent, isWorking);
        this.tirePressureInKPA = tirePressureInKPA;
        this.rimDiameterInCm = rimDiameterInCm;
    }

    @Override
    public String toString()
    {
        String message = "";
        message += "The " + getNameOfComponent() + " is ";
        if(getIsWorking())
        {
            message += "rotating.";
        }
        else
        {
            message += "not rotating.";
        }
        return message;
    }

    @Override
    public String action1()
    {
        return rotate();
    }

    public String rotate()
    {
        if (getIsWorking())
        {           
            if (((int) (Math.random() * 100 + 1) > 98))
            {
                return damage() + "The " + getNameOfComponent() + " can not rotate."; 
            }
            return "The " + getNameOfComponent() + " rotates.";             
        }
        else
        {
            return "The " + getNameOfComponent() + " does not rotate.";
        }
    }       

    @Override
    public String damage()
    {
        setIsWorking(false);
        return "The " + getNameOfComponent() + " is broken and cannot rotate.";
    }

    @Override
    public String fix()
    {
        if (getIsWorking())
        {
            return "The " + getNameOfComponent() + " was already fine.";
        }
        else
        {
            setIsWorking(true);
            return "The " + getNameOfComponent() + " is now rotating.";
        }
    }

    public int getTirePressureInKPA()
    {
        return this.tirePressureInKPA;
    }

    public void setTirePressureInKPA(int tirePressureInKPA)
    {
        this.tirePressureInKPA = tirePressureInKPA;
    }

    public int getRimDiameterInCm()
    {
        return this.rimDiameterInCm;
    }

    public void setRimDiameterInCm(int rimDiameterInCm)
    {
        this.rimDiameterInCm = rimDiameterInCm;
    }
}

