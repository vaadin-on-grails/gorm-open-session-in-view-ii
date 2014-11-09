import com.myapp.Account
import com.myapp.User

class BootStrap {

    def init = { servletContext ->
        Account account = new Account()
        account.name = 'Account 1'
        account.save(failOnError: true)

        User user = new User()
        user.username = 'User 1'
        user.password = 'secret'
        user.account = account
        user.save(failOnError: true)
    }
    def destroy = {
    }
}
