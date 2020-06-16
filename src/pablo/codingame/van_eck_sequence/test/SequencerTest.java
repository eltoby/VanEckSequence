package pablo.codingame.van_eck_sequence.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pablo.codingame.van_eck_sequence.Sequencer;

import static org.junit.jupiter.api.Assertions.*;

public class SequencerTest {
    @Test
    public void firstIsGivenElement() {
        var sut = new Sequencer(2);
        assertEquals(2, sut.getElement(1));
    }

    @Test
    public void secondElementIsZero() {
        var sut = new Sequencer(2);
        assertEquals(0, sut.getElement(2));
    }

    @Test
    public void exampleThirdPos() {
        var sut = new Sequencer(0);
        assertEquals(1, sut.getElement(3));
    }

    @Test
    public void aLittleLong() {
        var sut = new Sequencer(1);
        assertEquals(11, sut.getElement(58));
    }
}
