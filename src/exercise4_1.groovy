def projectsFile = new File("4_files/Projekty.txt")
def projectsData = projectsFile.readLines()

def projects = [:]
projectsData.each { line ->
    def parts = line.split("\t")
    def project = parts[0]
    def programmers = parts[1..-1]
    projects[project] = programmers
}
println projects

def bigProjectsFile = new File("4_files/ProjektyDuze.txt")
bigProjectsFile.withWriter { writer ->
    projects.each { k, v ->
        if (v.size() > 3) {
            writer.println k
        }
    }
}

def programmersFile = new File("4_files/Programisci.txt")
programmersFile.withWriter { writer ->
    def allProgrammers = projects.values().flatten().unique()
    allProgrammers.each { programmer ->
        writer.print "$programmer\t"
        projects.each { k, v ->
            if (v.contains(programmer)) {
                writer.print "$k\t"
            }
        }
        writer.println ""
    }
}