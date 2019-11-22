import mt.edu.um.cf2.jgribx.GribFile
import java.util.*

object GribX {
    @JvmStatic
    fun main(args: Array<String>) {
        val name = "C:\\Users\\User\\Downloads\\C3_2019111812_CLCH.grb"
        val file = GribFile(name)
       // println(file)
        val record = file.getRecord(GregorianCalendar(2019, 10, 19, 17, 0, 0), "HCDC", "SFC")
        println(record.forecastTime.toInstant())
        println(record.getValue(31.93,34.7))
    }
}