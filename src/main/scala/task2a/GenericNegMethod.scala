package task2a

def genericNeg[X](pred: X => Boolean): X => Boolean = !pred(_)