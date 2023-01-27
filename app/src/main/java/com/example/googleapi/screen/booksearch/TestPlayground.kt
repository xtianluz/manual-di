

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import retrofit2.HttpException

fun main(){
    runBlocking {
        launch{
            try{
//                getImage()
//                searchItem()
//                getThumbnail()
                getList()
            }catch(e: HttpException){
                throw Exception("Error")
            }
        }
    }
}
suspend fun getList(){

}

