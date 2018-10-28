package androidedu.io.retrofitexample.network

import androidedu.io.retrofitexample.network.response.StoriesByIdResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 27.10.2018 - 15:38          │
//└─────────────────────────────┘

interface StoriesService {

    @GET("stories/{id}")
    fun getStoriesById(@Path("id") id: String): Call<StoriesByIdResponse>
}