import java.util.Math;
public class Vehicle{
    //Instances
    private String color;
    private String nameOfCar;
    private String typeOfCar;
    private String fuelType;
    private double weightInPounds;
    private double lengthInFeet;
    private double maxSpeedMph;
    private double costOfCarInDollars;
    private boolean carIsOn;
    private boolean carIsWorking;
    private double crashPotentialPercentage;

    private Engine engine;
    private SteeringWheel steeringWheel;
    private Battery battery;
    private FuelTank fuelTank;
    private Brake brake;
    private Transmission transmission;
    private GasPedal gasPedal;
    private Radiator radiator;


    //Constructor
    public Vehicle(String color, String nameOfCar,String typeOfCar, String fuelType,
                   double weightInPounds, double lengthInFeet, double maxSpeedMph,
                   double costOfCarInDollars, boolean carIsOn, boolean carIsWorking,
                   double crashPotentialPercentage,
                   String nameOfEngine, int numberOfEngineCylinders, int engineTemperature, boolean engineIsWorking,
                   String nameOfSteeringWheel, boolean steeringWheelIsWorking, String steeringWheelType, double steeringWheelDiameterInCM,
                   String nameOfBattery, String batteryColor, int batteryCapacityInYears, double batteryVoltageInVolts, boolean batteryIsWorking,
                   String nameOfFuelTank, boolean fuelTankIsWorking, int fuelTankOilInGallons, double fuelTankCapacityInGallons,
                   String nameOfBrake, int brakeDiscSizeInCM, double brakePadThicknessInMM, boolean brakeIsWorking,
                   int transmissionNumberOfPlanetGear, int transmissionNumberOfRingGear, int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet,
                   double transmissionGearRatio, double transmissionAmountOfTransmissionFluidInQuarts, boolean transmissionValveBodyIsWorking,
                   boolean transmissionSensorIsWorking, boolean transmissionClutchesAndBandsIsWorking, boolean transmissionTorqueConverterIsWorking,
                   boolean transmissionPlanetaryGearSetIsWorking, boolean transmissionSunGearIsWorking, boolean transmissionPlanetGearIsWorking,
                   boolean transmissionRingGearIsWorking, boolean transmissionPumpIsWorking, boolean transmissionIsWorking,
                   String nameOfGasPedal, boolean gasPedalisWorking, double gasPedalSurfaceAreaInCentimeters,
                   String nameOfRadiator, double radiatorTemperatureOfRadiatorCelcius, boolean radiatorIsWorking, double radiatorWaterLevelCM
                   )
    {
        this.color = color;
        this.nameOfCar = nameOfCar;
        this.typeOfCar = typeOfCar;
        this.fuelType = fuelType;
        this.weightInPounds = weightInPounds;
        this.lengthInFeet = lengthInFeet;
        this.maxSpeedMph = maxSpeedMph;
        this.costOfCarInDollars = costOfCarInDollars;
        this.carIsWorking = carIsWorking;
        this.carIsOn = carIsOn;
        if(crashPotentialPercentage > 100){
            this.crashPotentialPercentage=100.0;
        } else if(crashPotentialPercentage < 0){
            this.crashPotentialPercentage=0.0;
        }
        this.crashPotentialPercentage = crashPotentialPercentage;
        engine = new Engine(nameOfEngine, numberOfEngineCylinders, engineTemperature, engineIsWorking);
        steeringWheel = new SteeringWheel(nameOfSteeringWheel, steeringWheelIsWorking, steeringWheelType, steeringWheelDiameterInCM);
        battery = new Battery(nameOfBattery, batteryColor, batteryCapacityInYears, batteryVoltageInVolts, batteryIsWorking);
        fuelTank = new FuelTank(nameOfFuelTank, fuelTankIsWorking, fuelTankOilInGallons, fuelTankCapacityInGallons);
        brake = new Brake(nameOfBrake, brakeDiscSizeInCM, brakePadThicknessInMM, brakeIsWorking);
        transmission = new Transmission(transmissionNumberOfPlanetGear,transmissionNumberOfRingGear, transmissionNumberOfSunGear, transmissionNumberOfPlanetaryGearSet,
                transmissionGearRatio, transmissionAmountOfTransmissionFluidInQuarts, transmissionValveBodyIsWorking, transmissionSensorIsWorking, transmissionClutchesAndBandsIsWorking,
                transmissionTorqueConverterIsWorking, transmissionPlanetaryGearSetIsWorking, transmissionSunGearIsWorking, transmissionPlanetGearIsWorking,
                transmissionRingGearIsWorking, transmissionPumpIsWorking, transmissionIsWorking);
        gasPedal = new GasPedal(nameOfGasPedal, gasPedalisWorking, gasPedalSurfaceAreaInCentimeters);
        radiator = new Radiator(radiatorTemperatureOfRadiatorCelcius, radiatorIsWorking, radiatorWaterLevelCM, nameOfRadiator);
    }

    //Methods

    public String start()
    {
        if (carIsWorking){
            carIsOn = true;
            return "car is on!";
        }else{
            return "The car is not working.";
        }

    }
    public String toString()
    {
        String message="The "+getNameOfCar()+ " is "+ getTypeOfcar +".\n";
        message+="The color of the car is "+getColor+".\n";
        message+="The fuel type of the car is "+getFuelType+".\n";
        message+="The length of the car is "+getLengthInFeet+ " in feet.\n";
        message+="The max speed of the car is "+getMaxSpeedMph+ " in mph.\n";
        message+="The cost of the car is "+getCostOfCarInDollars+"in dollars.\n";
        message+="The weight of the car is "+getWeightInPounds+"in pounds.\n";
        message+="The crash potential percentage of the car is "+getCrashPotentialPercentage+".\n";
        if(carIsWorking){
            message += "The car is working.\n";
        }else{
            message += "The car is not working.\n";
        }
        if(carIsOn){
            message+="The car is on.\n";
        }else{
            message += "The car is not on.\n";
        }


        return message;
    }

    /*
    private Door[] doors;
      private Tire[] tires;
      private Engine engine;
      private SteeringWheel steeringWheel;
      private Battery battery;
      private FuelTank fuelTank;
      private Brake brake;
      private Transmission transmission;
      private WheelAxle[] wheelAxles;
      private GasPedal gasPedal;
      private Seat[] seats;
      private Radiator radiator;
      */
    public String fixAll(){
        for(Door d:doors){
            d.fix();
        }
        for(Tire t:tires){
            t.fix();
        }
        for(WheelAxle w:wheelAxles){
            w.fix();
        }
        for(Seat s:seats){
            s.fix();
        }
        engine.fix();
        steeringWheel.fix();
        battery.fix();
        fuelTank.fix();
        brake.fix();
        transmission.fix();
        gasPedal.fix();
        radiator.fix();
        carIsWorking=true;
        return "This "+nameOfCar+" is now repaired";
    }
    public void update(){
        if(engine.getIsWorking()){
            carIsWorking=false;
        }
        if(!carIsWorking){
            for(Door d:doors){
                d.damage();
            }
            for(Tire t:tires){
                t.damage();
            }
            for(WheelAxle w:wheelAxles){
                w.damage();
            }
            for(Seat s:seats){
                s.damage();
            }
            engine.damage();
            steeringWheel.damage();
            battery.damage();
            fuelTank.damage();
            brake.damage();
            transmission.damage();
            gasPedal.damage();
            radiator.damage();
        }
    }
    public String damageAll(){

        for(Door d:doors){
            d.damage();
        }
        for(Tire t:tires){
            t.damage();
        }
        for(WheelAxle w:wheelAxles){
            w.damage();
        }
        for(Seat s:seats){
            s.damage();
        }
        engine.damage();
        steeringWheel.damage();
        battery.damage();
        fuelTank.damage();
        brake.damage();
        transmission.damage();
        gasPedal.damage();
        radiator.damage();
        carIsWorking=false;
        return "This "+nameOfCar+" is broken";

    }

    public String drive(double mph){
        String message = "";
        update();
        if(!carIsWorking){
            return "This "+ nameOfCar +" is not working and you cannot drive it";
        }
        if(!carIsOn){
            return "This "+nameOfCar+" needs to be on to drive.";
        }else if (mph > maxSpeedMph) {
            return "You attempt to drive the car at a high speed. Crash potential increased. "
        }


        return message;
    }

    public String action1(){
        return "";
    }

    public String action2(){
        return "";
    }




    //getter and setter
    //--------------------setters-----------------
    public void setColor(String color)
    {
        this.color=color;
    }
    public void setNameOfCar(String nameOfCar)
    {
        this.nameOfCar=nameOfCar;
    }
    public void setFuelType(String fuelType)
    {
        this.fuelType=fuelType;
    }
    public void setWeightInPounds(double weightInPounds)
    {
        this.weightInPounds=weightInPounds;
    }
    public void setLengthInFeet(String lengthInFeet)
    {
        this.lengthInFeet=lengthInFeet;
    }
    public void setMaxSpeedMph(double maxSpeedMph)
    {
        this.maxSpeedMph=maxSpeedMph;
    }
    public void setCostOfCarInDollars(double costOfCarInDollars)
    {
        this.costOfCarInDollars=costOfCarInDollars;
    }
    public void setCarIsOn(boolean carIsOn)
    {
        this.carIsOn = carIsOn;
    }
    public void setCarIsWorking(boolean carIsWorking)
    {
        this.carIsWorking = carIsWorking;
    }
    public void setCrashPotentialPercentage(double crashPotentialPercentage)
    {
        this.crashPotentialPercentage=crashPotentialPercentage;
    }
    public void setTypeOfCar(String typeOfCar){
        this.typeOfCar=typeOfCar;
    }

//--------------------getters---------------------

    public String getColor()
    {
        return color;
    }

    public String getNameOfCar()
    {
        return nameOfCar;
    }
    public String getFuelType()
    {
        return fuelType;
    }
    public double getWeightInPounds()
    {
        return weightInPounds;
    }
    public double getLengthInFeet()
    {
        return lengthInFeet;
    }
    public double getMaxSpeedMph()
    {
        return maxSpeedMph;
    }
    public double getCostOfCarInDollars()
    {
        return costOfCarInDollars;
    }
    public boolean getCarIsOn()
    {
        return carIsOn;
    }
    public boolean getCostOfCarIsWorking()
    {
        return carIsWoking;
    }
    public double getCrashPotentialPercentage()
    {
        return crashPotentialPercentage;
    }
    public String getTypeOfCar(){
        return typeOfCar;
    }
    //getters (parts)
    public Engine getEngine(){
        return this.engine;
    }

    public SteeringWheel getSteeringWheel(){
        return this.steeringWheel;
    }
    public Battery getBattery(){
        return this.battery;
    }
    public FuelTank getFuelTank(){
        return this.fuelTank;
    }
    public Brake getBrake(){
        return this.brake;
    }
    public Transmission getTransmission(){
        return this.transmission;
    }
    public Tires[] getTires(){
        return this.tires;
    }

    public Radiator getRadiator(){
        return this.radiatior;
    }

    public GasPedal getGasPedal(){
        return this.gasPedal;
    }

    public WheelAxle[] getWheelAxles(){
        return wheelAxles;
    }
}
