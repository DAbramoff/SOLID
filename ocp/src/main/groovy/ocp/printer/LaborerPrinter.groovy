package ocp.printer

import ocp.dao.Person

class LaborerPrinter implements PersonPrinter {
    private List<Person> persons

    LaborerPrinter(List<Person> persons) {
        println("Laborer list contains ${persons.size()} persons")
        this.persons = persons
    }

    @Override
    void printPersonsCount() {
        println("Print laborer count ${persons.size()}")
    }

    @Override
    void printPerson(int index) {
        println("Laborer by index $index: ${personToString(persons.get(index))}")
    }

    @Override
    void printFullName(int index) {
        println("Full laborer name by index $index: ${persons.get(index)?.firstName} ${persons.get(index)?.lastName}")
    }

    @Override
    void printAllPersons() {
        println("All laborer: ")
        persons.eachWithIndex { person, index ->
            println("$index" + ":" + personToString(person))
        }
    }

    private String personToString(Person person) {
        String stringPerson =
                "Laborer - |" +
                        " First name: ${person?.firstName}" +
                        "; Last name: ${person?.lastName}" +
                        "; Age: ${person?.age}" +
                        "; Gender: ${person?.gender}" +
                        " |"
        return stringPerson
    }
}
