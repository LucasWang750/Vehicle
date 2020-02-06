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
    private boolean carIsOn = false;
    private boolean carIsWorking;
    private double crashPotentialPercentage;
    private double speedOfCarMph;

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
                   double costOfCarInDollars, boolean carIsWorking,
                   double crashPotentialPercentage, double speedOfCarMph,
                   String nameOfEngine, int numberOfEngineCylinders, int engineTemperatureInFahrenheit, boolean engineIsWorking,
                   String nameOfSteeringWheel, boolean steeringWheelIsWorking, String steeringWheelType, double steeringWheelDiameterInInches,
                   String nameOfBattery, String batteryColor, int batteryCapacityInYears, double batteryVoltageInVolts, boolean batteryIsWorking,
                   String nameOfFuelTank, boolean fuelTankIsWorking, int fuelTankOilInGallons, double fuelTankCapacity,
                   String nameOfBrake, int brakeDiscSizeInInches, double brakePadThicknessInInches, boolean brakeIsWorking,
                   int transmissionNumberOfPlanetGear, int transmissionNumberOfRingGear, int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet,
                   double transmissionGearRatio, double transmissionAmountOfTransmissionFluidInQuarts, boolean transmissionValveBodyIsWorking,
                   boolean transmissionSensorIsWorking, boolean transmissionClutchesAndBandsIsWorking, boolean transmissionTorqueConverterIsWorking,
                   boolean transmissionPlanetaryGearSetIsWorking, boolean transmissionSunGearIsWorking, boolean transmissionPlanetGearIsWorking,
                   boolean transmissionRingGearIsWorking, boolean transmissionPumpIsWorking, boolean transmissionIsWorking,
                   String nameOfGasPedal, boolean gasPedalIsWorking, double gasPedalSurfaceAreaInInches,
                   String nameOfRadiator, double radiatorTemperatureOfRadiatorFahrenheit, boolean radiatorIsWorking, double radiatorWaterLevelInches
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
        if(crashPotentialPercentage > 100){
            this.crashPotentialPercentage=100.0;
        } else if(crashPotentialPercentage < 0){
            this.crashPotentialPercentage=0.0;
        }
        this.crashPotentialPercentage = crashPotentialPercentage;

        this.speedOfCarMph = speedOfCarMph;
        engine = new Engine(nameOfEngine, numberOfEngineCylinders, engineTemperatureInFahrenheit, engineIsWorking);
        steeringWheel = new SteeringWheel(nameOfSteeringWheel, steeringWheelIsWorking, steeringWheelType, steeringWheelDiameterInInches);
        battery = new Battery(nameOfBattery, batteryColor, batteryCapacityInYears, batteryVoltageInVolts, batteryIsWorking);
        fuelTank = new FuelTank(nameOfFuelTank, fuelTankIsWorking, fuelTankOilInGallons, fuelTankCapacity);
        brake = new Brake(nameOfBrake, brakeDiscSizeInInches, brakePadThicknessInInches, brakeIsWorking);
        transmission = new Transmission(transmissionNumberOfPlanetGear,transmissionNumberOfRingGear, transmissionNumberOfSunGear, transmissionNumberOfPlanetaryGearSet,
                transmissionGearRatio, transmissionAmountOfTransmissionFluidInQuarts, transmissionValveBodyIsWorking, transmissionSensorIsWorking, transmissionClutchesAndBandsIsWorking,
                transmissionTorqueConverterIsWorking, transmissionPlanetaryGearSetIsWorking, transmissionSunGearIsWorking, transmissionPlanetGearIsWorking,
                transmissionRingGearIsWorking, transmissionPumpIsWorking, transmissionIsWorking);
        gasPedal = new GasPedal(nameOfGasPedal, gasPedalIsWorking, gasPedalSurfaceAreaInInches);
        radiator = new Radiator(radiatorTemperatureOfRadiatorFahrenheit, radiatorIsWorking, radiatorWaterLevelInches, nameOfRadiator);
    }

    public Vehicle(String color, String nameOfCar, String typeOfCar, String fuelType,
                   double weightInPounds, double lengthInFeet, double maxSpeedMph,
                   double costOfCarInDollars, boolean carIsWorking,
                   double crashPotentialPercentage, double speedOfCarMph,
                   int numberOfEngineCylinders, int engineTemperatureInFahrenheit,
                    String steeringWheelType, double steeringWheelDiameterInInches,
                   String batteryColor, int batteryCapacityInYears, double batteryVoltageInVolts,
                   int fuelTankOilInGallons, int fuelTankCapacity,
                   int brakeDiscSizeInInches, double brakePadThicknessInInches,
                   int transmissionNumberOfPlanetGear, int transmissionNumberOfRingGear, int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet,
                   double transmissionGearRatio, double transmissionAmountOfTransmissionFluidInQuarts,
                   double gasPedalSurfaceAreaInInches,
                   double radiatorTemperatureOfRadiatorFahrenheit, double radiatorWaterLevelInches
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
        if(crashPotentialPercentage > 100){
            this.crashPotentialPercentage=100.0;
        } else if(crashPotentialPercentage < 0){
            this.crashPotentialPercentage=0.0;
        }
        this.crashPotentialPercentage = crashPotentialPercentage;

        this.speedOfCarMph = speedOfCarMph;
        engine = new Engine("engine", numberOfEngineCylinders, engineTemperatureInFahrenheit, true);
        steeringWheel = new SteeringWheel("steering wheel", true, steeringWheelType, steeringWheelDiameterInInches);
        battery = new Battery("battery", batteryColor, batteryCapacityInYears, batteryVoltageInVolts, true);
        fuelTank = new FuelTank("fuel tank", true, fuelTankOilInGallons, fuelTankCapacity);
        brake = new Brake("brake", brakeDiscSizeInInches, brakePadThicknessInInches, true);
        transmission = new Transmission(transmissionNumberOfPlanetGear,transmissionNumberOfRingGear, transmissionNumberOfSunGear, transmissionNumberOfPlanetaryGearSet,
                transmissionGearRatio, transmissionAmountOfTransmissionFluidInQuarts, true, true, true,
                true, true, true, true,
                true, true, true);
        gasPedal = new GasPedal("gas pedal", true, gasPedalSurfaceAreaInInches);
        radiator = new Radiator(radiatorTemperatureOfRadiatorFahrenheit, true, radiatorWaterLevelInches, "radiator");
    }

    //Methods

    public String start()
    {
        if (carIsWorking && getEngine().getIsWorking() && getBattery().getIsWorking()
        && getFuelTank().getFuelTankCapacity() > 0 && getTransmission().getAmountOfTransmissionFluidInQuarts() > 0 && getRadiator().getIsWorking())
        {
            carIsOn = true;
            return "car is on!";
        }else{
            carIsOn = false;
            return "The car is not working.";
        }

    }

    @Override
    public String toString()
    {
        String message= description();
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
        if(getEngine().getIsWorking()){
            message+="The engine is working.\n";
        }else{
            message += "The engine is not working.\n";
        }
        if(getSteeringWheel().getIsWorking()){
            message+="The steering wheel is working.\n";
        }else{
            message += "The steering wheel is not working.\n";
        }
        if(getBattery().getIsWorking()){
            message+="The battery is working.\n";
        }else{
            message += "The battery is not working.\n";
        }
        if(getFuelTank().getIsWorking()){
            message+="The car has fuel.\n";
        }else{
            message += "The car does not have fuel.\n";
        }
        if(getBrake().getIsWorking()){
            message+="The brake is working.\n";
        }else{
            message += "The brake is not working.\n";
        }
        if(getTransmission().getIsWorking()){
            message+="The transmission is working.\n";
        }else{
            message += "The transmission is not working.\n";
        }
        if(getGasPedal().getIsWorking()){
            message+="The gas pedal is working.\n";
        }else{
            message += "The gas pedal is not working.\n";
        }
        if(getRadiator().getIsWorking()){
            message+="The radiator is working.\n";
        }else{
            message += "The radiator is not working.\n";
        }
        return message;
    }

    public String description(){
        String message="The "+getNameOfCar()+ " is "+ typeOfCar +".\n";
        message+= "The color of the car is "+ color+".\n";
        message+="The fuel type of the car is "+fuelType+".\n";
        message+="The length of the car is "+lengthInFeet+ " feet.\n";
        message+="The max speed of the car is "+ maxSpeedMph + " in mph.\n";
        message+="The cost of the car is "+costOfCarInDollars+" in dollars.\n";
        message+="The weight of the car is "+ weightInPounds + " in pounds.\n";
        message+="The crash potential percentage of the car is "+crashPotentialPercentage+".\n";
        message+="The speed of the car is " + speedOfCarMph +".\n";
        return message;
    }

    public String fix(){
        System.out.println(engine.fix());
        System.out.println(steeringWheel.fix());
        System.out.println(battery.fix());
        System.out.println(fuelTank.fix());
        System.out.println(brake.fix());
        System.out.println(transmission.fix());
        System.out.println(gasPedal.fix());
        System.out.println(radiator.fix());
        carIsWorking=true;
        return "This " + nameOfCar +" is now working and every part repaired the total cost is: $1200.";
    }

    public boolean drive(){
        speedOfCarMph = 60;
        start();
        String message = "";
        if(!carIsWorking){
            System.out.println("This " + nameOfCar +" is not working and you cannot drive it.");
            return false;
        }
        if(!carIsOn || !(getSteeringWheel().getIsWorking())){
            System.out.println("This "+nameOfCar+" cannot drive because of certain part failures.");
            return false;
        }
        return true;
    }

    public boolean drive(double mph){
        speedOfCarMph = mph;
        String message = "";
        if(!carIsWorking){
            System.out.println("This "+ nameOfCar +" is not working and you cannot drive it.");
            return false;
        }
        if(!carIsOn || !(getSteeringWheel().getIsWorking())){
            System.out.println("This "+nameOfCar+" cannot drive because of certain part failures.");
            return false;
        }else if (mph > maxSpeedMph) {
            System.out.println("You attempt to drive the car at a high speed. Crash potential increased. ");
            return false;
        }


        return true;
    }

    public boolean action1(){
        return true;
    }

    public boolean action2(){
        return true;
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
    public void setLengthInFeet(double lengthInFeet)
    {
        this.lengthInFeet = lengthInFeet;
    }
    public void setMaxSpeedMph(double maxSpeedMph)
    {
        this.maxSpeedMph = maxSpeedMph;
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

    public void setSpeedOfCarMph(double speedOfCarMph){
        this.speedOfCarMph = speedOfCarMph;
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
    public boolean getCarIsWorking()
    {
        return carIsWorking;
    }
    public double getCrashPotentialPercentage()
    {
        return crashPotentialPercentage;
    }
    public String getTypeOfCar(){
        return typeOfCar;
    }

    public double getSpeedOfCarMph(){
        return speedOfCarMph;
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
    public Transmission getTransmission() {
        return this.transmission;
    }

    public Radiator getRadiator(){
        return this.radiator;
    }

    public GasPedal getGasPedal(){
        return this.gasPedal;
    }

}
