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
}
