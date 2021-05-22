package giorgi.tielidze

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import giorgi.tielidze.databinding.EducationBinding

class Education: Fragment() {

    private var binding: EducationBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = EducationBinding.inflate(inflater, container, false)

        binding.backBtn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_education_to_menuFragment)
        }

        return binding.root

    }
}