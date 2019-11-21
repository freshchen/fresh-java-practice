package helloworld

/**
  * @program: fresh-java-practice
  * @Date: 2019/7/9 1:00
  * @Author: Ling Chen
  * @Description:
  */
object hello {
  def main(args: Array[String]): Unit = {
    2 to 6 foreach{ n=> println(s"Hello ${n} bottles of beer") }
  }

}
