package zayson.java.lab.kotlin.basic

interface Expr {
    class Num(val value: Int) : Expr
    class Sum(val left: Expr, val right: Expr) : Expr
}