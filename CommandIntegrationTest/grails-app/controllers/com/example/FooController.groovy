package com.example

class FooController {

    def index = {
    }
    def test = { FooCommandBean cmd ->
    }
}

class FooCommandBean {
    String bar

    static constraints = {
        bar minSize:6
    }
}