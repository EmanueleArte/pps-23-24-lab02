package task2b

def intCompose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))