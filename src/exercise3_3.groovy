
def text = "text wiwth dates 2020-01-31, 2021-02-28, and 2022-03-31."

def dateStrings = (text =~ /(\d{4}-\d{2}-\d{2})/)

dateStrings.each { dateString ->
    def date = null
    def firstDate = dateString[0]
    try {
        date = Date.parse("yyyy-MM-dd", firstDate)
    } catch (Exception e) {
        // Invalid date format
    }
    if (date) {
        def cal = Calendar.instance
        cal.time = date
        def year = cal.get(Calendar.YEAR)
        def month = cal.get(Calendar.MONTH) + 1
        def day = cal.get(Calendar.DAY_OF_MONTH)
        def lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH)
        if (day <= lastDay) {
            println "Valid date: $firstDate"
        } else {
            println "Invalid date: $firstDate (day out of range)"
        }
    } else {
        println "Invalid date: $firstDate (invalid format)"
    }
}



