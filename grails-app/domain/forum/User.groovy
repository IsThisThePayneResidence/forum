package forum

class User {

    Long id

    String username

    String password

    String email

    String footer

    Short rank

    UserRole role

    Date signUpDate

    String pictureUrl

    static belongsTo = Post

    static constraints = {
        username size: 5..15, blank: false, unique: true
        password size: 5..15, blank: false
        email email: true, blank: false
        rank min: 0, max: 100
    }
}
