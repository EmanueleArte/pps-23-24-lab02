package task2a

def genericNeg[X](predicate: X => Boolean): X => Boolean = (x: X) => !predicate(x)