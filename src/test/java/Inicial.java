import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Inicial {
    @Test
    public void verificar(){
        Assertions.assertTrue(true);
    }

    @Test
    void testarSeIgualADois(){
        int a = 1 + 1;
        assertEquals(2, a);
    }
}
