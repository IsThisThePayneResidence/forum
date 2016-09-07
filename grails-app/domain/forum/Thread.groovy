package forum

class Thread {

    Long id

    String name

    Board board

    static belongsTo = Board

    static hasMany = [posts: Post]

    static constraints = {
        name size: 1..100, blank: false, unique: true
    }

    Date lastPostDate() {
        Post.createCriteria().get {
            eq("thread", this)
            projections {
                max "postDate"
            }
        } as Date
    }
}
