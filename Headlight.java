public class Headlight extends CarComponent{
  private String bulbType;
  private String color;
  private double bulbLengthInInches;
  private double windowLengthInInches;
  
  public Headlight(String nameOfComponent, boolean isWorking, String bulbType, String color, double bulbLengthInInches, double windowLengthInInches){
    super(nameOfComponent,isWorking);
    this.bulbType = bulbType;
    this.color = color;
    this.bulbLengthInInches = bulbLengthInInches;
    this.windowLengthInInches = windowLengthInInches;
  }
  public String flashLight(){
    if(getIsWorking()){
      if (((int)(Math.random() * 100 + 1) < ((bulbLengthInInches * 5.0) + (windowLengthInInches * 0.05)))){
      damage();
      return "The headlight no longer lights.";
    }
    else {
      return "The headlight lights up.";
    }
    }
    else{
      return "The headlight doesn't light up.";
    }
  }
  public String glareLight(){
    if(getIsWorking()){
      if (((int)(Math.random() * 100 + 1) < ((bulbLengthInInches * 5.5) + (windowLengthInInches * 0.10)))){
      damage();
      return "The headlight no longer lights.";
    }
    else {
      return "The headlight lights up.";
    }
    }
    else{
      return "The headlight doesn't light up.";
    }
  }

  public String toString(){
    String m = "";
    m += "This is the " + getNameOfComponent() + " and it is ";
    if (getIsWorking()){
      m += "working ";
    }
    else{
      m+= "not working. ";
    }
    m += "The bulb type is " + getBulbType() + ",the color of the bulb is " + getColor() + ",the bulb length in inches is " + getBulbLengthInInches() + ",and the window length in centimeters is " + getWindowLengthInInches() + ".";
    return m;
  }
  
  @Override
  public boolean action1(){
      flashLight();
      return getIsWorking();
  }
  
  @Override
  public boolean action2(){
    glareLight();
    return getIsWorking();
  }
  
  @Override
  public String damage(){
    setIsWorking(false);
    return "The headlight is damaged.";
  }
  
  @Override
  public String fix(){
    setIsWorking(true);
    return "The headlight is fixed.";
  }
  
  public void setBulbType(String type){
    this.bulbType = type;
  }
  public String getBulbType(){
    return this.bulbType;
  }
  public void setColor(String color){
    this.color = color;
  }
  public String getColor(){
    return this.color;
  }
  public void setBulbLengthInInches(double bulbLengthInInches){
    this.bulbLengthInInches = bulbLengthInInches;
  }
  public double getBulbLengthInInches(){
    return this.bulbLengthInInches;
  }
  public void setWindowLengthInInches(double windowLengthInInches){
    this.windowLengthInInches = windowLengthInInches;
  }
  public double getWindowLengthInInches(){
    return this.windowLengthInInches;
  }

}

//OLD CODE BELOW

// public class Headlight extends CarComponent{
//   private String bulbType;
//   private String color;
//   private double bulbLengthInCM;
//   private double windowLengthInCM;
  
//   public Headlight(String nameOfComponent, boolean isWorking, String bulbType, String color, double bulbLengthInCM, double windowLengthInCM){
//     super(nameOfComponent,isWorking);
//     this.bulbType = bulbType;
//     this.color = color;
//     this.bulbLengthInCM = bulbLengthInCM;
//     this.windowLengthInCM = windowLengthInCM;
//   }
//   public String flashLight(){
//     if(getIsWorking()){
//       if (((int)(Math.random() * 100 + 1) < ((bulbLengthInCM * 5.0) + (windowLengthInCM * 0.05)))){
//       damage();
//       return "The headlight no longer lights.";
//     }
//     else {
//       return "The headlight lights up.";
//     }
//     }
//     else{
//       return "The headlight doesn't light up.";
//     }
//   }
//   public String glareLight(){
//     if(getIsWorking()){
//       if (((int)(Math.random() * 100 + 1) < ((bulbLengthInCM * 5.5) + (windowLengthInCM * 0.10)))){
//       damage();
//       return "The headlight no longer lights.";
//     }
//     else {
//       return "The headlight lights up.";
//     }
//     }
//     else{
//       return "The headlight doesn't light up.";
//     }
//   }

//   public String toString(){
//     String m = "";
//     m += "This is the " + getNameOfComponent() + " and it is ";
//     if (getIsWorking()){
//       m += "working ";
//     }
//     else{
//       m+= "not working. ";
//     }
//     m += "The bulb type is " + getBulbType() + ",the color of the bulb is " + getColor() + ",the bulb length in centimeters is " + getBulbLengthInCM() + ",and the window length in centimeters is " + getWindowLengthInCM() + ".";
//     return m;
//   }
//   public String action1(){
//     return flashLight();
//   }
//   public String action2(){
//     return glareLight();
//   }
//   public String damage(){
//     setIsWorking(false);
//     return "The headlight is damaged.";
//   }
//   public String fix(){
//     setIsWorking(true);
//     return "The headlight is fixed.";
//   }
//   public void setBulbType(String type){
//     this.bulbType = type;
//   }
//   public String getBulbType(){
//     return this.bulbType;
//   }
//   public void setColor(String color){
//     this.color = color;
//   }
//   public String getColor(){
//     return this.color;
//   }
//   public void setBulbLengthInCM(double bulbLengthInCM){
//     this.bulbLengthInCM = bulbLengthInCM;
//   }
//   public double getBulbLengthInCM(){
//     return this.bulbLengthInCM;
//   }
//   public void setWindowLengthInCM(double windowLengthInCM){
//     this.windowLengthInCM = windowLengthInCM;
//   }
//   public double getWindowLengthInCM(){
//     return this.windowLengthInCM;
//   }

// }