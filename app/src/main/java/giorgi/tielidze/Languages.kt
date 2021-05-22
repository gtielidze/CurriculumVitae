package giorgi.tielidze

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import giorgi.tielidze.databinding.LanguagesBinding

class Languages : Fragment() {

    private var binding: LanguagesBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = LanguagesBinding.inflate(inflater, container, false)

        binding.backBtn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_languages_to_menuFragment)
        }
        return binding.root

    }
}