package com.example.testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class LoginCredentialsTest{

    @Test
    fun `empty username returns false`() {
        val result = LoginCredentials.checkForValidUsernameAndPassword(
            "",
            "123ash",
            "123ash"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false` () {
        val result = LoginCredentials.checkForValidUsernameAndPassword(
            "Ashish",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `different password and confirmPassword returns false` () {
        val result = LoginCredentials.checkForValidUsernameAndPassword(
            "Ashish",
            "123ash",
            "ash123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `username already existing returns false` () {
        val result = LoginCredentials.checkForValidUsernameAndPassword(
            "Anmol",
            "123khs",
            "123khs"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `correct username and password return true` () {
        val result = LoginCredentials.checkForValidUsernameAndPassword(
            "Ashish",
            "12393jdjsn",
            "12393jdjsn"
        )
        assertThat(result).isTrue()
    }

}