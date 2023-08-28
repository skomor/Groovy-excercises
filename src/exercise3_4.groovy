def text = "first price 100 PLN, 200.50 PLN, and third:  300.99 PLN."
def plnRate = 4.69

def plnAmounts = text =~ /(\d+(\.\d+)? PLN)/

def outputs = []
plnAmounts.each { plnAmount ->
    def splitted = plnAmount[0].split(" ")[0];
    def amount = Double.parseDouble(splitted) / plnRate
    text = text.replace(plnAmount[0], "${(amount)} EUR")
    outputs << "${(amount)} EUR"
}

println text
println outputs