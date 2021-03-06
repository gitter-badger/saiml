package saiml.ga


/**
  * You should pass a class derived from this one as a type parameter to Genetic.
  *
  * See the HelloGenetic example in the tests.
  */
abstract class Individual[A <: Individual[A]](val genome: String) {
  /** Please override with a random genome constructor satisfying your domain rules. */
  def this() = this("")

  /** Domain-specific fitness function. 0 = perfect fit; the higher the worse. */
  def fitness: Int

  /**
    *  Domain-specific crossover function. Some ideas:
    *  - copy a fragment
    *  - copy random parts with some probability
    *  - copy one configuration bit while preserving some constraints
    */
  def crossover(that: A): A

  /**
    * Domain-specific mutate function. Some ideas:
    * - change a random element by a random value
    * - switch two random elements
    */
  def mutate(): A
}