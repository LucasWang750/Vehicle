
/**
 * Write a description of class Seat here.
 *
 * @author (Timothy)
 * @version (a version number or a date)
 */
public class Seat extends CarComponent
{
    //instance variables
    private int seatBeltLengthInInches;//legally have to be 152 - 229 cm long
    //private boolean isWorking;
    //private String nameOfComponent; 
    //constructors 
    public Seat(String nameOfComponent, boolean isWorking, int seatBeltLengthInInches){
        super(nameOfComponent, isWorking);
        //this.isWorking = true;
        this.seatBeltLengthInInches = 152;
       // this.nameOfComponent = nameOfComponent;
    }

    public Seat(boolean isWorking, int seatBeltLengthInInches){
        super("SeatName",isWorking);
        //this.isWorking = isWorking;
        //this.seatBeltLengthInInches = seatBeltLengthInInches;

    }

    //methods, accessors, mutators
    @Override
    public String fix(){
        setIsWorking(true);
        return "The seat is now in working condition";
    }
    
    @Override
    public boolean action1(){
        useSeatBelt();   
        return getIsWorking();
    }

    public String useSeatBelt(){
        if (getIsWorking()){
            if(Math.random()*100+1 < 95)
                return damage() + "The "+getNameOfComponent()+ " is broken and you can not get into the car.";
            else
                return "The "+getNameOfComponent()+ " works and you are safe.";
        }
        else
            return "The " +getNameOfComponent()+ " is broken and you can not get into the car.";
    }
    
    @Override
    public String damage(){
        setIsWorking(false);
        return "";
    }

    public void setSeatBeltLengthInInches (int seatBeltLengthInInches ){
        this.seatBeltLengthInInches  = seatBeltLengthInInches ; 
    }

    public int getSeatBeltLengthInInches (){
        return this.seatBeltLengthInInches ;
    }

 
}

//OLD CODE BELOW

// /**
//  * Write a description of class Seat here.
//  *
//  * @author (Timothy)
//  * @version (a version number or a date)
//  */
// public class Seat extends carComponent
// {
//     //instance variables
//     private int seatBeltLengthInCm;//legally have to be 152 - 229 cm long
//     //private boolean isWorking;
//     //private String nameOfComponent; 
//     //constructors 
//     public Seat(String nameOfComponent, boolean isWorking, int seatBeltLengthInCm){
//         super(nameOfComponent, isWorking);
//         //this.isWorking = true;
//         this.seatBeltLengthInCm = 152;
//        // this.nameOfComponent = nameOfComponent;
//     }

//     public Seat(boolean isWorking, int seatBeltLengthInCm){
//         super("SeatName",isWorking);
//         //this.isWorking = isWorking;
//         //this.seatBeltLeng"sethInCm = seatBeltLengthInCm;

//     }

//     //methods, accessors, mutators
//     public String fix(){
//         setIsWorking(true);
//         return "The seat is now in working condition";
//     }

//     public String action1(){
//         return useSeatBelt();   
//     }

//     public String useSeatBelt(){
//         if (getIsWorking()){
//             if(Math.random()*100+1 < 95)
//                 return damage() + "The "+getNameOfComponent()+ " is broken and you can not get into the car.";
//             else
//                 return "The "+getNameOfComponent()+ " works and you are safe.";
//         }
//         else
//             return "The " +getNameOfComponent()+ " is broken and you can not get into the car.";
//     }

//     public String damage(){
//         setIsWorking(false);
//         return "";
//     }

//     public void setSeatBeltLengthInCm (int seatBeltLengthInCm ){
//         this.seatBeltLengthInCm  = seatBeltLengthInCm ; 
//     }

//     public int getSeatBeltLengthInCm (){
//         return this.seatBeltLengthInCm ;
//     }

 
// }
