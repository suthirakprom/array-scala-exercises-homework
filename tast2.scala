import Array._


object task2 {
    def main(args: Array[String])
    {
        var arr = Array(1,2,3,4,5,6)
        var arr2 = new Array[Int](10)
        print("Your array now: ")
        for(x <- arr)
        {
            print(x+" ")
        }
        println()
        println("Please add 10 more numbers into this array: ")
        for(x <- 0 until 10)
        {
            arr2(x) = scala.io.StdIn.readInt()
        }
        println("After adding 10 more numbers you array become: ")
        for(x <- arr)
        {
            print(x+" ")
        }
        for(i<- 0 until 10)
        {
            print(arr2(i)+ " ")
        }

        //println("The array that provided: " + arr)
        // var arr2 = Array(7,8,9,10,11,12,13,14,15,16)
        // var arr3 = arr ++ arr2
        // for(x <- arr3)
        // {
        //     print(x)
        // }      
    }
}