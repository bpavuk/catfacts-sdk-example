import com.bpavuk.catfacts.CatFacts
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    val sdk = CatFacts()

    println(sdk.getCatFact(args.firstOrNull()?.toIntOrNull()).fact)
}
