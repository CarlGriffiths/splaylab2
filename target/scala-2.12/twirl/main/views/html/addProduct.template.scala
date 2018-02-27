
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Product",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProductSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.85*/("""
        """),format.raw/*14.9*/("""<lable>Select category(s)</lable>
        """),_display_(/*15.10*/for((value,name) <- Category.options) yield /*15.47*/ {_display_(Seq[Any](format.raw/*15.49*/("""
            """),format.raw/*16.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*16.63*/value),format.raw/*16.68*/(""""/>"""),_display_(/*16.72*/name),format.raw/*16.76*/("""<br>        
        """)))}),format.raw/*17.10*/("""
        
    

        """),_display_(/*21.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*21.99*/("""
        """),_display_(/*22.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*22.87*/("""
        """),_display_(/*23.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*23.87*/("""

        """),_display_(/*25.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*25.74*/("""
        
        """),format.raw/*27.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary">
            <a href=""""),_display_(/*32.23*/routes/*32.29*/.HomeController.index(0)),format.raw/*32.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*36.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 13:09:25 GMT 2018
                  SOURCE: /home/wdd/webapps/lab2/app/views/addProduct.scala.html
                  HASH: 4573db2056eeddd3a2ac672bf3fe1ffe4d8aea12
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1249->105|1288->107|1319->112|1387->155|1543->303|1582->305|1619->342|1656->352|1669->356|1700->366|1738->377|1834->452|1870->461|1940->504|1993->541|2033->543|2074->556|2151->606|2177->611|2208->615|2233->619|2286->641|2338->666|2448->755|2485->765|2583->842|2620->852|2718->929|2756->940|2841->1004|2886->1022|3157->1266|3172->1272|3217->1296|3365->1414
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|47->15|47->15|47->15|48->16|48->16|48->16|48->16|48->16|49->17|53->21|53->21|54->22|54->22|55->23|55->23|57->25|57->25|59->27|64->32|64->32|64->32|68->36
                  -- GENERATED --
              */
          