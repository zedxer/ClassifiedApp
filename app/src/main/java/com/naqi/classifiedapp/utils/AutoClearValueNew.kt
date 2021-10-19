package com.naqi.classifiedapp.utils

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.fragment.app.Fragment
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * A lazy property that gets cleaned up when the fragment is destroyed.
 *
 * Accessing this variable in a destroyed fragment will throw NPE.
 */
class AutoClearedValue<T : Any>(val fragment: Fragment) : ReadWriteProperty<Fragment, T> {
    private var _value: T? = null

    init {
        var observerRegistered = false
        val viewObserver = object : LifecycleObserver {
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            fun onDestroyView() {
                observerRegistered = false
                _value = null
            }
        }

        fragment.lifecycle.addObserver(object : LifecycleObserver {
            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            fun onStart() {
                if (!observerRegistered) {
                    fragment.viewLifecycleOwner.lifecycle.addObserver(viewObserver)
                    observerRegistered = true
                }
            }
        })
    }

    override fun getValue(thisRef: Fragment, property: KProperty<*>): T {
        return _value ?: throw IllegalStateException(
            "should never call auto-cleared-value get when it might not be available"
        )
    }

    override fun setValue(thisRef: Fragment, property: KProperty<*>, value: T) {
        _value = value
    }
}

/**
 * Creates an [AutoClearedValue] associated with this fragment.
 */
fun <T : Any> Fragment.autoCleared() = AutoClearedValue<T>(this)