package app

import scala.util.chaining._
import scala.util.Using
import java.io.PrintWriter

object CreateReadme extends App {

  val header =
s"""# My Repos with Presentations

Overview of my repos containing presentations

## Presentation Links""".stripMargin


  def printContent(content: String): Unit = {
    "------------------------------------------------------" tap println
    content tap println
    "------------------------------------------------------" tap println
  }

  def writeToFile(path: String, content: String): Unit =
    Using.resource(new PrintWriter(path)) { writer => writer.write(content) }

  def generateContentToFile(path: String) = {

    val projectsOutput = projects.map(_.output).mkString
    val content = header + projectsOutput

    printContent(content)
    writeToFile(path, content)
  }


  generateContentToFile("../README.md")
}