import cats._, cats.instances.all._, cats.syntax.eq._
import cats._
import cats.instances.all._
import cats.syntax.eq._

object Main {

  def main(args: Array[String]) {
   println( "(Some(1): Option[Int]) =!= (Some(2): Option[Int]) :" +( (Some(1): Option[Int]) =!= (Some(2): Option[Int]) ) )

   println ("1.0 compare 2.0 :" + (1.0 compare 2.0))

    println("1.0 max 2.0 :" + (1.0 max 2.0))

  }

}