
// Exercise 1
// Write a tail recursive version of sum :
def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, acc + f(a))
  }
  loop(a, 0)
}

sum(x => x)(1, 3)  // 6
sum(x => x*x)(1,2)  // 5