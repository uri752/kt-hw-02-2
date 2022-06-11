fun main(){
    var likes: Int
    var resultString: String

    likes = 32
    resultString = getResultString(likes)
    println(resultString)

    likes = 61
    resultString = getResultString(likes)
    println(resultString)
}

fun getResultString(likes: Int): String {
    var res: String

    if(likes % 10 == 1){
        res = "человеку"
    } else {
        res = "людям"
    }


    return "Понравилось $likes $res"
}