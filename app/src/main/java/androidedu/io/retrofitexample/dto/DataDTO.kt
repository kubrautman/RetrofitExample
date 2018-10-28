package androidedu.io.retrofitexample.dto


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 27.10.2018 - 16:13          │
//└─────────────────────────────┘

data class DataDTO(
    val weight: Int,
    val source: SourceDTO,
    val url: String,
    val tags: List<TagDTO>,
    val presentationType: String,
    val primaryTag: TagDTO,
    val publishedDateFormatted: String,
    val id: Int,
    val status: Int,
    val publishedDate: String,
    val content: String,
    val media: List<MediaDTO>,
    val title: String,
    val seoLink: String,
    val images: List<MediaDTO>,
    val summary: String
)