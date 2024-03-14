package task2a

def neg(predicate: String => Boolean): String => Boolean = (s: String) => !predicate(s)