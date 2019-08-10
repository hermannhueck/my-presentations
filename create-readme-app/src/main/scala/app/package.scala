package object app {

  val baseUrl = "https://github.com/hermannhueck"

  case class Project(title: String, repo: String, pdf: String) {
    val repoUrl = s"$baseUrl/$repo"
    val viewPdf = s"$repoUrl/blob/master/slides/$pdf"
    val downloadPdf = s"$repoUrl/raw/master/slides/$pdf"
    val output = s"""
- $title: $repoUrl<br/>
  [View PDF]($viewPdf)
  &nbsp; &nbsp; &nbsp; &nbsp; [Download PDF]($downloadPdf)
""".stripMargin
  }

  val projects = List(
    Project("New in Scala 2.13", "new-in-scala213", "New-in-Scala-2.13.pdf"),
    Project("How to scalafix my code", "howto-scalafix-my-code", "howto-scalafix-my-code.pdf"),
    Project("Pragmatic SBT", "pragmatic-sbt", "Pragmatic-sbt-1.2.8.pdf"),
    Project("From Function1#apply to Kleisli - Different Ways of Function Composition in Scala", "composing-functions", "From-Function1%23apply-to-Kleisli.pdf"),
    Project("Use Applicative where applicable!", "use-applicative-where-applicable", "use-applicative-where-applicable.pdf"),
    Project("Implementing the IO Monad in Scala", "implementing-io-monad", "Implementing-the-IO-Monad.pdf"),
    Project("Future vs. Monix Task - compares asynchronous abstractions Future and monix.eval.Task", "future-vs-monix-task", "Future-vs-Monix-Task.pdf"),
    Project("From Functor Composition to Monad Transformers", "monad-transformers", "from-functor-composition-to-monad-transformers.pdf"),
    Project("Composing an App with Free Monads (using Cats)", "free-monad-app", "composing-an-app-with-free-monads.pdf"),
    Project("Type Classes in Scala and Haskell", "typeclasses", "TypeClasses.pdf"),
  )
}