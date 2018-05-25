import Main._
import org.scalatest.FunSuite

class ScalaTest extends FunSuite{

  /*1.*/
  test("test1(chooser)"){
    assert(Main.chooser(8) == 56)
  }
  test("test2(chooser)"){
    assert(Main.chooser(7) == 56)
  }
  test("test3(chooser)"){
    assert(Main.chooser(0) == 0)
  }
  test("test4(chooser)"){
    assert(Main.chooser(-7) == 0)
  }
  test("test5(chooser)"){
    assert(Main.chooser(2) == 14)
  }
  test("test6(chooser)"){
    assert(Main.chooser(1) == 8)
  }

  /*2.*/
  val wiskas = Wiskas()
  val corn = Corn()
  val seaweed = Seaweed()
  test("test7(feedAnimal)"){
    assert(Main.feedAnimal(wiskas) == Cat(wiskas) )
  }
  test("test8(feedAnimal)"){
    assert(Main.feedAnimal(corn) == Bird(corn) )
  }
  test("test9(feedAnimal)"){
    assert(Main.feedAnimal(seaweed) == Fish(seaweed) )
  }
  test("test10(feedAnimal)"){
    assert(Main.feedAnimal(seaweed) == Fish(seaweed) )
  }
}