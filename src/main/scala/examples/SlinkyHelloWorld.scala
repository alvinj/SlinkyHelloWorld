package examples

import org.scalajs.dom
import slinky.core._
import slinky.web.ReactDOM
import slinky.web.html._

object SlinkyHelloWorld {

    def main(args: Array[String]): Unit = {
        println("sample log message")                // goes to the browser console
        System.err.println("sample error message")   // goes to the browser console
        ReactDOM.render(
            h1("Hello, Slinky World!"),
            dom.document.getElementById("root")
        )
    }
}
