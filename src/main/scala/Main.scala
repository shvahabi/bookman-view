@main def hello: Unit = 
  appendPar("Hello world!")

def appendPar(text: String): Unit =
  import org.scalajs.dom.document
  val parNode = document.createElement("p")
  parNode.textContent = text
  document.body.appendChild(parNode)

