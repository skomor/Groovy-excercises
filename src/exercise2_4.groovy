// Uogólnić funkcję z zadania 2, tak by wprowadzane mogły być dowolne liczby i słowa (napisy rozdzielone białymi znakami),
// a ich poprawność weryfikowana za pomocą przekazanego funkcji domknięcia.
// Niech funkcja nazywa sie getData.
// Przykładowe wywołania:
//
// getData(Integer) { it > 0 }           // liczby całkowite większe od 0
// println getData() { it.size() > 3 }   // słowa o długości większej od 3 (domyślny typ: String)
// println getData()                     // dowolne napisy (słowa)
// println getData(BigDecimal)           // dowolne liczby

import javax.swing.*

def validate(c, value) {
    return c(value)
}

def getData(arg1 = null, arg2 = null) {
    def dataList = []
    def err = false;
    def input ="";
    while (true) {
        def text = "Enter an integer"
        if(err) text =  "Incorrect input ${input}"
        input = JOptionPane.showInputDialog(null, text, "")
        def value = 0;
        if(input =="")
            break
        if (arg1 instanceof Class) {
            try {
                input = input.asType(arg1)
                if (arg2 instanceof Closure && !validate(arg2, input)) {
                    err = true
                    continue
                }
            }
            catch (ex) {
                err = true
                continue
            }
        }
        if(arg1 instanceof Closure && !validate(arg1, input)) {
            err = true
            continue
        }
        dataList << value
        err = false;
    }
    return dataList
}

println getData() { it.size() > 3 }
println getData(Double) { it > 3 }
println getData()
