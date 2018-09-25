package sunny.tablayout_kotlin.data.remote

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import sunny.tablayout_kotlin.Answer
import sunny.tablayout_kotlin.Constant
import java.util.*

/**
 * Created by Wayan-MECS on 9/24/2018.
 */
interface SOServices {

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    fun getAnswer() : Observable<Answer.Item>

}