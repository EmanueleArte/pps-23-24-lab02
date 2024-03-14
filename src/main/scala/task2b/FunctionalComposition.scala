package task2b

def intCompose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

def compose[A, B, C](f: B => C, g: A => B): A => C = x => f(g(x))