import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test

    public void chanelUp() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);

        radio.nextChanel();

        int actual = radio.getCurrentChanel();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test

    public void chanelDown() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);

        radio.previousChanel();

        int actual = radio.getCurrentChanel();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test

    public void volumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.nextVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test

    public void volumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.previousVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}
