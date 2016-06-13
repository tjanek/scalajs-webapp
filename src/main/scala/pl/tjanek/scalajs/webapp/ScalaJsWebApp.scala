package pl.tjanek.scalajs.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery
import org.scalajs.dom
import org.scalajs.dom.html
import org.scalajs.dom.document


object ScalaJsWebApp extends JSApp {
  def main() : Unit = {
    jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    setupCanvas()
  }

  def setupCanvas(): Unit = {
    val canvas : html.Canvas = document.getElementById("myCanvas").asInstanceOf[html.Canvas]
    val ctx : dom.CanvasRenderingContext2D = canvas.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]
    ctx.rect(188, 50, 200, 100)
    ctx.fillStyle = "black"
    ctx.fill()
  }
}
