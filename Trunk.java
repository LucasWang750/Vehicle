public class Trunk extends CarComponent
{
    private int diameterInFeet;

    public Trunk(int diameterInFeet)
    {
        super("trunk", true);
        this.diameterInFeet = diameterInFeet;
    }

    public Trunk(String nameOfComponent, int diameterInFeet, boolean isWorking)
    {
        super(nameOfComponent, isWorking);
        this.diameterInFeet = diameterInFeet;
    }

    @Override
    public String toString()
    {
        String message = "";
        message += "The " + getNameOfComponent() + " is ";
        if(getIsWorking())
        {
            message += "opening.";
        }
        else
        {
            message += "not opening.";
        }
        return message;
    }

    @Override
    public boolean action1()
    {
         open();
         return getIsWorking();
    }

    public String open()
    {
        if (getIsWorking())
        {           
            if (((int) (Math.random() * 100 + 1) > 80))
            {
                return damage() + "The " + getNameOfComponent() + " can not open."; 
            }
            return "The " + getNameOfComponent() + " opens.";             
        }
        else
        {
            return "The " + getNameOfComponent() + " does not open.";
        }
    }       

    @Override
    public String damage()
    {
        setIsWorking(false);
        return "The " + getNameOfComponent() + " is broken and cannot open.";
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
            return "The " + getNameOfComponent() + " is now opening.";
        }
    }

    public int getdiameterInFeet()
    {
        return this.diameterInFeet;
    }

    public void setdiameterInFeet(int diameterInFeet)
    {
        this.diameterInFeet = diameterInFeet;
    }
}

//OLD CODE BELOW

// public class Trunk extends CarComponent
// {
//     private int diameterInMeters;

//     public Trunk(int diameterInMeters)
//     {
//         super("trunk", true);
//         this.diameterInMeters = diameterInMeters;
//     }

//     public Trunk(String nameOfComponent, int diameterInMeters, boolean isWorking)
//     {
//         super(nameOfComponent, isWorking);
//         this.diameterInMeters = diameterInMeters;
//     }

//     @Override
//     public String toString()
//     {
//         String message = "";
//         message += "The " + getNameOfComponent() + " is ";
//         if(getIsWorking())
//         {
//             message += "opening.";
//         }
//         else
//         {
//             message += "not opening.";
//         }
//         return message;
//     }

//     @Override
//     public String action1()
//     {
//         return open();
//     }

//     public String open()
//     {
//         if (getIsWorking())
//         {           
//             if (((int) (Math.random() * 100 + 1) > 80))
//             {
//                 return damage() + "The " + getNameOfComponent() + " can not open."; 
//             }
//             return "The " + getNameOfComponent() + " opens.";             
//         }
//         else
//         {
//             return "The " + getNameOfComponent() + " does not open.";
//         }
//     }       

//     @Override
//     public String damage()
//     {
//         setIsWorking(false);
//         return "The " + getNameOfComponent() + " is broken and cannot open.";
//     }

//     @Override
//     public String fix()
//     {
//         if (getIsWorking())
//         {
//             return "The " + getNameOfComponent() + " was already fine.";
//         }
//         else
//         {
//             setIsWorking(true);
//             return "The " + getNameOfComponent() + " is now opening.";
//         }
//     }

//     public int getdiameterInMeters()
//     {
//         return this.diameterInMeters;
//     }

//     public void setdiameterInMeters(int diameterInMeters)
//     {
//         this.diameterInMeters = diameterInMeters;
//     }
// }