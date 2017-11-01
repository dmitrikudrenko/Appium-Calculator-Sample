package io.github.dmitrikudrenko.core

import io.appium.java_client.MobileDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction

fun MobileElement.shouldBeDisplayed(): MobileElement {
    if (!isDisplayed) {
        throw AssertionError("Element $id should be displayed")
    }
    return this
}

fun MobileElement.shouldNotBeDisplayed(): MobileElement {
    if (isDisplayed) {
        throw AssertionError("Element $id should not be displayed")
    }
    return this
}

fun MobileElement.shouldBeEnabled(): MobileElement {
    if (!isEnabled) {
        throw AssertionError("Element $id should be enabled")
    }
    return this
}

fun MobileElement.shouldBeDisplayedAndEnabled(): MobileElement {
    return this.shouldBeDisplayed().shouldBeEnabled()
}

fun MobileElement.shouldHaveText(caption: String): MobileElement {
    if (caption != text) {
        throw AssertionError("Element $id should have text \"$caption\", but it has text \"$text\"")
    }
    return this
}

fun MobileElement.shouldClick(): MobileElement {
    shouldBeDisplayedAndEnabled().click()
    return this
}

fun MobileElement.shouldLongClick(): MobileElement {
    TouchAction(getDriver()).longPress(this)
    return this
}

fun MobileElement.getDriver(): MobileDriver<*> = this.wrappedDriver as MobileDriver<*>