external val exports: dynamic

fun main() {
    exports.helloHttp = { req: dynamic, res: dynamic ->
        res.send(createMessage(req))
    }
}

private fun createMessage(req: dynamic): String {
    val message = when {
        req.query.name !== undefined -> escapeHTML(req.query.name)
        req.body.name !== undefined -> escapeHTML(req.body.name)
        else -> "World"
    }
    return "Hello $message"
}
