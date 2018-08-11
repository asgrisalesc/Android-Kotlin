import kotlin.test.assertTrue

fun main(args: Array<String>) {
    val inputCode = readLine()
    val regex = """\d+""".toRegex()

    assertTrue {
        regex.matches(inputCode.toString())

    }

}