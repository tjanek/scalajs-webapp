package pl.tjanek.scalajs.webapp

object Conversions {
  implicit class Greetings(s: String) {
    def hello(): String = {
      s"Hello, ${s}"
    }
  }
}
