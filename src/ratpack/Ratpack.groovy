import groovy.json.JsonBuilder
import ratpack.form.Form
import ratpack.groovy.template.TextTemplateModule

import static ratpack.groovy.Groovy.groovyTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {

    bindings {
        add(TextTemplateModule) { TextTemplateModule.Config config -> config.staticallyCompile = true }
    }

    handlers {
        get {
            render "Hello!"
        }

        get("kermit") {

            def kermit = [:]
            kermit.name = "kermit"
            kermit.age = "111"



            render new JsonBuilder(kermit).toPrettyString()
        }

        assets "public"
    }

}


