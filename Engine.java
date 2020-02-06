
/**
 * Write a description of class Engine here.
 *
 * @author (Phillip Zhou)
 * @version (2/4/20)
 */
public class Engine extends CarComponent

{
    //instance variables
    //private String nameOfComponent;
    private int numberOfCylinders;
    private int engineTemperature;
    //private boolean engineIsWorking;
    

    //constructors
    public Engine(String nameOfComponent, int numberOfCylinders, 
    int engineTemperature, boolean engineIsWorking )
    {
        super(nameOfComponent, engineIsWorking);
        //this.nameOfComponent = nameOfComponent;
        this.numberOfCylinders = numberOfCylinders;
        this.engineTemperature = engineTemperature;
        //this.engineIsWorking = engineIsWorking;

    }

    //override actions
    @Override
    public boolean action1(){
        ignition();  
        return getIsWorking();
    }

    @Override
    public boolean action2(){
        useFuel();  
        return getIsWorking();
    }

    //methods
    public String ignition()
    {

        if (getIsWorking())
        {   if( ((Math.random() * 100) + 1 ) > 90 )
            { 
                setIsWorking(false);
                return getNameOfComponent() + " broke.";

            }
            else{
             return getNameOfComponent()+ " ignites." ; 
            }
        }
        else{
            return getNameOfComponent() + " cannot ignite.";
        }
        
    }
    public String useFuel() 
    {
        if (getIsWorking()){
            if( ((Math.random() * 100) + 1 ) > 90 )
            { 
                setIsWorking(false);
                return getNameOfComponent() + " broke.";

            }
            else{
             return getNameOfComponent() + " uses fuel."; 
            }
        }
        else{
            return getNameOfComponent() + " cannot use fuel.";
        }   
    }

    public String toString()
    {
        String message = "The " + getNameOfComponent() + " is "; 
        if(getIsWorking()){
            message+= "working. \n"; 
        }else{
            message+= "not working. \n"; 
        }
        return "";
    }
    
    @Override
    public String damage(){
        setIsWorking(false); 
        return "You broke the" + getNameOfComponent() + ".";
    }

    @Override
    public String fix(){
        setIsWorking(true); 
        return "The" + getNameOfComponent() + "received repairs and is now fixed.";
    }

    //getters and setters
    
    
    // public String getNameOfComponent(){
        // return nameOfComponent; 
    // }

    // public void setNameOfComponent(String nameOfComponent){
        // this.nameOfComponent = nameOfComponent;
    // }

    public int getNumberOfCylinders(){
        return numberOfCylinders; 
    }

    public void setNumberOfCylinders(int numberOfCylinders){
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getEngineTemperature(){
        return engineTemperature; 
    }

    public void setEngineTemperature(int engineTemperature){
        this.engineTemperature = engineTemperature;
    }

    // public boolean getIsWorking(){
        // return engineIsWorking; 
    // }

    // public void setIsWorking(boolean engineIsWorking){
        // this.engineIsWorking = engineIsWorking;
    // }
}

//OLD CODE BELOW

// /**
//  * Write a description of class Engine here.
//  *
//  * @author (Phillip Zhou)
//  * @version (2/4/20)
//  */
// public class Engine extends CarComponent

// {
//     //instance variables
//     //private String nameOfComponent;
//     private int numberOfCylinders;
//     private int engineTemperature;
//     //private boolean engineIsWorking;
    

//     //constructors
//     public Engine(String nameOfComponent, int numberOfCylinders, 
//     int engineTemperature, boolean engineIsWorking )
//     {
//         super(nameOfComponent, engineIsWorking);
//         //this.nameOfComponent = nameOfComponent;
//         this.numberOfCylinders = numberOfCylinders;
//         this.engineTemperature = engineTemperature;
//         //this.engineIsWorking = engineIsWorking;

//     }

//     //override actions
//     public String action1(){
//         return ignition();  
//     }

//     public String action2(){
//         return useFuel();  
//     }

//     //methods
//     public String ignition()
//     {

//         if (getIsWorking())
//         {   if( ((Math.random() * 100) + 1 ) > 90 )
//             { 
//                 setIsWorking(false);
//                 return getNameOfComponent() + " broke.";

//             }
//             else{
//              return getNameOfComponent()+ " ignites." ; 
//             }
//         }
//         else{
//             return getNameOfComponent() + " cannot ignite.";
//         }
        
//     }
//     public String useFuel() 
//     {
//         if (getIsWorking()){
//             if( ((Math.random() * 100) + 1 ) > 90 )
//             { 
//                 setIsWorking(false);
//                 return getNameOfComponent() + " broke.";

//             }
//             else{
//              return getNameOfComponent() + " uses fuel."; 
//             }
//         }
//         else{
//             return getNameOfComponent() + " cannot use fuel.";
//         }   
//     }

//     public String toString()
//     {
//         String message = "The " + getNameOfComponent() + " is "; 
//         if(getIsWorking()){
//             message+= "working. \n"; 
//         }else{
//             message+= "not working. \n"; 
//         }
//         return "";
//     }

//     public String damage(){
//         setIsWorking(false); 
//         return "You broke the" + getNameOfComponent() + ".";
//     }

//     public String fix(){
//         setIsWorking(true); 
//         return "The" + getNameOfComponent() + "received repairs and is now fixed.";
//     }

//     //getters and setters
    
    
//     // public String getNameOfComponent(){
//         // return nameOfComponent; 
//     // }

//     // public void setNameOfComponent(String nameOfComponent){
//         // this.nameOfComponent = nameOfComponent;
//     // }

//     public int getNumberOfCylinders(){
//         return numberOfCylinders; 
//     }

//     public void setNumberOfCylinders(int numberOfCylinders){
//         this.numberOfCylinders = numberOfCylinders;
//     }

//     public int getEngineTemperature(){
//         return engineTemperature; 
//     }

//     public void setEngineTemperature(int engineTemperature){
//         this.engineTemperature = engineTemperature;
//     }

//     // public boolean getIsWorking(){
//         // return engineIsWorking; 
//     // }

//     // public void setIsWorking(boolean engineIsWorking){
//         // this.engineIsWorking = engineIsWorking;
//     // }
// }
