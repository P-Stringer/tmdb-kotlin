package app.moviebase.tmdb.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

enum class TmdbSearchType(val value: String) {
    COMPANY("company"),
    COLLECTION("collection"),
    KEYWORD("keyword"),
    PERSON("person"),
    MOVIE("movie"),
    TV("tv"),
    MULTI("multi"),
}

@Serializable
data class TmdbFindResults(
    @SerialName("movie_results") val movieResults: List<TmdbMovie> = emptyList(),
    @SerialName("tv_results") val showResults: List<TmdbShow> = emptyList(),
    @SerialName("person_results") val personResults: List<TmdbPerson> = emptyList()
)

interface TmdbSearchable {
    val id: Int
}
