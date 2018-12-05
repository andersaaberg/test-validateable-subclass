package org.foo.bar

class SubclassCommand extends SuperclassCommand {

    String subclassAttribute

    static constraints = {
        importFrom SuperclassCommand
        subclassAttribute nullable: false
    }

}
