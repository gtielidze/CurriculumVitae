package giorgi.tielidze

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import giorgi.tielidze.databinding.ExperianceBinding

class Experience : Fragment() {

    private var binding: ExperianceBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = ExperianceBinding.inflate(inflater, container, false)

        binding.backBtn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_experience2_to_menuFragment)
        }
        return binding.root
    }
}