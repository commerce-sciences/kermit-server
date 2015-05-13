import groovy.json.JsonBuilder
import static ratpack.groovy.Groovy.ratpack
import java.util.logging.Logger

ratpack {
    def log = Logger.getLogger("")

    handlers {
        get {
            render "Hello!"
        }

        get("hint") {
            render "Sesame"
        }

        get("whereIsKermit") {

            log.info "Getting kermit details"
            def answer = [:]

            def secrets = []
            secrets << [street: "emaseS", floors:10, url:"http://plywoodpeople.com/wp-content/uploads/2012/03/kermit_the_frog.jpg"]
            secrets << [street: "emaseS", floors:2, url:"http://36.media.tumblr.com/tumblr_lp9bg9Lh2x1r0h9bqo1_500.jpg"]
            secrets << [street: "yawdaorB", floors:2, url:"https://montclairdispatch.com/wp-content/uploads/2013/07/broadway1.jpg"]
            secrets << [street: "emaseS", floors:5, url:"AAA"]
            secrets << [street: "yawdaorB", floors:2, url:"AAA"]
            secrets << [street: "albmaR aL", floors:6, url:"AAA"]
            secrets << [street: "teertS llaW", floors:1, url:"AAA"]
            secrets << [street: "daoR yebbA", floors:6, url:"AAA"]
            secrets << [street: "teertS llaW", floors:3, url:"AAA"]
            secrets << [street: "dlihstoR", floors:4, url:"AAA"]

            answer.secrets = secrets

            render new JsonBuilder(answer).toPrettyString()
        }

        assets "public"
    }

}


