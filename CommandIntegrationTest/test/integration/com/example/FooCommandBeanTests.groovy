package com.example

class FooCommandBeanTests extends GroovyTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testBar() {
        def testBar = 'asdfghjkl'
        FooCommandBean bean = new FooCommandBean(bar:testBar)

        bean.validate()
        assertFalse bean.hasErrors()
    }
}
