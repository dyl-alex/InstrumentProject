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

    @Override
    public void pluck(char key){
        double freq = 440.0 * Math.pow(2.0, (key % 37 - 24) / 12)
        int size = (int)(44100.0 / freq);
        for (int gs = 0; gs < 37; gs++) {

        }
    }

    public void tick() {

    }

    public double superposition() {
        return 0;
        
    }

}
