package androidedu.io.retrofitexample.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 27.10.2018 - 15:28          │
//└─────────────────────────────┘

class RetrofitClient {

    companion object {

        fun getClient(): Retrofit {

            return Retrofit.Builder()
                .baseUrl("http://api.sonraneoldu.com/v2/")
                .addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}
