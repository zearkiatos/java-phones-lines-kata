package tests.phoneline.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.phoneline.domain.PhoneLine;

public class PhoneLineShould {
    @Test
    public void testInitializationLineInZeroShould() {
        PhoneLine line = new PhoneLine();

        line.initialization();
        
        assertEquals(line.getCallCost(), 0);
        assertEquals(line.getCallDuration(), 0);
        assertEquals(line.getCallQuantity(), 0);
    }
}
