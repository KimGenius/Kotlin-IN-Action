package ch1


object CountryTable : IdTable() {
    val name = varchar("name", 250).uniqueIndex()
    val iso = varchar("iso", 2).uniqueIndex()
}

class Country(id:EntityID) : Entity(id) {
    var name: String by CountryTable.name
    var iso: String by CountryTable.iso
}

fun main(args: Array<String>) {
    val russia = Country.find {
        CountryTable.iso.eq("ru")
    }.first()
    println(russia)
}