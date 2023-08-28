// Napisać funkcję List apply(List l, Closure c), która każdy element listy l transformuje
// za pomocą domknięcie c i zwraca listę transformowanych wartości.

// Przetestować dla różnych list i różnych domknięć

static def apply(List l, Closure c) {
    l.collect(c)
}

def res

def list1 = [2, 4, 5, 6]
res = apply(list1, {
    it * 2
})
println res

def list2 = [2, 1, 0, -2]
res = apply(list2, {
    it * it
})
println res