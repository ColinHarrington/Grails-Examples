package com.example

class FooCommandBeanTests extends GroovyTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testPasswordStrength() {
        def testBar = 'welcome1'
        FooCommandBean bean = new FooCommandBean(bar:testBar)

        bean.validate()
        assertFalse bean.hasErrors()

        foo = 'welcome'        // No number
        bean = new FooCommandBean(bar:testBar)
        bean.validate()
        assertTrue bean.hasErrors()

        foo = '12345$%^&*(@'        // No letter
        bean = new FooCommandBean(bar:testBar)
        bean.validate()
        assertTrue bean.hasErrors()

        bean.errors.allErrors.each {
            println it
        }
    }
}
