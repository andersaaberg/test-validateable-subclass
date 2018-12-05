package org.foo.bar

import spock.lang.Specification

class AllCommandSpec extends Specification {

    void "test validation fails for superclass"() {
        given:
        SuperclassCommand command = new SuperclassCommand()

        expect:
        !command.validate()
    }

    void "test validation fails for subclass"() {
        given:
        SubclassCommand command = new SubclassCommand()

        expect:
        !command.validate() // yields exception groovy.lang.MissingMethodException: No signature of method: org.foo.bar.SubclassCommand.findConstraintsEvaluator() is applicable for argument types: () values: []
    }

    void "test validation fails for subclass with workaround"() {
        given:
        SubclassCommandWorkaround command = new SubclassCommandWorkaround()

        expect:
        !command.validate()
    }

}
