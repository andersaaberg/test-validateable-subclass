package org.foo.bar

import grails.validation.Validateable

class SuperclassCommand implements Validateable {

    String superclassAttribute

    static constraints = {
        superclassAttribute nullable: false
    }
}
