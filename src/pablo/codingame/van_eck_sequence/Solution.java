package pablo.codingame.van_eck_sequence;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var sequencer = new Sequencer(in.nextInt());
        var result = sequencer.getElement(in.nextInt());
        System.out.println(result);
    }
}