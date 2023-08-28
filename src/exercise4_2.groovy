def plnRate = 0.22 // PLN to EUR conversion rate

def menuFile = new File("4_files/MenuPl.txt")
def menuData = menuFile.readLines()

def menuEurFile = new File("4_files/MenuEur.txt")
menuEurFile.withWriter { writer ->
    menuData.each { line ->
        def parts = line.split(" ")
        def dish = parts[0]
        def price = parts[1].toDouble() * plnRate
        writer.println "$dish $price"
    }
}