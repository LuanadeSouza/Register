package br.com.luanadev.register.login

sealed class LoginViewState
object LoginSuccess : LoginViewState()
object LoginError : LoginViewState()