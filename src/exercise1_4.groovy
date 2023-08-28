def scanner = new Scanner(System.in)

print "Podaj liczby: "
def nums = scanner.nextLine()

def toNumberAsWord(String stringNumbers) {
    if (!stringNumbers.isNumber()) {
        print "NaN"
        return;
    }
    def numbers = stringNumbers.collect { x -> Integer.parseInt(x) }
    numbers.eachWithIndex { number, index ->
        displayAsWord(number, index == 0)
    }
}

def displayAsWord(int number, boolean isFirst) {
    def numArr = ["zero", "jeden", "dwa", "trzy", "cztery", "pięć", "sześć", "siedem", "osiem", "dziewięć"] as String[]
    def word = numArr[number];
    if (!isFirst)
        print(" - ")
    print(word)
}

toNumberAsWord(nums)