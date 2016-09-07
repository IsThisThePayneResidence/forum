package forum

class Post {

    Long id

    Date postDate

    User poster

    Boolean isOriginal

    String message

    Thread thread

    Post parentPost

    static hasMany = [responses: Post, attachments: Attachment]

    static mappedBy = [responses: 'parentPost']

    static belongsTo = Thread

    static constraints = {
        parentPost nullable: true
    }
}
