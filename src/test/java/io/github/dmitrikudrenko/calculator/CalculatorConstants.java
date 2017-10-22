package io.github.dmitrikudrenko.calculator;

public interface CalculatorConstants {
    String PACKAGE_NAME = Emulator.PACKAGE_NAME;
    String LAUNCH_ACTIVITY = Emulator.LAUNCH_ACTIVITY;
    String ID = Emulator.ID;

    class Emulator {
        private static final String PACKAGE_NAME = "com.android.calculator";
        private static final String LAUNCH_ACTIVITY = PACKAGE_NAME + ".Calculator";
        private static final String ID = PACKAGE_NAME + ":id/";
    }

    class RealDevice {
        private static final String PACKAGE_NAME = "com.google.android.calculator";
        private static final String LAUNCH_ACTIVITY = "com.android.calculator2.Calculator";
        private static final String ID = PACKAGE_NAME + ":id/";
    }
}
