public class Coupe extends Vehicle
{
    //instance variables
    private Radio mainRadio;
    private Headlight leftHeadlight;
    private Headlight rightHeadlight;
    private Trunk mainTrunk;
    private Seat leftSeat;
    private Seat rightSeat;
    private Door leftDoor;
    private Door rightDoor;
    private Wheel frontRightWheel;
    private Wheel frontLeftWheel;
    private Wheel backRightWheel;
    private Wheel backLeftWheel;
    private CarComponent[] arr = new CarComponent[12];

    //constructors
    public Coupe(String color, String nameOfCar, String typeOfCar, String fuelType,
                 double weightInPounds, double lengthInFeet, double maxSpeedMph,
                 double costOfCarInDollars, boolean carIsWorking,
                 double crashPotentialPercentage,
                 int numberOfEngineCylinders, int engineTemperatureInFahrenheit,
                 String steeringWheelType, double steeringWheelDiameterInInches,
                 String batteryColor, int batteryCapacityInYears, double batteryVoltageInVolts,
                 int fuelTankOilInGallons, int fuelTankCapacity,
                 int brakeDiscSizeInInches, double brakePadThicknessInInches,
                 int transmissionNumberOfPlanetGear, int transmissionNumberOfRingGear, int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet,
                 double transmissionGearRatio, double transmissionAmountOfTransmissionFluidInQuarts,
                 double gasPedalSurfaceAreaInInches,
                 double radiatorTemperatureOfRadiatorFahrenheit, double radiatorWaterLevelInches, int numberOfSpeaker,
                 int trunkDiameterInFeet, boolean radioIsWorking)
    {
        super(color, nameOfCar, typeOfCar, fuelType,
                weightInPounds, lengthInFeet, maxSpeedMph,
                costOfCarInDollars, carIsWorking,
                crashPotentialPercentage,
                numberOfEngineCylinders,engineTemperatureInFahrenheit,
                steeringWheelType, steeringWheelDiameterInInches,
                batteryColor, batteryCapacityInYears, batteryVoltageInVolts,
                fuelTankOilInGallons, fuelTankCapacity,
                brakeDiscSizeInInches, brakePadThicknessInInches,
                transmissionNumberOfPlanetGear, transmissionNumberOfRingGear, transmissionNumberOfSunGear, transmissionNumberOfPlanetaryGearSet,
                transmissionGearRatio, transmissionAmountOfTransmissionFluidInQuarts,
                gasPedalSurfaceAreaInInches,
                radiatorTemperatureOfRadiatorFahrenheit, radiatorWaterLevelInches);

        this.mainRadio = new Radio(numberOfSpeaker, radioIsWorking, true);
        this.leftHeadlight = new Headlight(" red", "yellow", 2.0,2.0);
        this.rightHeadlight = new Headlight(" yellow", "red", 2.0,2.0 );
        this.leftSeat = new Seat(true, 2, 2);
        this.rightSeat = new Seat(true, 2, 2);
        this.mainTrunk = new Trunk(trunkDiameterInFeet);
        this.leftDoor = new Door(true, 2, true, true, true, "door");
        this.rightDoor = new Door(true, 2, true, true, true, "door");
        this.frontLeftWheel = new Wheel(2,2);
        this.frontRightWheel = new Wheel(2,2);
        this.backLeftWheel = new Wheel(2,2);
        this.backRightWheel = new Wheel(2,2);
        arr[0] = mainRadio;
        arr[1] = leftHeadlight;
        arr[2] = rightHeadlight;
        arr[3] = leftSeat;
        arr[4] = rightSeat;
        arr[5] = mainTrunk;
        arr[6] = leftDoor;
        arr[7] = rightDoor;
        arr[8] = frontLeftWheel;
        arr[9] = frontRightWheel;
        arr[10] =backLeftWheel;
        arr[11] =backRightWheel;
    }

    public Coupe(String color, String nameOfCar, String typeOfCar, String fuelType,
                 double weightInPounds, double lengthInFeet, double maxSpeedMph,
                 double costOfCarInDollars,
                 double crashPotentialPercentage,
                 int numberOfEngineCylinders, int engineTemperatureInFahrenheit,
                 String steeringWheelType, double steeringWheelDiameterInInches,
                 String batteryColor, int batteryCapacityInYears, double batteryVoltageInVolts,
                 int fuelTankOilInGallons, int fuelTankCapacity,
                 int brakeDiscSizeInInches, double brakePadThicknessInInches,
                 int transmissionNumberOfPlanetGear, int transmissionNumberOfRingGear, int transmissionNumberOfSunGear, int transmissionNumberOfPlanetaryGearSet,
                 double transmissionGearRatio, double transmissionAmountOfTransmissionFluidInQuarts,
                 double gasPedalSurfaceAreaInInches,
                 double radiatorTemperatureOfRadiatorFahrenheit, double radiatorWaterLevelInches, int numberOfSpeaker,
                 int trunkDiameterInFeet, boolean radioIsWorking)
    {
        super(color, nameOfCar, typeOfCar, fuelType,
                weightInPounds, lengthInFeet, maxSpeedMph,
                costOfCarInDollars, true,
                crashPotentialPercentage,
                numberOfEngineCylinders,engineTemperatureInFahrenheit,
                steeringWheelType, steeringWheelDiameterInInches,
                batteryColor, batteryCapacityInYears, batteryVoltageInVolts,
                fuelTankOilInGallons, fuelTankCapacity,
                brakeDiscSizeInInches, brakePadThicknessInInches,
                transmissionNumberOfPlanetGear, transmissionNumberOfRingGear, transmissionNumberOfSunGear, transmissionNumberOfPlanetaryGearSet,
                transmissionGearRatio, transmissionAmountOfTransmissionFluidInQuarts,
                gasPedalSurfaceAreaInInches,
                radiatorTemperatureOfRadiatorFahrenheit, radiatorWaterLevelInches);

        this.mainRadio = new Radio(numberOfSpeaker, radioIsWorking, true);
        this.leftHeadlight = new Headlight("headLight", "headLight", 2.0,2.0);
        this.rightHeadlight = new Headlight("headLight", "headLight", 2.0,2.0 );
        this.leftSeat = new Seat(true, 2, 2);
        this.rightSeat = new Seat(true, 2, 2);
        this.mainTrunk = new Trunk(trunkDiameterInFeet);
        this.leftDoor = new Door(true, 2, true, true, true, "door");
        this.rightDoor = new Door(true, 2, true, true, true, "door");
        this.frontLeftWheel = new Wheel(2,2);
        this.frontRightWheel = new Wheel(2,2);
        this.backLeftWheel = new Wheel(2,2);
        this.backRightWheel = new Wheel(2,2);
        arr[0] = mainRadio;
        arr[1] = leftHeadlight;
        arr[2] = rightHeadlight;
        arr[3] = leftSeat;
        arr[4] = rightSeat;
        arr[5] = mainTrunk;
        arr[6] = leftDoor;
        arr[7] = rightDoor;
        arr[8] = frontLeftWheel;
        arr[9] = frontRightWheel;
        arr[10] =backLeftWheel;
        arr[11] =backRightWheel;
    }

    //methods
    @Override
    public String toString(){
        String message = "";
        message += super.toString();
        for(CarComponent i : arr){
            if(!i.getIsWorking()){
                message += "The " + i.getNameOfComponent() + " is not working. \n";
            }
        }
        return message;
    }

    public String start(){
        return super.start();
    }

    @Override
    public boolean action1()
    {
        return openUpCar();
    }

    @Override
    public boolean action2()
    {
        return beObnoxious();
    }

    /*public void calculateFailRateOfParts(double speedInMph){

    getEngine().calculateChanceOfFailure(speedInMph);
    getSteeringWheel().calculateChanceOfFailure(speedInMph);
    getBattery().calculateChanceOfFailure(speedInMph);
    getFuelTank().calculateChanceOfFailure(speedInMph);
    getBrake().calculateChanceOfFailure(speedInMph);
    getTransmission().calculateChanceOfFailure(speedInMph);
    getGasPedal().calculateChanceOfFailure(speedInMph);
    getRadiator().calculateChanceOfFailure(speedInMph);

    }
     */
    @Override
    public void calculateFailRateOfParts(double mph){
        super.calculateFailRateOfParts(mph);
        mainRadio.calculateChanceOfFailure(mph);
        leftHeadlight.calculateChanceOfFailure(mph);
        rightHeadlight.calculateChanceOfFailure(mph);
        frontLeftWheel.calculateChanceOfFailure(mph);
        frontRightWheel.calculateChanceOfFailure(mph);
        backLeftWheel.calculateChanceOfFailure(mph);
        backRightWheel.calculateChanceOfFailure(mph);
    }

    public boolean openUpCar()
    {

        if(getLeftDoor().getIsWorking()&& getRightDoor().getIsWorking()&&getTrunk().getIsWorking())
        {
            getLeftDoor().action1();
            getRightDoor().action1();
            getTrunk().action1();
            System.out.print("The Coupe opens up. \n");
            return true;
        }
        else { System.out.print("The Coupe fails to open up. \n");return false;}

    }

    public boolean beObnoxious()
    {
        if(getRadio().getIsWorking()&& getRightHeadlight().getIsWorking()&&getLeftHeadlight().getIsWorking())
        {
            getRadio().action1();
            getRightHeadlight().action1();
            getLeftHeadlight().action1();
            System.out.println("The Coupe successfully gets obnoxious. \n");
            return true;
        }
        else {System.out.println("The Coupe was unable to get obnoxious. \n ");
            return false;}
    }

    /*
    @Override
    public String damage()
    {
    }
     */
    @Override
    public double fix()
    {
        double cost = 0;
        cost += super.fix();
        for(CarComponent i : arr){
            if(!(i.getIsWorking())){
                    System.out.println(i.fix());
                    cost += 100;
            }
        }
        return cost;
    }

    @Override
    public boolean drive()
    {
        return drive(60);
    }

    @Override
    public boolean drive(double mph)
    {

        if(!getCarIsWorking()){
            System.out.println("This "+ getNameOfCar() +" is not working and you cannot drive it.");
            return false;
        }
        if(!getCarIsOn() || !(getSteeringWheel().getIsWorking())){
            System.out.println("This "+getNameOfCar()+" cannot drive because of certain part failures or it didn't start.");
            return false;
        }else if (mph > getMaxSpeedMph()) {
            System.out.println("You attempt to drive the car at a high speed. Crash potential increased.");
            return false;
        }
        if((Math.random()*100)+1<=calculateCrashRate(mph)) {
            System.out.println("You attempt to drive the car at a high speed. Your "+getNameOfCar()+" is now damaged.");
            damage();
            for(CarComponent i : arr){
                i.damage();
            }
            setCarIsWorking(false);
            setCarIsOn(false);
            return false;
        }

        return true;

    }

    @Override
    public String description()
    {
        String message="Coupe: " + getNameOfCar();
        message+=super.description();
        message+="This Coupe's headlights are "+rightHeadlight.getColor()+" and "+leftHeadlight.getColor()+".\n";
        return message;

    }

    public Radio getRadio()
    {
        return mainRadio;
    }

    public Headlight getLeftHeadlight()
    {
        return leftHeadlight;
    }

    public Headlight getRightHeadlight()
    {
        return rightHeadlight;
    }

    public Seat getLeftSeat()
    {
        return leftSeat;
    }

    public Seat getRightSeat()
    {
        return rightSeat;
    }

    public Door getLeftDoor()
    {
        return leftDoor;
    }

    public Door getRightDoor()
    {
        return rightDoor;
    }

    public Wheel getFrontLeftWheel()
    {
        return frontLeftWheel;
    }

    public Wheel getBackRightWheel()
    {
        return backRightWheel;
    }

    public Wheel getBackLeftWheel()
    {
        return backLeftWheel;
    }

    public Wheel getFrontRightWheel()
    {
        return frontRightWheel;
    }

    public Trunk getTrunk()
    {
        return mainTrunk;
    }
}