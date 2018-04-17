package io.github.dmitrikudrenko.core

import io.appium.java_client.MobileDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction

private fun MobileElement?.run(matcher: (MobileElement) -> MobileElement): MobileElement {
    if (this == null) { throw AssertionError("Element not found") }
    return this.let { matcher.invoke(it) }
}

fun MobileElement?.shouldBeDisplayed(): MobileElement {
    return this.run {
        if (!it.isDisplayed) {
            throw AssertionError("Element $it.id should be displayed")
        }
        it
    }
}

fun MobileElement?.shouldNotBeDisplayed(): MobileElement {
    return this.run {
        if (it.isDisplayed) {
            throw AssertionError("Element $it.id should not be displayed")
        }
        it
    }
}

fun MobileElement?.shouldBeEnabled(): MobileElement {
    return this.run {
        if (!it.isEnabled) {
            throw AssertionError("Element $it.id should be enabled")
        }
        it
    }
}

fun MobileElement?.shouldBeDisplayedAndEnabled(): MobileElement {
    return this.shouldBeDisplayed().shouldBeEnabled()
}

fun MobileElement?.shouldHaveText(caption: String): MobileElement {
    return this.run {
        if (caption != it.text) {
            throw AssertionError("Element ${it.id} should have text \"$caption\", but it has text \"${it.text}\"")
        }
        it
    }
}

fun MobileElement?.shouldClick(): MobileElement {
    return this.run {
        shouldBeDisplayedAndEnabled().click()
        it
    }
}

fun MobileElement?.shouldLongClick(): MobileElement {
    return this.run {
        TouchAction(it.getDriver()).longPress(this)
        it
    }
}

fun MobileElement.getDriver(): MobileDriver<*> = this.wrappedDriver as MobileDriver<*>