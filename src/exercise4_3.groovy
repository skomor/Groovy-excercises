import groovy.io.FileType

def rootDir = new File("C:\\Users\\skomo\\Downloads\\Cwiczenia")
def index = 0
rootDir.eachFileRecurse (FileType.FILES) { file ->
    println "${index++} ${file.absolutePath}"
}
