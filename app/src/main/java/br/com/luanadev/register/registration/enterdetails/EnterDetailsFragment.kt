package br.com.luanadev.register.registration.enterdetails

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import br.com.luanadev.register.R
import br.com.luanadev.register.databinding.FragmentEnterDetailsBinding
import br.com.luanadev.register.registration.RegistrationActivity
import br.com.luanadev.register.registration.RegistrationViewModel
import by.kirich1409.viewbindingdelegate.viewBinding
import javax.inject.Inject


class EnterDetailsFragment : Fragment() {

    @Inject
    lateinit var registrationViewModel: RegistrationViewModel

    @Inject
    lateinit var enterDetailsViewModel: EnterDetailsViewModel
    private val binding by viewBinding {
        FragmentEnterDetailsBinding.inflate(layoutInflater)
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

        enterDetailsViewModel.enterDetailsState.observe(viewLifecycleOwner,
            { state ->
                when (state) {
                    is EnterDetailsSuccess -> {

                        val username = binding.username.text.toString()
                        val password = binding.password.text.toString()
                        registrationViewModel.updateUserData(username, password)

                        (activity as RegistrationActivity).onDetailsEntered()
                    }
                    is EnterDetailsError -> {
                        binding.error.text = state.error
                        binding.error.visibility = View.VISIBLE
                    }
                }
            })

        setupViews(view)
    }


    private fun setupViews(view: View) {
        binding.username.doOnTextChanged { _, _, _, _ -> binding.error.visibility = View.INVISIBLE }
        binding.password.doOnTextChanged { _, _, _, _ -> binding.error.visibility = View.INVISIBLE }

        view.findViewById<Button>(R.id.next).setOnClickListener {
            val username = binding.username.text.toString()
            val password = binding.password.text.toString()
            enterDetailsViewModel.validateInput(username, password)
        }
    }
}