// use an integer for version numbers
version = 4


cloudstream {
    // All of these properties are optional, you can safely remove them

    description = ""
    language    = "en"
    authors = listOf("megix")

    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 1 // will be 3 if unspecified

    // List of video source types. Users are able to filter for extensions in a given category.
    // You can find a list of avaliable types here:
    // https://recloudstream.github.io/cloudstream/html/app/com.lagradost.cloudstream3/-tv-type/index.html
    tvTypes = listOf("NSFW")
    iconUrl = "https://www.longvideos.xxx/img/favicon/apple-touch-icon.png"
}
