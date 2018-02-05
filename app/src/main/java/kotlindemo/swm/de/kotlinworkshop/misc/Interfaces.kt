package kotlindemo.swm.de.kotlinworkshop.misc

interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun evaluate(expression: Expr): Int {
    if (expression is Num) {
        return expression.value
    } else if (expression is Sum) {
        return evaluate(expression.right) + evaluate(expression.left)
    } else {
        throw SecurityException("")
    }
}

fun evaluateOther(expression: Expr): Int =
        when (expression) {
            is Num -> expression.value
            is Sum -> evaluateOther(expression.right) + evaluateOther(expression.left)
            else -> throw SecurityException("")
        }
