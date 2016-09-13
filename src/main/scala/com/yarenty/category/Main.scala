
import cats._
import cats.instances.all._
import cats.syntax.partialOrder._
import cats.syntax.eq._
import cats.syntax.show._


case class Person(name: String)

case class Car(model: String)






object Main {


  def main(args: Array[String]) {




    import cats.syntax.eq._
    println("(Some(1): Option[Int]) =!= (Some(2): Option[Int]) :" + ((Some(1): Option[Int]) =!= (Some(2): Option[Int])))
    println("(Some(1): Option[Int]) === (Some(1): Option[Int]) :" + ((Some(1): Option[Int]) === (Some(1): Option[Int])))

    //order - compare + min and max
    println("1.0 compare 2.0 :" + (1.0 compare 2.0))
    println("1.0 max 2.0 :" + (1.0 max 2.0))


    import cats.syntax.partialOrder._
    //partial order
    println("1 tryCompare 2: " + (1 tryCompare 2))
    println("1.0 tryCompare Double.NaN : " + (1.0 tryCompare Double.NaN))

    println("lt(1, 2) :" + (lt(1, 2)))

    //show  - almost like toString
    println("3.show: " + 3.show)
    println("\"hello\".show: " + "hello".show)


    implicit val personShow = Show.show[Person](_.name)
    println("implicit val personShow = Show.show[Person](_.name)")
    println("Person(\"Alice\").show :" + Person("Alice").show)
    implicit val carShow = Show.fromToString[Car]
    println("implicit val carShow = Show.fromToString[Car]")
    println("Car(\"CR-V\"): " + Car("CR-V"))








  }

  def lt[A: PartialOrder](a1: A, a2: A): Boolean = a1 <= a2




}