package ch1

class P44 {
    fun renderPersonList(persons: Collection<Person>) =
            createHTML().table {
                for (person in persons) {
                    tr {
                        td {+person.name}
                        td {person.age}
                    }
                }
            }
}
