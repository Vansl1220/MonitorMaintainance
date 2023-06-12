package com.example.monitormaintainance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


 class MonitorMaintainceControllerTest {

    private MonitorMaintainceController messageController = new MonitorMaintainceController();

    @Test
    public void defaultTest(){
        String messae = messageController.message;
        String result = messageController.defaultwebseite();
        assertEquals(messae, result);
    }
}
