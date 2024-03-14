package task2a

def neg(pred: String => Boolean): String => Boolean = !pred(_)