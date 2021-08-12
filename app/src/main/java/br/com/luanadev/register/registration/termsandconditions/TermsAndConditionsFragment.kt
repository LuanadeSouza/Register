package br.com.luanadev.register.registration.termsandconditions

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.luanadev.register.databinding.FragmentTermsAndConditionsBinding
import br.com.luanadev.register.registration.RegistrationActivity
import br.com.luanadev.register.registration.RegistrationViewModel
import by.kirich1409.viewbindingdelegate.viewBinding
import javax.inject.Inject

class TermsAndConditionsFragment : Fragment() {

    // @Inject annotated fields will be provided by Dagger
    @Inject
    lateinit var registrationViewModel: RegistrationViewModel
    private val binding by viewBinding {
        FragmentTermsAndConditionsBinding.inflate(layoutInflater)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        // Grabs the registrationComponent from the Activity and injects this Fragment
        (activity as RegistrationActivity).registrationComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.next.setOnClickListener {
            registrationViewModel.acceptTCs()
            (activity as RegistrationActivity).onTermsAndConditionsAccepted()
        }
    }
}