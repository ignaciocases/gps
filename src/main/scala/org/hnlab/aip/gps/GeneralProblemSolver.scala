object GeneralProblemSolver extends App {
  
  override def main(args: Array[String]) = {
    val s = Set("son-at-school")
    val g = List("son-at-school")
    println(gps(s, g, List("")))
  }
  
  /*
   * General Problem Solver
   * achieve all goals using ops
   */
  def gps(state: Set[String], goals: List[String], ops: List[String]): String = {
    
    /*
     * A goal is achieved if it already holds,
     * or if there is an appropriate op for it that is applicable
     */
    def achieve(goal: String): Boolean = state.contains(goal)
      
    def every[A](fun: A => Boolean, g: List[A]) = g.forall(fun(_))

    // test if every goal is satisfied with current state
    if (every(achieve, goals)) "Solved" else "Failed"  
  }
}

case class Operator(val op: String)

// goal: String
// 