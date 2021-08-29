package com.example.testing

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceComparerTest{

    private lateinit var resourceComparer: ResourceComparer

    @Before
    fun initializeObjectOfTheClass() {
        resourceComparer = ResourceComparer()
    }

    @Test
    fun sameResourceStringAndString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name,"Testing")
        assertThat(result).isTrue()
    }

    @Test
    fun differentResourceStringAndString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name,"App")
        assertThat(result).isFalse()
    }

}