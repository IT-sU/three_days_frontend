package com.example.threedays

class UserManager {
    private val userList = mutableListOf<User> ()

    fun addUser(user: User) {
        userList.add(user)
    }

    fun removeUser(user: User) {
        userList.remove(user)
    }

    fun getUser(nickname: String): User? {
        return userList.find { it.nickname == nickname }
    }

    fun getAllUsers(): List<User> {
        return userList.toList()
    }

    companion object {
        private var instance: UserManager? = null

        fun getInstance(): UserManager {
            if (instance == null) {
                instance = UserManager()
            }
            return instance!!
        }
    }
}