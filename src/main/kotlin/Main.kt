

    fun main(args: Array<String>) {
        val authentication =  Authentication()
        if (authentication.verifyUserName("Er@an")){
            println("Username OK")
        }else{
            println("illegal characters please use only A-Z/a-z")
        }

    }

    class Authentication{

        fun verifyUserName(userName:String) : Boolean{
            var isUserNameOK : Boolean = true
            if(userName.isNullOrBlank()){
                isUserNameOK = false
            }
            if(userName.isNullOrEmpty()){
                isUserNameOK = false
            }
         letter@ for( letter in userName){
                when(letter){
                    '!' -> {
                        isUserNameOK = false
                        break@letter
                    }
                    '@' -> {
                        isUserNameOK = false
                        break@letter
                    }
                    '#' -> {
                        isUserNameOK = false
                        break@letter
                    }
                    '$' -> {
                        isUserNameOK = false
                        break@letter
                    }
                    '%' -> {
                        isUserNameOK = false
                        break@letter
                    }
                    '*' -> {
                        isUserNameOK = false
                        break@letter
                    }
                    '(' -> {
                        isUserNameOK = false
                        break@letter
                    }
                    ')' -> {
                        isUserNameOK = false
                        break@letter
                    }
                    '-' -> {
                        isUserNameOK = false
                        break@letter
                    }
                    '+' -> {
                        isUserNameOK = false
                        break@letter
                    }
                    '=' -> {
                        isUserNameOK = false
                        break@letter
                    }
                    else -> {
                        isUserNameOK = true
                    }
               }
            }
            return isUserNameOK
        }
    }