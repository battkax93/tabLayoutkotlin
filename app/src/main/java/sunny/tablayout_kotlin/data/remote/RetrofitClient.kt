package sunny.tablayout_kotlin.data.remote

import retrofit2.Retrofit

abstract class RetrofitClient {

    var retrofit: Retrofit? = null

    abstract fun getClient: Retrofit(baseUrl: String, scnd: Int)
}