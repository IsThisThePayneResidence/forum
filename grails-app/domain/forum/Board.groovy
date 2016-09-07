package forum

class Board {

    Long id

    String name

    String abbrev

    String description

    static hasMany = [threads: Thread]

    static constraints = {
        name blank: false, size: 1..150
        abbrev blank: false, size: 1..6
        description size: 1..1000, nullable: true
    }
}
