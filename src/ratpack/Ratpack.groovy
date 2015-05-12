import groovy.json.JsonBuilder
import static ratpack.groovy.Groovy.ratpack
import java.util.logging.Logger

ratpack {
    def log = Logger.getLogger("")

    handlers {
        get {
            render "Hello!"
        }

        get("kermit") {

            log.info "Getting kermit details"
            def kermit = [:]
            kermit.name = "kermit"
            kermit.age = "111"



            render new JsonBuilder(kermit).toPrettyString()
        }

        assets "public"
    }

}


