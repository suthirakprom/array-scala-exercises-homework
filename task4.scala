import Array._

object task4 {
    def main(args: Array[String])
    {
        var temp: Int = 0
        var second: Int = 0
        print("Enter the size of the array: ")
        var sizeOfArr = scala.io.StdIn.readInt()
        var arr = new Array[Int](sizeOfArr)
        println("Enter " + sizeOfArr + "elements of the array: ")
        for(i <- 0 until sizeOfArr)
        {
            arr(i) = scala.io.StdIn.readInt()
           
        }
        for(x <- 0 until sizeOfArr)
        {
            for(y <- 1 until sizeOfArr)
            {
                if(arr(x)<arr(y))
                {
                    temp = arr(x)
                    arr(x) = arr(y)
                    arr(y) = temp
                    second = arr(x)
                }
            }
        }
        println("The second biggest number is " + second)
    }
}