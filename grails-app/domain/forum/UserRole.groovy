package forum

/**
 * @author Ivan Andrusenko
 *   ivan.andrusenko.kharkiv@gmail.com
 *   Created on 9/6/16
 */
enum UserRole {
    ADMIN('admin'),
    GUEST('guest'),
    USER('user'),
    MODERATOR('moderator')
    String id

    UserRole(String id) {
        this.id = id
    }
}
