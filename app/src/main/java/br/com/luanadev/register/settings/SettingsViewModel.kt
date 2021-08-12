package br.com.luanadev.register.settings

import br.com.luanadev.register.user.UserDataRepository
import br.com.luanadev.register.user.UserManager
import javax.inject.Inject

class SettingsViewModel @Inject constructor(
    private val userDataRepository: UserDataRepository,
    private val userManager: UserManager
) {

    fun refreshNotifications() {
        userDataRepository.refreshUnreadNotifications()
    }

    fun logout() {
        userManager.logout()
    }
}