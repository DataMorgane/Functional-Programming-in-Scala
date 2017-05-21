// Better implementation of square root with Newton's method
// The functions sqrtIter, isGoodEnough and improve are now inaccessible by the user
// of sqrt --> Cleaner.
// We can also eliminate the redundant occurences of the x value (in the signature
// of the functions).

// Absolute value function
def abs(x: Double) = if (x < 0) -x else x

// Square root function
def sqrt(x: Double): Double = {

  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double): Boolean =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double): Double =
    (guess + x / guess) / 2

  sqrtIter(1.0)
}

// Testing the square root function
sqrt(2)
sqrt(4)
sqrt(1e-6)
sqrt(1e60)