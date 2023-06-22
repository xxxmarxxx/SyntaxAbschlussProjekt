open class User(var userName: String, var password: String, var userType: UserType) {
    fun anmeldeTest(inputUsername: String, inputPassword: String): Boolean {
        return userName == inputUsername && password == inputPassword
    }
}