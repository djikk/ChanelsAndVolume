import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test

    public void unrealChanelAndVolumeMoreThanMax() {
        Radio radio = new Radio(10,11);

        radio.setCurrentChanel(10);

        radio.setCurrentVolume(11);

        int actual = radio.getCurrentChanel();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test

    public void unrealChanelAndVolumeLessThanMin() {
        Radio radio = new Radio(10,11);

        radio.setCurrentChanel(-1);

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentChanel();
        int expected = 0;

        assertEquals(expected, actual);
    }



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

    public void chanelUpFrom8To9() {
        Radio radio = new Radio();
        radio.setCurrentChanel(8);

        radio.nextChanel();

        int actual = radio.getCurrentChanel();
        int expected = 9;

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

    public void chanelDownFrom9To8() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);

        radio.previousChanel();

        int actual = radio.getCurrentChanel();
        int expected = 8;

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

    public void volumeUpFrom9To10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

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

    @Test

    public void volumeDownFrom10To9() {

            Radio radio = new Radio();
            radio.setCurrentVolume(10);

            radio.previousVolume();

            int actual = radio.getCurrentVolume();
            int expected = 9;

            assertEquals(expected, actual);

    }
}
