import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AsteriskLoggerTest {
    AsteriskLogger aLogger;
    SpacedLogger sLogger;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        aLogger = new AsteriskLogger();
        sLogger = new SpacedLogger();
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void log() {
        aLogger.Log("ERROR");
        Assertions.assertEquals("***ERROR***",outputStreamCaptor.toString().trim());
    }

    @Test
    void error() {
        String asterisks = "******************";
        String tempString = asterisks + "\r\n***ERROR: TEST***\r\n" + asterisks;
        aLogger.Error("TEST");
        Assertions.assertEquals(tempString,outputStreamCaptor.toString().trim());
    }
}