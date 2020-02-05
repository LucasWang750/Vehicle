public class SteeringWheel extends CarComponent{
  private String type;
  private double diameterInCM;
  public SteeringWheel(String nameOfComponent, boolean isWorking, String type, double diameterInCM){
    super(nameOfComponent, isWorking);
    this.type = type;
    this.diameterInCM = diameterInCM;
  }
  public String steer(){
    if (getIsWorking()){
      if (((int)(Math.random() * 100 + 1) < (diameterInCM * 0.25))){
      return damage() + "The steering wheel no longer steers.";
    }
      else {
      return "The steering wheel steers.";
    }
    }
    else {
      return "The steering wheel cannot steer because it has broken.";
    }
  }
  public String turn(){
    if (getIsWorking()){
      if (((int)(Math.random() * 100 + 1) < (diameterInCM * 0.5))){
      return damage() + "The steering wheel no longer steers.";
    }
    else {
      return "The steering wheel steers.";
    }
  }
    else {
      return "The steering hweel cannot steer because it is broken.";
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
    m += "The wheel type is " + getType() + " and the diameter of the wheel is " + getDiameterInCM() + ".";
    return m;
  }
  public String action1(){
    return steer();
  }
  public String action2(){
    return turn();
  }
  public String damage(){
    setIsWorking(false);
    return "The steering wheel has broken.";
  }
  public String fix(){
    setIsWorking(true);
    return "The steering wheel has been repaired.";
  }
  public void setType(String type){
    this.type = type;
  }
  public String getType(){
    return this.type;
  }
  public void setDiameterInCM(int diameterInCM){
    this.diameterInCM = diameterInCM;
  }
  public double getDiameterInCM(){
    return this.diameterInCM;
  }
}