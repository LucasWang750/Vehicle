public class Test {
    public static void main(String[] args) {
        Coupe bus1 = new Coupe(
                "red", "lamborghini", "bus", "gas", 5000,
                400, 90, 5000, 10, 4, 70, "wheel", 90,
                "wheel", 20, 40,
                20, 400, 30, 100,
                4, 5, 4,
                4, 4, 4,
                3, 8,
                1235, 1000,
                500, true);

        for(int i = 0; i < 100 ; i++){
            bus1.start();
            //System.out.println(bus1.getWheel1().getIsWorking());
            //bus1.action1();
            //bus1.action2();
            bus1.drive(100);
            bus1.fix();
        }

        //bus1.fix();
        //bus1.fix();
    }

}
