import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MaxRootTest1 {

    @Test
    void root() {
        MaxRoot maxRoot = new MaxRoot(1,3,-4);
        assertEquals(1, maxRoot.Root(),1e-9);
    }
}