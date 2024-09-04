package com.example.easypark.models

class Space {

    var name:String = ""
    var no:String = ""
    var price:String = ""
    var phone:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String,no: String, phone: String, price: String, imageUrl: String, id: String) {
        this.name = name
        this.no =no
        this.price = price
        this.phone = phone
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}