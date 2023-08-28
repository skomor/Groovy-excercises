def list1 = [ 'a', 'b', 'c']
def list2 = [ 1, 8, 23 ]



list1.each { println it }
list2.each { println it }


def list11 = []
list1.each { list11 << it * 2 }
println list11

def list12 = []
list2.each { list12 << it * 2 }
println list12
