package KotlinInAction.chapter3._6

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-10 13:49
 */
class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Name"
        )
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Address"
        )
    }
}

fun saveUser1(user: User) {
    fun validate(
        value: String,
        fieldName: String
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: ${fieldName} is empty"
            )
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
}

fun User.validateBeforeSave() {
    fun validate(
        value: String,
        fieldName: String
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: $fieldName is empty"
            )
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser2(user: User) {
    user.validateBeforeSave()
}

fun main(args: Array<String>) {
//    saveUser(User(1, "name", ""))
//    saveUser1(User(3, "name", ""))
    saveUser2(User(2, " ", " "))
}