package androidedu.io.retrofitexample.dto


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 27.10.2018 - 16:23          │
//└─────────────────────────────┘

data class TagDTO(
    val name: String,
    val id: Int,
    val isPrimary: Boolean,
    val followingType: String,
    val position: Int
)