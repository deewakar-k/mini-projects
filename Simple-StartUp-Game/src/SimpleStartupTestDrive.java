public class SimpleStartupTestDrive {
    public static void main(String[] args) {

        SimpleStartupTestDrive dot = new SimpleStartupTestDrive();  //instantiate a StartUp object.

        int[] locations = {2, 3, 4};                                //array for the location of the Startup.
        dot.setLocationCells(locations);

        int userGuess = 2;                                          //fake user guess.
        String result = dot.checkYourself(userGuess);

        String testResult = "failed";
        if (result.equals("hit")){
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}