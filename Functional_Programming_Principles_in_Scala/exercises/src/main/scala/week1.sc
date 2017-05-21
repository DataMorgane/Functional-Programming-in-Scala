// Square root with Newton's method

// Absolute value function
def abs(x: Double) = if (x < 0) -x else x

// Square root function
def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)

def isGoodEnough(guess: Double, x: Double): Boolean =
  abs(guess * guess - x) / x < 0.001

def improve(guess: Double, x: Double): Double =
  (guess + x / guess) / 2

def sqrt1(x: Double): Double = sqrtIter(1.0, x)

// Testing the square root function
sqrt1(2)
sqrt1(4)
sqrt1(1e-6)
sqrt1(1e60)

// Better implementation of square root with Newton's method
// The functions sqrtIter, isGoodEnough and improve are now inaccessible by the user
// of sqrt --> Cleaner.
// We can also eliminate the redundant occurences of the x value (in the signature
// of the functions).

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

// Tail optimisation of the factorial function
def factorial(n: Int): Int = {
  def loop(n: Int, m: Int): Int =
    if ((m - 1) == 0) n else loop(n * (m - 1), m - 1)
  loop(n, n)
}

factorial(4)
factorial(6)
