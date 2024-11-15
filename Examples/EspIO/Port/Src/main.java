
import java.math.BigInteger;
import machine.gpio.*;
import network.*;

public class main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello form ESP32");
        Port port = new Port(2, 4, 5, 12).setMode(PinMode.OUTPUT);
        int i = 0;
        while(true) {
            port.writePort(i);
            i++;
            Thread.sleep(100);
        }
    }
}
