package com.example.easypark.models

class Book {
    var name:String = ""
    var space:String = ""
    var email:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, email: String,space: String,imageUrl: String, id: String) {
        this.name = name
        this.email = email
        this.space = space
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}