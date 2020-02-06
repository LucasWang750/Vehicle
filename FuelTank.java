
/**
 * Write a description of class GasTank here.
 *
 * @author Cecilia Li
 * @version v1
 */
public class FuelTank extends CarComponent
{
    //instance variable
    double oilInGallons; //values from 0 to 12
    double fuelTankCapacity;
    
    //constructor
    public FuelTank(String nameOfComponent, boolean isWorking){
        super(nameOfComponent, isWorking);
        setIsWorking(true);
        oilInGallons = 0;
    }
    
    public FuelTank(String nameOfComponent, boolean isWorking, int oilInGallons, double fuelTankCapacity){
        super(nameOfComponent, isWorking);
        setIsWorking(isWorking);
        this.fuelTankCapacity = fuelTankCapacity;
        if (oilInGallons < 0)
        this.oilInGallons = 0;
        else if (oilInGallons > fuelTankCapacity)
        this.oilInGallons = fuelTankCapacity;
        else
        this.oilInGallons = oilInGallons;
    }
    
    //methods
    public void setOilInGallons(double a){
        this.oilInGallons = a;
    }
    
    public double getOilInGallons(){
        return oilInGallons;
    }
    
    public double getFuelTankCapacity(){
        return fuelTankCapacity;
    }
    
    public void setFuelTankCapacity(double a){
        this.fuelTankCapacity=a;
    }
    
    @Override
    public String fix(){
        setIsWorking(true);
        return "The Fuel Tank is now fixed.\n";
    }
    
    @Override
    public String damage(){
        setIsWorking(false);
        return "The Fuel Tank has failed.\n";
    }
    
    @Override
    public boolean action1(){
        oilInGallons += 5;
         if (oilInGallons < 0){
        this.oilInGallons = 0;
        return getIsWorking();
    }else if (oilInGallons > fuelTankCapacity){
        this.oilInGallons = fuelTankCapacity;
        return getIsWorking();
    }else{
        this.oilInGallons = oilInGallons;
        System.out.println( "The car has " + oilInGallons + " gallons of oil.\n");
        return getIsWorking();
    }
}
    @Override
    public boolean action2(){
        if(getIsWorking()){
            if((int)((Math.random() * 100) + 1) > 70){
                System.out.println( "The fuel tank could not be light on fire.");
                return getIsWorking();
            }
            else{
                setIsWorking(false);
                System.out.println("The fule tank was on fire and exploded.");
                return getIsWorking(); }}
        else
            System.out.println( "Your gas tank cannot be light on fire because it is already damaged.");
            return getIsWorking();
    }
    
}

//OLD CODE BELOW

// /**
//  * Write a description of class GasTank here.
//  *
//  * @author Cecilia Li
//  * @version v1
//  */
// public class FuelTank extends CarComponent
// {
//     //instance variable
//     double oilInGallons; //values from 0 to 12
//     double fuelTankCapacityInGallons;
    
//     //constructor
//     public FuelTank(String nameOfComponent, boolean isWorking){
//         super(nameOfComponent, isWorking);
//         setIsWorking(true);
//         oilInGallons = 0;
//     }
    
//     public FuelTank(String nameOfComponent, boolean isWorking, int oilInGallons, double fuelTankCapacityInGallons){
//         super(nameOfComponent, isWorking);
//         setIsWorking(isWorking);
//         this.fuelTankCapacityInGallons = fuelTankCapacityInGallons;
//         if (oilInGallons < 0)
//         this.oilInGallons = 0;
//         else if (oilInGallons > fuelTankCapacityInGallons)
//         this.oilInGallons = fuelTankCapacityInGallons;
//         else
//         this.oilInGallons = oilInGallons;
//     }
    
//     //methods
//     public void setOilInGallons(double a){
//         this.oilInGallons = a;
//     }
    
//     public double getOilInGallons(){
//         return oilInGallons;
//     }
    
//     public double getFuelTankCapacityInGallons(){
//         return fuelTankCapacityInGallons;
//     }
    
//     public void setFuelTankCapacityInGallons(double a){
//         this.fuelTankCapacityInGallons=a;
//     }
    
//     @Override
//     public String fix(){
//         setIsWorking(true);
//         return "The Fuel Tank is now fixed.\n";
//     }
    
//     @Override
//     public String damage(){
//         setIsWorking(false);
//         return "The Fuel Tank has failed.\n";
//     }
    
//     @Override
//     public boolean action1(){
//         oilInGallons += 5;
//          if (oilInGallons < 0)
//         this.oilInGallons = 0;
//         else if (oilInGallons > fuelTankCapacityInGallons)
//         this.oilInGallons = fuelTankCapacityInGallons;
//         else
//         this.oilInGallons = oilInGallons;
//         return "The car has " + oilInGallons + " gallons of oil.\n";
//     }
    
//     @Override
//     public String action2(){
//         if(getIsWorking()){
//             if((int)((Math.random() * 100) + 1) > 70){
//                 return "The fuel tank could not be light on fire.";}
//             else{
//                 setIsWorking(false);
//                 return "The fule tank was on fire and exploded.";}}
//         else
//             return "Your gas tank cannot be light on fire because it is already damaged.";
//     }
    
// }
