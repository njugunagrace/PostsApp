import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.gracie.postsapp.api.ApiInterface
import dev.gracie.postsapp.model.Posts
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PostsViewModel : ViewModel() {
    val apiService = ApiInterface()

    val posts:MutableLiveData<List<Posts>> = MutableLiveData()

  fun fetchPosts() {
        ViewModelScope.launch {
            val fetchedPosts = withContext(Dispatchers.IO) {
                apiService.getPosts()
            }
            posts.value = fetchedPosts
        }
    }
}
