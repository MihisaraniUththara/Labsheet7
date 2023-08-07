package Labsheet7

object Q3 {
  def filterPrime(numbers: List[Int]): List[Int] = {
    def isPrime(n: Int): Boolean = {
      if (n <= 1) false
      else if (n <= 3) true
      else if (n % 2 == 0 || n % 3 == 0) false
      else {
        var i = 5
        while (i * i <= n) {
          if (n % i == 0 || n % (i + 2) == 0)
            return false
          i += 6
        }
        true
      }
    }

    numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primeList = filterPrime(inputList)
    println(primeList)
  }

}
