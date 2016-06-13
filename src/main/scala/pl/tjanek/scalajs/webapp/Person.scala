package pl.tjanek.scalajs.webapp

import scala.scalajs.js.annotation.JSExport

@JSExport("Person")
class Person(val name: String) {
  override def toString(): String = s"Person ${name}"
}
