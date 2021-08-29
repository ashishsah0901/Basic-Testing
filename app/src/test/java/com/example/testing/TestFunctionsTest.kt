package com.example.testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TestFunctionsTest {

    @Test
    fun `zero to fib function returns 0` () {
        val result = TestFunctions.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `one to fib function returns 1` () {
        val result = TestFunctions.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `five to fib function returns 5` () {
        val result = TestFunctions.fib(5)
        assertThat(result).isEqualTo(5)
    }

    @Test
    fun `negative to fib will return -1` () {
        val result = TestFunctions.fib(-2)
        assertThat(result).isEqualTo(-1)
    }

    @Test
    fun `opposite brackets of same number return false` () {
        val result = TestFunctions.checkBraces("))((")
        assertThat(result).isFalse()
    }

    @Test
    fun `different number of brackets will return false` () {
        val result = TestFunctions.checkBraces("(()))")
        assertThat(result).isFalse()
    }

    @Test
    fun `correct order of brackets wll return true` () {
        val result = TestFunctions.checkBraces("()()()")
        assertThat(result).isTrue()
    }

    @Test
    fun `empty string should return true` () {
        val result = TestFunctions.checkBraces("")
        assertThat(result).isTrue()
    }

    @Test
    fun `single bracket should return false` () {
        val result = TestFunctions.checkBraces("(")
        assertThat(result).isFalse()
    }

}