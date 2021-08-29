package com.example.testing

object LoginCredentials {

    private val userNames = mutableListOf("Anmol","Soham","Viraj")

    fun checkForValidUsernameAndPassword(
        username: String,
        password: String,
        confirmPassword:String
    ): Boolean {
        if(username.isEmpty() || password.isEmpty()){
            return false
        }
        if(userNames.contains(username)){
            return false
        }
        if(password != confirmPassword){
            return false
        }
        userNames.add(username)
        return true
    }

}