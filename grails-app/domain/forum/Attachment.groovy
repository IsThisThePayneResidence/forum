package forum

class Attachment {

    Long id

    String name

    String description

    String url

    String type

    static belongsTo = Post

    static constraints = {
        description size: 1..1000, nullable: true
    }
}
