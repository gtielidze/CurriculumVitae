package giorgi.tielidze

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import giorgi.tielidze.databinding.MenufragmentBinding

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = MenufragmentBinding.inflate(inflater, container, false)

        binding.btnPersonalInfo.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_menuFragment_to_personalInfo)
        }
        binding.btnExperience.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_menuFragment_to_experience2)
        }
        binding.btnEducation.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_menuFragment_to_education)
        }
        binding.btnLanguages.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_menuFragment_to_languages)
        }
        binding.btnComputerSkils.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_menuFragment_to_computerSkills)
        }
        return binding.root
    }


}