@main def Question_01: Unit =
    printf("Enter the deposit amount : ")
    var dep = scala.io.StdIn.readDouble()
    var inter = interest(dep)
    println(f"Interest for $dep%1.2frs is $inter%1.2frs")


def interest(dep: Double): Double = {
    if(0 >= dep){
        0
    } else if(dep <= 20000){
        0.02 * dep
    } else if(dep <= 200000){
        0.04 * dep
    } else if(dep <= 2000000){
        0.035 * dep
    } else {
        0.065 * dep
    }
  }