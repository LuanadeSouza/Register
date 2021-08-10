package br.com.luanadev.register.registration

import br.com.luanadev.register.di.ActivityScope
import br.com.luanadev.register.registration.enterdetails.EnterDetailsFragment
import br.com.luanadev.register.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent


@ActivityScope
@Subcomponent
interface RegistrationComponent {

    // Factory to create instances of RegistrationComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}