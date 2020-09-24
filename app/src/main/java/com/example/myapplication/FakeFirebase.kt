package com.example.myapplication

class FakeFirebase {

     companion object {
         fun getInstance(): FakeFirebase {
            return FakeFirebase()
         }
     }
}