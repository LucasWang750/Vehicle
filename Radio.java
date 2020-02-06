public class Radio extends CarComponent
{
    // instance variables
    private int numberOfSpeaker;
    private boolean circuitBoardIsWorking;
    private boolean resistorsIsWorking;
    private boolean capacitorsIsWorking;
    private boolean transformersIsWorking;
    private boolean transitorsIsWorking;
    private boolean integratedCircuitsIsWorking;
    private boolean speakerIsWorking;
    // there will always be more than 1 resistor, capacitor, transformer, transitor, and integrated circuits
    
    // constructors
    public Radio(int numberOfSpeaker, boolean circuitBoardIsWorking, boolean resistorsIsWorking, boolean capacitorsIsWorking, 
    boolean transformersIsWorking, boolean transitorsIsWorking, boolean integratedCircuitsIsWorking, boolean speakerIsWorking, boolean isWorking){
        super("radio", isWorking);
        this.numberOfSpeaker = numberOfSpeaker;
        this.circuitBoardIsWorking = circuitBoardIsWorking;
        this.resistorsIsWorking = resistorsIsWorking;
        this.capacitorsIsWorking = capacitorsIsWorking;
        this.transformersIsWorking = transformersIsWorking;
        this.transitorsIsWorking = transitorsIsWorking;
        this.integratedCircuitsIsWorking = integratedCircuitsIsWorking;
        this.speakerIsWorking = speakerIsWorking;
    }
    
    public Radio(int numberOfSpeaker, boolean isWorking){
        super("radio", isWorking);
        this.numberOfSpeaker = numberOfSpeaker;
        if(isWorking){
            this.circuitBoardIsWorking = true;
            this.resistorsIsWorking = true;
            this.capacitorsIsWorking = true;
            this.transformersIsWorking = true;
            this.transitorsIsWorking = true;
            this.integratedCircuitsIsWorking = true;
            this.speakerIsWorking = true;
        }
        else{
            this.circuitBoardIsWorking = false;
            this.resistorsIsWorking = false;
            this.capacitorsIsWorking = false;
            this.transformersIsWorking = false;
            this.transitorsIsWorking = false;
            this.integratedCircuitsIsWorking = false;
            this.speakerIsWorking = false;
        }
    }   
    
    
    // methods
    @Override
    public String damage(){
        this.circuitBoardIsWorking = false;
        this.resistorsIsWorking = false;
        this.capacitorsIsWorking = false;
        this.transformersIsWorking = false;
        this.transitorsIsWorking = false;
        this.integratedCircuitsIsWorking = false;
        this.speakerIsWorking = false;
        setIsWorking(false);
        return "The radio is now not working";
    }
    
    @Override
    public String fix(){
        this.circuitBoardIsWorking = true;
        this.resistorsIsWorking = true;
        this.capacitorsIsWorking = true;
        this.transformersIsWorking = true;
        this.transitorsIsWorking = true;
        this.integratedCircuitsIsWorking = true;
        this.speakerIsWorking = true;
        setIsWorking(true);
        return "The radio is now working";
    }
    
    public String playMusic(){
        checkAllParts();
        if(getIsWorking()){
           if(((int) (Math.random() * 100) + 1) * numberOfSpeaker < 10){
               return "The radio failed to play music.";
           }
           else{
               return "The radio played music.";
           }
        }
        else{
            return "The radio cannot play music.";
        }
    }
    
    public String playNews(){
        checkAllParts();
        if(getIsWorking()){
           if(((int) (Math.random() * 100) + 1) * numberOfSpeaker < 40){
               return "The radio failed to play the news.";
           }
           else{
               return "The radio is playing the news.";
           }
        }
        else{
            return "The radio cannot play the news.";
        }
    }
    
    @Override
    public boolean action1(){
        playMusic();
        return getIsWorking();
    }
    
    
    @Override
    public boolean action2(){
        playNews();
        return getIsWorking();
    }
    
    public void checkAllParts(){
        if(circuitBoardIsWorking && resistorsIsWorking && capacitorsIsWorking && transformersIsWorking && transitorsIsWorking && integratedCircuitsIsWorking && speakerIsWorking){
            setIsWorking(true);
        }
        else{
            setIsWorking(false);
        }
    }
    
    public void setNumberOfSpeaker(int number){
        this.numberOfSpeaker = number;
    }
    public int getNumberOfSpeaker(){
        return this.numberOfSpeaker;
    }
    
    public void setCircuitBoardIsWorking(boolean working){
        this.circuitBoardIsWorking = working;
    }
    public boolean getCircuitBoeardIsWorking(){
        return this.circuitBoardIsWorking;
    } 
    
    public void setResistorsIsWorking(boolean working){
        this.resistorsIsWorking = working;
    }
    public boolean getResistorsIsWorking(){
        return this.resistorsIsWorking;
    } 
    
    public void setCapacitorsIsWorking(boolean working){
        this.capacitorsIsWorking = working;
    }
    public boolean getCapacitorsIsWorking(){
        return this.capacitorsIsWorking;
    } 
    
    public void setTransformersIsWorking(boolean working){
        this.transformersIsWorking = working;
    }
    public boolean getTransformersIsWorking(){
        return this.transformersIsWorking;
    } 
    
    public void setTransitorsIsWorking(boolean working){
        this.transitorsIsWorking = working;
    }
    public boolean getTransitorsIsWorking(){
        return this.transitorsIsWorking;
    } 
    
    public void setIntegratedCircuitsIsWorking(boolean working){
        this.integratedCircuitsIsWorking = working;
    }
    public boolean getIntegratedCircuitsIsWorking(){
        return this.integratedCircuitsIsWorking;
    } 
    
    public void setSpeakerIsWorking(boolean working){
        this.speakerIsWorking = working;
    }
    public boolean getSpeakerIsWorking(){
        return this.speakerIsWorking;
    } 
}

//OLD CODE BELOW

// public class Radio extends CarComponent
// {
//     // instance variables
//     private int numberOfSpeaker;
//     private boolean circuitBoardIsWorking;
//     private boolean resistorsIsWorking;
//     private boolean capacitorsIsWorking;
//     private boolean transformersIsWorking;
//     private boolean transitorsIsWorking;
//     private boolean integratedCircuitsIsWorking;
//     private boolean speakerIsWorking;
//     // there will always be more than 1 resistor, capacitor, transformer, transitor, and integrated circuits
    
//     // constructors
//     public Radio(int numberOfSpeaker, boolean circuitBoardIsWorking, boolean resistorsIsWorking, boolean capacitorsIsWorking, 
//     boolean transformersIsWorking, boolean transitorsIsWorking, boolean integratedCircuitsIsWorking, boolean speakerIsWorking, boolean isWorking){
//         super("radio", isWorking);
//         this.numberOfSpeaker = numberOfSpeaker;
//         this.circuitBoardIsWorking = circuitBoardIsWorking;
//         this.resistorsIsWorking = resistorsIsWorking;
//         this.capacitorsIsWorking = capacitorsIsWorking;
//         this.transformersIsWorking = transformersIsWorking;
//         this.transitorsIsWorking = transitorsIsWorking;
//         this.integratedCircuitsIsWorking = integratedCircuitsIsWorking;
//         this.speakerIsWorking = speakerIsWorking;
//     }
    
//     public Radio(int numberOfSpeaker, boolean isWorking){
//         super("radio", isWorking);
//         this.numberOfSpeaker = numberOfSpeaker;
//         if(isWorking){
//             this.circuitBoardIsWorking = true;
//             this.resistorsIsWorking = true;
//             this.capacitorsIsWorking = true;
//             this.transformersIsWorking = true;
//             this.transitorsIsWorking = true;
//             this.integratedCircuitsIsWorking = true;
//             this.speakerIsWorking = true;
//         }
//         else{
//             this.circuitBoardIsWorking = false;
//             this.resistorsIsWorking = false;
//             this.capacitorsIsWorking = false;
//             this.transformersIsWorking = false;
//             this.transitorsIsWorking = false;
//             this.integratedCircuitsIsWorking = false;
//             this.speakerIsWorking = false;
//         }
//     }   
    
    
//     // methods
    
//     public String damage(){
//         this.circuitBoardIsWorking = false;
//         this.resistorsIsWorking = false;
//         this.capacitorsIsWorking = false;
//         this.transformersIsWorking = false;
//         this.transitorsIsWorking = false;
//         this.integratedCircuitsIsWorking = false;
//         this.speakerIsWorking = false;
//         setIsWorking(false);
//         return "The radio is now not working";
//     }
    
//     public String fix(){
//         this.circuitBoardIsWorking = true;
//         this.resistorsIsWorking = true;
//         this.capacitorsIsWorking = true;
//         this.transformersIsWorking = true;
//         this.transitorsIsWorking = true;
//         this.integratedCircuitsIsWorking = true;
//         this.speakerIsWorking = true;
//         setIsWorking(true);
//         return "The radio is now working";
//     }
    
//     public String playMusic(){
//         checkAllParts();
//         if(getIsWorking()){
//            if(((int) (Math.random() * 100) + 1) * numberOfSpeaker < 10){
//                return "The radio failed to play music.";
//            }
//            else{
//                return "The radio played music.";
//            }
//         }
//         else{
//             return "The radio cannot play music.";
//         }
//     }
    
//     public String playNews(){
//         checkAllParts();
//         if(getIsWorking()){
//            if(((int) (Math.random() * 100) + 1) * numberOfSpeaker < 40){
//                return "The radio failed to play the news.";
//            }
//            else{
//                return "The radio is playing the news.";
//            }
//         }
//         else{
//             return "The radio cannot play the news.";
//         }
//     }
    
//     public String action1(){
//         return playMusic();
//     }
    
//     public String action2(){
//         return playNews();
//     }
    
//     public void checkAllParts(){
//         if(circuitBoardIsWorking && resistorsIsWorking && capacitorsIsWorking && transformersIsWorking && transitorsIsWorking && integratedCircuitsIsWorking && speakerIsWorking){
//             setIsWorking(true);
//         }
//         else{
//             setIsWorking(false);
//         }
//     }
    
//     public void setNumberOfSpeaker(int number){
//         this.numberOfSpeaker = number;
//     }
//     public int getNumberOfSpeaker(){
//         return this.numberOfSpeaker;
//     }
    
//     public void setCircuitBoardIsWorking(boolean working){
//         this.circuitBoardIsWorking = working;
//     }
//     public boolean getCircuitBoeardIsWorking(){
//         return this.circuitBoardIsWorking;
//     } 
    
//     public void setResistorsIsWorking(boolean working){
//         this.resistorsIsWorking = working;
//     }
//     public boolean getResistorsIsWorking(){
//         return this.resistorsIsWorking;
//     } 
    
//     public void setCapacitorsIsWorking(boolean working){
//         this.capacitorsIsWorking = working;
//     }
//     public boolean getCapacitorsIsWorking(){
//         return this.capacitorsIsWorking;
//     } 
    
//     public void setTransformersIsWorking(boolean working){
//         this.transformersIsWorking = working;
//     }
//     public boolean getTransformersIsWorking(){
//         return this.transformersIsWorking;
//     } 
    
//     public void setTransitorsIsWorking(boolean working){
//         this.transitorsIsWorking = working;
//     }
//     public boolean getTransitorsIsWorking(){
//         return this.transitorsIsWorking;
//     } 
    
//     public void setIntegratedCircuitsIsWorking(boolean working){
//         this.integratedCircuitsIsWorking = working;
//     }
//     public boolean getIntegratedCircuitsIsWorking(){
//         return this.integratedCircuitsIsWorking;
//     } 
    
//     public void setSpeakerIsWorking(boolean working){
//         this.speakerIsWorking = working;
//     }
//     public boolean getSpeakerIsWorking(){
//         return this.speakerIsWorking;
//     } 
// }
