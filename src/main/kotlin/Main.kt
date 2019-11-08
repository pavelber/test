import ucar.nc2.dt.grid.GridDataset

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val dataset = GridDataset.open("C:\\Users\\User\\Downloads\\C3_2019110300_CLCL.grb")
        println(dataset.name)
        val grids = dataset.grids
        println(grids.size)
        //println(dataset.detailInfo)
        //Kprintln(dataset.location)
        val attributes = grids[0].attributes
        attributes.forEach { a->
            println(a.toString())
        }
    }
}