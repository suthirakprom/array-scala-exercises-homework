object task3 {
    def main(args: Array[String])
    {
        var i = 0
        var c = 0
        print("Enter how many numbers you want to insert: ")
        var n = scala.io.StdIn.readInt()
        var arr = new Array[Int](n)
        println("Enter those numbers: ")
        while(n>i)
        {
            arr(i) = scala.io.StdIn.readInt()
            i += 1
        }
        print("Enter a position you want to remove: ")
        var position = scala.io.StdIn.readInt()
        if(position>=n+1)
        {
            print("Deletion is not possible.")
        } 
        else 
        {
            var c = position - 1 
            for(x <- c until n-1)
            {
                arr(x) = arr(x+1)
            }
            println("After removing: ")
            for(x <- 0 until n - 1)
            {
                println(arr(x))
            }
        }
    }
}