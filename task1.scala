import Array._

object task1 {
    def main(args: Array[String])
    {
        var i: Int = 0
        var j: Int = 0
        var visit = -1

        println("How many number do you want to enter: ")
        var n = scala.io.StdIn.readInt()
        var arr = new Array[Int](n)
        var fr = new Array[Int](n)
        println("Enter your numbers: ")
        while (n>i)
        {
            arr(i) = scala.io.StdIn.readInt()
            i += 1
        }
        for (j <- 0 until n)
        {
            var count: Int = 1
            for (k <- j+1 until n)
            {
                if(arr(j)==arr(k))
                {
                    count += 1
                    // to avoid counting the same element
                    fr(k) = visit
                }
            }
            if(fr(j) != visit)
            {
                fr(j) = count
            }
        }
        println("--------------------")
        for(i <- 0 until n)
        {
            if(fr(i) != visit)
            {
                println(arr(i) + " occurs " + fr(i) + " times")
            }
        }
    }
}