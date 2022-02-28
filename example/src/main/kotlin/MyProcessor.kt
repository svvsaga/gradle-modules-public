import arrow.core.Either
import no.vegvesen.saga.modules.shared.functions.SimpleFunctionError
import no.vegvesen.saga.modules.shared.functions.SimpleProcessor

class MyProcessor : SimpleProcessor {
    override suspend fun process(): Either<SimpleFunctionError, Unit> {
        TODO("Not yet implemented")
    }
}