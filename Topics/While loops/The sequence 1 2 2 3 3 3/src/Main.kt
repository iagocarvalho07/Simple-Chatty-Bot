
    // put your code here
    fun main() {
        val n = readln().toInt()
        var num = 0
        var prin = 0
        while (prin < n) {
            repeat(num) {
                if (prin < n) {
                    print("$num ")
                    prin++
                }
            }
            num++
        }
    }
