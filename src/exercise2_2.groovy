import javax.swing.JOptionPane

def getInts() {
    def intList = []
    def err = false;
    def input = "0";
    while (true) {
        try {
            def text = "Enter an integer"
            if(err) text =  "Incorrect input ${input}"
            input = JOptionPane.showInputDialog(null, text, "")

            if(input =="")
              break
            intList << Integer.parseInt(input)
        } catch (NumberFormatException e) {
            println "Invalid input. Please try again."
            err = true;
            continue
        }
        err = false;

    }
    return intList
}

def intList = getInts()
println "Entered integers: $intList"
