package object app {

  val baseUrl = "https://github.com/hermannhueck"

  case class Project(title: String, repo: String, pdf: String) {
    val repoUrl = s"$baseUrl/$repo"
    val viewPdf = s"$repoUrl/blob/master/slides/$pdf"
    val downloadPdf = s"$repoUrl/raw/master/slides/$pdf"
    val output = s"""
- $title: $repoUrl<br/>
  [View PDF]($viewPdf)<br/>
  &nbsp; &nbsp; &nbsp; &nbsp; [Download PDF]($downloadPdf)
""".stripMargin
  }

  val projects = List(
    Project("New in Scala 2.13", "new-in-scala213", "New-in-Scala-2.13.pdf"),
    Project("How to scalafix my code", "howto-scalafix-my-code", "howto-scalafix-my-code.pdf"),
  )
}