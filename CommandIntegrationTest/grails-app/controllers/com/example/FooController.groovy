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
        // Password strength rule = any sequence of characters starting, at least one digit, at least one letter.
        bar minSize:6,  matches: /^.*(?=.*\d)(?=.*[a-zA-Z]).*$/
    }
}