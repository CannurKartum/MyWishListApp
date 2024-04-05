package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)


object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch", description = "An Android Watch"),
        Wish(title = "Google Watch", description = "An Android Watch"),
        Wish(title = "Google Watch", description = "An Android Watch"),
    )
}
