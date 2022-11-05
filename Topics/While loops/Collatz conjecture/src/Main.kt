fun main() {
    var n = readln().toInt()
    print("$n ")
    while (n > 1) {
        if (n % 2 == 0) {
            n /= 2
            
        } else if (n % 2 !=0) {
            n = n*3+1
            
        }
        print("$n ")
    }
}
