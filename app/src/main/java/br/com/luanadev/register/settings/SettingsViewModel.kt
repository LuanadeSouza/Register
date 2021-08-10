package br.com.luanadev.register.settings

import android.os.UserManager
import br.com.luanadev.register.user.UserDataRepository
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