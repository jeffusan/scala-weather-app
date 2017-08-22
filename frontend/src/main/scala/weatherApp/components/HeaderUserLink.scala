package weatherApp.components

import japgolly.scalajs.react.ScalaFnComponent
import japgolly.scalajs.react.vdom.html_<^._
import weatherApp.models.GithubUser

object HeaderUserLink {
  case class Props(user: GithubUser)

  val Component = ScalaFnComponent[Props](props => {
    val user = props.user
    <.div(
      ^.display := "flex",
      ^.justifyContent := "flex-end",
      <.a(
        ^.display := "flex",
        ^.justifyContent := "center",
        ^.alignItems := "center",
        ^.borderRadius := 3.px,
        ^.padding := 5.px,
        ^.target := "blank",
        ^.href := user.html_url,
        <.img(
          ^.width := 30.px,
          ^.src := user.avatar_url,
          ^.marginRight := 10.px
        ),
        user.name
      )
    )
  })

  def apply(props: Props) = Component(props)
}