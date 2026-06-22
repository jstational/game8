package game8.interfaces;

import game8.Wip;

// only a stub

public interface PressureBlock {
    default float getPressure() {
        return 0f;
    }
    default float getSystemVolume() {
        return 0f;
    }
    default float getSystemPressure() {
        return 0f;
    }
}