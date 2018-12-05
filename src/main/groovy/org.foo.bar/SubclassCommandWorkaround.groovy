package org.foo.bar

import grails.validation.Validateable

/**
 * the workaround is to implement Validateable in the subclass
 * Validateable should have been inherited from superclass
 */

class SubclassCommandWorkaround extends SuperclassCommand implements Validateable {

    String subclassWorkaroundAttribute

    static constraints = {
        importFrom SuperclassCommand
        subclassWorkaroundAttribute nullable: false
    }
}
