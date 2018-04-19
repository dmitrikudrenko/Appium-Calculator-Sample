package io.github.dmitrikudrenko.core

import io.appium.java_client.MobileElement
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

public fun <E : MobileElement> AbstractScreen.bindOptionalElement(id: String)
        : ReadOnlyProperty<AbstractScreen, E?> = optional(id, viewFinder)

public fun <E : MobileElement> MobileElement.bindOptionalElement(id: String)
        : ReadOnlyProperty<MobileElement, E?> = optional(id, viewFinder)

private val MobileElement.viewFinder: MobileElement.(String) -> MobileElement?
    get() = { findElementById(it) }

private val AbstractScreen.viewFinder: AbstractScreen.(String) -> MobileElement?
    get() = { findElementById(it) }

@Suppress("UNCHECKED_CAST")
private fun <T, V : MobileElement> optional(id: String, finder: T.(String) -> MobileElement?)
        = Lazy { t: T, _ -> t.finder(id) as V? }

// Like Kotlin's lazy delegate but the initializer gets the target and metadata passed to it
private class Lazy<in T, out V>(private val initializer: (T, KProperty<*>) -> V) : ReadOnlyProperty<T, V> {
    private object EMPTY

    private var value: Any? = EMPTY

    override fun getValue(thisRef: T, property: KProperty<*>): V {
        if (value == EMPTY) {
            value = initializer(thisRef, property)
        }
        @Suppress("UNCHECKED_CAST")
        return value as V
    }
}