public class Brake extends CarComponent
{
    private int discSizeInCM;
    private double brakePadThicknessInMM;
        public Brake(String Name, int discSizeInCM, double brakePadThicknessInMM, boolean isWorking)
        {
            super(Name, isWorking);
            this.discSizeInCM = discSizeInCM;
            this.brakePadThicknessInMM = brakePadThicknessInMM;
            
        }
        
        public Brake(int discSizeInCM, double brakePadThicknessInMM, boolean isWorking)
        {
            super("Brakes", isWorking);
            this.discSizeInCM = discSizeInCM;
            this.brakePadThicknessInMM = brakePadThicknessInMM;
            
        }
        
        public void setDiscSize(int discSizeInCM)
        {
            this.discSizeInCM = discSizeInCM;
        }
        public void setBrakePadThickness(double brakePadThicknessInMM)
        {
            this.brakePadThicknessInMM = brakePadThicknessInMM;
        }
        public int getDiscSizeInCM()
        {
            return this.discSizeInCM;
        }
        public double getBrakePadThicknessInMM()
        {
            return this.brakePadThicknessInMM;
        }
        
        @Override
        public String damage()
        {
            setIsWorking(false);
            return "The " +  getNameOfComponent() + " stopped working and is unable to brake";
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
            return "The " + getNameOfComponent() + " is now working.";
            }
        }

        public String startBraking()
        {
            if(getIsWorking() && brakePadThicknessInMM > 2)
            {
                if((((int)(Math.random() *100 +1) >99)))
                {
                    return damage();
                }
                brakePadThicknessInMM = brakePadThicknessInMM - 0.01;
                return "Brake Pad clamps onto the Disc braking the car";
            }
            return "The " + getNameOfComponent() + " is not working";
        }
        
        @Override
        public String toString()
        {
        String message = "";
        message += "The " + getNameOfComponent() + " can ";
        if(getIsWorking())
        {
            message += "brake.";
        }
        else
        {
            message += "not brake.";
        }
        return message;
        }

}

