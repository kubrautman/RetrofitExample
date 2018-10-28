package androidedu.io.retrofitexample.dto


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 27.10.2018 - 16:32          │
//└─────────────────────────────┘

data class MediaDTO(
    val format: String,
    val name: String,
    val id: Int,
    val contentType: String,
    val baseUrl: String
)