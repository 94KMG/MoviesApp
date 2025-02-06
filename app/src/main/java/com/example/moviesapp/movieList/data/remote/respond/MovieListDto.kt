package com.example.moviesapp.movieList.data.remote.respond

data class MovieListDto(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)