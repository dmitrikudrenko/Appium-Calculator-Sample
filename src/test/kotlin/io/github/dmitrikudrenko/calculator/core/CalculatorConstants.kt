package io.github.dmitrikudrenko.calculator.core

val constants = RealDevice

sealed class CalculatorConstants(
        val packageName: String,
        val launchActivity: String,
        val id: String
)

object Emulator :
        CalculatorConstants(
                EmulatorConstants.PACKAGE_NAME,
                EmulatorConstants.LAUNCH_ACTIVITY,
                EmulatorConstants.ID
        )

object RealDevice :
        CalculatorConstants(
                RealDeviceConstants.PACKAGE_NAME,
                RealDeviceConstants.LAUNCH_ACTIVITY,
                RealDeviceConstants.ID
        )

private object EmulatorConstants {
    const val PACKAGE_NAME = "com.android.calculator"
    const val LAUNCH_ACTIVITY = PACKAGE_NAME + ".Calculator"
    const val ID = PACKAGE_NAME + ":id/"
}

private object RealDeviceConstants {
    const val PACKAGE_NAME = "com.google.android.calculator"
    const val LAUNCH_ACTIVITY = "com.android.calculator2.Calculator"
    const val ID = PACKAGE_NAME + ":id/"
}
