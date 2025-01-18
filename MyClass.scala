```scala
class MyClass(val value: Int) {
  def this() = this(0) // Auxiliary constructor
}
```
This code has a subtle issue related to how auxiliary constructors work in Scala.  If the primary constructor requires arguments, the auxiliary constructor must call another constructor within the class. While this example works, it will fail if you add another constructor with non-default parameters.