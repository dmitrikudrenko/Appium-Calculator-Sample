package io.github.dmitrikudrenko.core

import io.appium.java_client.MobileElement

fun MobileElement.shouldBeDisplayed(): MobileElement {
    if (!isDisplayed) {
        throw AssertionError("Element $id should be displayed")
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