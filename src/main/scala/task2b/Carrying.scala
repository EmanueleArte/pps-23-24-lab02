package task2b

// Carried
val p1: Double => Double => Double => Boolean = x => y => z => x <= y && y == z

// Non-carried
val p2: (Double, Double, Double) => Boolean = (x, y, z) => x <= y && y == z


// Carried
def p3(x: Double)(y: Double)(z: Double): Boolean = x <= y && y == z

// Non-carried
def p4(x: Double, y: Double, z: Double): Boolean = x <= y && y == z
