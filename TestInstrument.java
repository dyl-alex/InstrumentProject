import java.util.*;

// ArrayList -> guitar strings
// LinkedList -> the frequency buffer
// double -> a random number in [-0.5, 0.5]

public class TestInstrument implements Instrument {

    ArrayList<LinkedList<Double>> strings;

    TestInstrument() {
        strings = new ArrayList<>();
        for (int i = 0; i < 37; i++) {
            strings.add(new LinkedList<>());
        }
    }

}
