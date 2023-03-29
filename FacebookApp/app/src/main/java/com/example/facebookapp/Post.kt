package com.example.facebookapp

import java.util.Date

data class Post (
    val text: String,
    val timestamp: Date,
    val authorName: String,
    val authorAvatarUrl: String
    ){

}