sealed class ScreenState

object Loading : ScreenState()

data class Success(val data: String) : ScreenState()

fun main() {
    val state: ScreenState = Success("Data Loaded")

    when (state) {
        is Loading -> println("Loading...")
        is Success -> println(state.data)
    }
}
