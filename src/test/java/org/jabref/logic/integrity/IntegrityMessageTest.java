package org.jabref.logic.integrity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegrityMessageTest {
    private IntegrityMessage imsg;

    @BeforeEach
    public void setup(){
        imsg = new IntegrityMessage(null,null,null);

    }

    @Test
    public void testEqualsF(){
        boolean Retorno = imsg.equals(imsg);
        assertEquals(true, Retorno);
    }

    @Test
    public void testEquals(){
        boolean Retorno = imsg.equals(null);
        assertEquals(false,Retorno);
    }
}
