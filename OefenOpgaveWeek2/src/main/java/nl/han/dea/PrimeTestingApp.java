package nl.han.dea;

import java.util.ArrayList;

public class PrimeTestingApp {

    private static final int HIGHEST_NUMBER_TO_TEST = 2000;

    public static void main(String[] args) {
        PrimeTestingApp app = new PrimeTestingApp();
        app.startTesting();
    }

    private void startTesting() {
        NumberUnderTest numberUnderTest = new NumberUnderTest();

        ArrayList<PrimeTester> testers = new ArrayList<PrimeTester>();

        testers.add(new PrimeTester(numberUnderTest,2000));
        testers.add(new PrimeTester(numberUnderTest, 2000));
        testers.add(new PrimeTester(numberUnderTest, 2000));
        testers.add(new PrimeTester(numberUnderTest, 2000));

        for(PrimeTester primeTester : testers) {
            new Thread(primeTester).start();
        }
        
    }
}
