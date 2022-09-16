class HelloWorldSuite extends munit.FunSuite {
  test("""test "Hello world!" message on GUI""") {
    import org.scalajs.dom.document
    appendPar("Hello world!")
    val obtained = document.querySelector("p").textContent
    val expected = "Hello world!"
    assertEquals(obtained, expected)
  }
}
