package io.github.dmitrikudrenko.calculator.core

interface CalculatorConstants {

    private object Emulator {
        const val PACKAGE_NAME = "com.android.calculator"
        const val LAUNCH_ACTIVITY = PACKAGE_NAME + ".Calculator"
        const val ID = PACKAGE_NAME + ":id/"
    }

    private object RealDevice {
        const val PACKAGE_NAME = "com.google.android.calculator"
        const val LAUNCH_ACTIVITY = "com.android.calculator2.Calculator"
        const val ID = PACKAGE_NAME + ":id/"
    }

    companion object {
        const val PACKAGE_NAME = RealDevice.PACKAGE_NAME
        const val LAUNCH_ACTIVITY = RealDevice.LAUNCH_ACTIVITY
        const val ID = RealDevice.ID
    }
}
