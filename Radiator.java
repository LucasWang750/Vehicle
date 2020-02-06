
/**
 * Radiator for Car
 *
 * @author (Owen Yee)
 * @version (2/3/2020)(v2)
 */
public class Radiator extends CarComponent
{
   private double temperatureOfRadiatorCelcius;  
   private double waterLevelInches;

   public Radiator(double temperatureOfRadiatorCelcius, boolean isWorking, double waterLevelInches, String nameOfComponent){
       super(nameOfComponent, isWorking);
       this.temperatureOfRadiatorCelcius = temperatureOfRadiatorCelcius;
       this.waterLevelInches = waterLevelInches;
       
    }
    
   @Override
    public String fix(){
       setIsWorking(true);
       return "the radiator " + getNameOfComponent() + " was repaired." + ".\n";
    }
   
   @Override
    public String damage(){
        setIsWorking(false);
        return "The radiator " +getNameOfComponent() + " was damaged." + ".\n";
    }
    
   public String coolEngine(){
       if (getIsWorking()){
           if(((int) (Math.random()*100)+1)>90){
               this.setIsWorking(false);
           return "The radiator could not cool the engine" + ".\n";
           }
           return "the radiator cooled the engine" + ".\n";
     }
     else{
         return "the radiator could not cool the engine" + ".\n";
        }
     }
     
   public String heatEngine(){
       if (getIsWorking()){
           if(((int) (Math.random()*100)+1)>90){
               this.setIsWorking(false);
           return "The radiator could not heat the engine" + ".\n";
           }
           return "the radiator heated the engine" + ".\n";
     }
     else{
         return "the radiator could not heat the engine" + ".\n";
        }
     }
     
   @Override
   public boolean action1(){
       coolEngine();
       return getIsWorking();
    }
    
   @Override
   public boolean action2(){
       heatEngine();
       return getIsWorking();
    }
    
   @Override
   public String toString() {
     String message = "";
     if(getIsWorking()) {
	message+= "The " + getNameOfComponent() + " is working" + ".\n";
	}
	else {
	message+= "The " + getNameOfComponent() + " is not working" + ".\n"; 
	}
	message+= "The water level in Inches of the " + getNameOfComponent() + " is " + getWaterLevelInches() + ".\n";
	message+= "The temperature in celcius of the " + getNameOfComponent() + " is " + getTemperatureOfRadiatorCelcius() + ".\n";
	return message;
   }
   
   public void setRadiatorTemperatureInCelcius (double temperatureOfRadiatorCelcius ){
        this.temperatureOfRadiatorCelcius  = temperatureOfRadiatorCelcius ; 
    }

   public double getTemperatureOfRadiatorCelcius (){
        return this.temperatureOfRadiatorCelcius ;
    }

   public void setWaterLevelInches(double waterLevelInches){
       this.waterLevelInches = waterLevelInches;
    }
    
   public double getWaterLevelInches(){
       return this.waterLevelInches;
    }

   
}


//OLD CODE BELOW

// /**
//  * Radiator for Car
//  *
//  * @author (Owen Yee)
//  * @version (2/3/2020)(v2)
//  */
// public class Radiator extends CarComponent
// {
//    private double temperatureOfRadiatorCelcius;  
//    private double waterLevelCM;

//    public Radiator(double temperatureOfRadiatorCelcius, boolean isWorking, double waterLevelCM, String nameOfComponent){
//        super(nameOfComponent, isWorking);
//        this.temperatureOfRadiatorCelcius = temperatureOfRadiatorCelcius;
//        this.waterLevelCM = waterLevelCM;
       
//     }
    
//    @Override
//     public String fix(){
//        setIsWorking(true);
//        return "the radiator " + getNameOfComponent() + " was repaired." + ".\n";
//     }
   
//    @Override
//     public String damage(){
//         setIsWorking(false);
//         return "The radiator " +getNameOfComponent() + " was damaged." + ".\n";
//     }
    
//    public String coolEngine(){
//        if (getIsWorking()){
//            if(((int) (Math.random()*100)+1)>90){
//                this.setIsWorking(false);
//            return "The radiator could not cool the engine" + ".\n";
//            }
//            return "the radiator cooled the engine" + ".\n";
//      }
//      else{
//          return "the radiator could not cool the engine" + ".\n";
//         }
//      }
     
//    public String heatEngine(){
//        if (getIsWorking()){
//            if(((int) (Math.random()*100)+1)>90){
//                this.setIsWorking(false);
//            return "The radiator could not heat the engine" + ".\n";
//            }
//            return "the radiator heated the engine" + ".\n";
//      }
//      else{
//          return "the radiator could not heat the engine" + ".\n";
//         }
//      }
     
//    @Override
//    public String action1(){
//        return coolEngine();
//     }
    
//    @Override
//    public String action2(){
//        return heatEngine();
//     }
    
//    @Override
//    public String toString() {
//      String message = "";
//      if(getIsWorking()) {
// 	message+= "The " + getNameOfComponent() + " is working" + ".\n";
// 	}
// 	else {
// 	message+= "The " + getNameOfComponent() + " is not working" + ".\n"; 
// 	}
// 	message+= "The water level in CM of the " + getNameOfComponent() + " is " + getWaterLevelCM() + ".\n";
// 	message+= "The temperature in celcius of the " + getNameOfComponent() + " is " + getTemperatureOfRadiatorCelcius() + ".\n";
// 	return message;
//    }
   
//    public void setRadiatorTemperatureInCelcius (double temperatureOfRadiatorCelcius ){
//         this.temperatureOfRadiatorCelcius  = temperatureOfRadiatorCelcius ; 
//     }

//    public double getTemperatureOfRadiatorCelcius (){
//         return this.temperatureOfRadiatorCelcius ;
//     }

//    public void setWaterLevelCM(double waterLevelCM){
//        this.waterLevelCM = waterLevelCM;
//     }
    
//    public double getWaterLevelCM(){
//        return this.waterLevelCM;
//     }

   
// }

