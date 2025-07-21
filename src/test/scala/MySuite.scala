import org.scalatest.funsuite.AnyFunSuite

class MySuite extends AnyFunSuite {
  // passes
  test("example test that succeeds") {
    assertCompiles("""
      enum X {
        case A
        case B
      }
      """)
  }
}
