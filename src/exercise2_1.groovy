
// Napisać funkcję odnajdującą maksimum z przekazanej listy obiektów (liczb, napisów)
// i zwracającą wartość maksymalną oraz pozycje (indeksy) listy na których ta wartość się znajduje. Użyć konstrukcji  eachWithIndex.
//
// Pomoc: zwracamy listę w postaci [ maxValue, [ ind1. ind2, ... indN ]]
//
// Poniższy programik, uzywający naszej funkcji maximum:
// (maxVal, indList) = maximum( [5, 3, 5, 5, 1, 5] )
// println "Maximum: $maxVal"
// println "Indexes: $indList"
//
// (maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
// println "Maximum: $maxVal"
// println "Indexes: $indList"
// powinien wyprowadzić:
//
// Maximum: 5
// Indexes: [0, 2, 3, 5]
// Maximum: c
// Indexes: [1, 2, 3]

def maximum(list) {
    def maxValue = list[0]
    def indexList = []

    list.eachWithIndex { value, index ->
        if (value > maxValue) {
            maxValue = value
            indexList = [index]
        } else if (value == maxValue) {
            indexList << index
        }
    }

    return [maxValue, indexList]
}

(maxVal, indList) = maximum( [5,2,3,5,1,2,3] )
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"