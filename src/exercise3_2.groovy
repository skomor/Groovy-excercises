/*

Firma software'owa prowadzi projekty w:
Groovy, Grails, Java, JEE
Do każdego projektu przypisani są programiści, co pokazuje poniższa mapa:

def pmap = [ Groovy: [ 'Asia', 'Jan' ],
             Grails: [ 'Asia', 'Jan', 'Stefan', 'Mirek' ],
             Java: [ 'Asia', 'Stefan', 'Mirek' ],
             JEE: [ 'Slawek', 'Stefan', 'Janusz' ]
]
Wypisać:
a) ile osób pracuje w każdym z projektów  (3 p)
b) projekty, które mają więcej niż dwóch programistów (3p )
c)  w jakich projektach biorą udzial poszczególni programisci (6 p.)
*/

def pmap = [ Groovy: [ 'Asia', 'Jan' ],
             Grails: [ 'Asia', 'Jan', 'Stefan', 'Mirek' ],
             Java: [ 'Asia', 'Stefan', 'Mirek' ],
             JEE: [ 'Slawek', 'Stefan', 'Janusz' ]
]



// a) ile osób pracuje w każdym z projektów
pmap.each { k, v -> println "$k: ${v.size()} people" }

// b) projekty, które mają więcej niż dwóch programistów
pmap.each { k, v -> if (v.size() > 2) println k }

// c) w jakich projektach biorą udzial poszczególni programisci
def programmers = pmap.values().flatten().unique()
programmers.each { p ->
    print "$p: "
    pmap.each { k, v -> if (v.contains(p)) print "$k " }
    println ""
}