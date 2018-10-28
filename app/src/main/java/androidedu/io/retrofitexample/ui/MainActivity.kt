package androidedu.io.retrofitexample.ui

import android.os.Bundle
import android.widget.Toast
import androidedu.io.retrofitexample.R
import androidedu.io.retrofitexample.network.RetrofitClient
import androidedu.io.retrofitexample.network.StoriesService
import androidedu.io.retrofitexample.network.response.StoriesByIdResponse
import androidedu.io.retrofitexample.ui.adapter.TagListAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TagListAdapter(ArrayList())

        RetrofitClient.getClient()
            .create(StoriesService::class.java)
            .getStoriesById("1").enqueue(object : Callback<StoriesByIdResponse> {
                override fun onFailure(call: Call<StoriesByIdResponse>, t: Throwable) {

                    Toast.makeText(this@MainActivity, "Failure", Toast.LENGTH_SHORT).show()
                }

                override fun onResponse(call: Call<StoriesByIdResponse>, response: Response<StoriesByIdResponse>) {

                    (recyclerView.adapter as TagListAdapter).setNewList(response.body()?.data?.tags!!)
                    Toast.makeText(this@MainActivity, "Success", Toast.LENGTH_SHORT).show()
                }
            })
    }
}
