package giorgi.tielidze

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import giorgi.tielidze.databinding.ComputerSkillsBinding

class ComputerSkills : Fragment() {

    private var binding: ComputerSkillsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = ComputerSkillsBinding.inflate(inflater, container, false)

        binding.backBtn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_computerSkills_to_menuFragment)
        }
        return binding.root

    }
}