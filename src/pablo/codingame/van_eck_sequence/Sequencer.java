package pablo.codingame.van_eck_sequence;

import java.util.HashMap;

public class Sequencer {
    private Integer a1;
    private HashMap<Integer, Integer> map;

    public Sequencer(int a1){
        this.a1 = a1;
        this.map = new HashMap<>();
        this.map.put(a1, 1);
    }

    public int getElement(int pos) {
        var currentPos = 1;
        var currentVal = a1;

        while(currentPos < pos) {
            if (this.map.containsKey(currentVal)) {
                var newVal = currentPos - this.map.get(currentVal);
                this.map.replace(currentVal, currentPos);
                currentVal = newVal;
            } else {
                this.map.put(currentVal, currentPos);
                currentVal = 0;
            }

            currentPos++;
        }

        return currentVal;
    }
}
