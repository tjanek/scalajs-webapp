package pl.tjanek.scalajs.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery

object ScalaJsWebApp extends JSApp {
  def main() : Unit = {
    jQuery(setupUI _)
  }

  def appendPar(text: String): Unit = {
    jQuery("body").append(s"<p>${text}</p>")
  }

  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello World</p>")
  }

  def addClickedMessage(): Unit = {
    appendPar("You clicked the button!")
  }
}
