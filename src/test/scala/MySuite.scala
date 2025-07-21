import org.scalatest.funsuite.AnyFunSuite

class MySuite extends AnyFunSuite {
  test("example test that succeeds") {
    // fails
    assertCompiles("""
      enum X {
        case A
        case B
      }
      """)
  }
}
