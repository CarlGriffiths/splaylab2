
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.120*/("""

"""),_display_(/*3.2*/main("Products",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProducts.size()),format.raw/*14.52*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*39.10*/for(p<-products) yield /*39.26*/ {_display_(Seq[Any](format.raw/*39.28*/("""
          """),format.raw/*40.11*/("""<tr>
              """),_display_(/*41.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*41.104*/ {_display_(Seq[Any](format.raw/*41.106*/("""
                """),format.raw/*42.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*42.72*/(p.getId + ".jpg")),format.raw/*42.90*/(""""/></td>
            """)))}/*43.15*/else/*43.20*/{_display_(Seq[Any](format.raw/*43.21*/("""
                """),format.raw/*44.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*45.14*/("""
            """),format.raw/*46.13*/("""<td class="numeric">"""),_display_(/*46.34*/p/*46.35*/.getId),format.raw/*46.41*/("""</td>
            <td><a href=""""),_display_(/*47.27*/routes/*47.33*/.HomeController.productDetails(p.getId)),format.raw/*47.72*/("""">
                """),_display_(/*48.18*/p/*48.19*/.getName),format.raw/*48.27*/("""</td>
               </a>        
            <td>"""),_display_(/*50.18*/p/*50.19*/.getDescription),format.raw/*50.34*/("""</td>
            <td  class="numeric">"""),_display_(/*51.35*/p/*51.36*/.getStock),format.raw/*51.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*52.37*/("%.2f".format(p.getPrice))),format.raw/*52.64*/("""</td>
            <td>
              <a href=""""),_display_(/*54.25*/routes/*54.31*/.HomeController.updateProduct(p.getId)),format.raw/*54.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*58.25*/routes/*58.31*/.HomeController.deleteProduct(p.getId)),format.raw/*58.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*63.10*/("""
      """),format.raw/*64.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*69.17*/routes/*69.23*/.HomeController.addProduct()),format.raw/*69.51*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*75.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 11:49:02 GMT 2018
                  SOURCE: /home/wdd/webapps/lab2/app/views/index.scala.html
                  HASH: 5825c055eac0ce3cbc01c76e1121edd4e71aa104
                  MATRIX: 1023->1|1237->119|1265->122|1294->143|1333->145|1361->147|1543->302|1558->308|1603->332|1681->384|1717->404|1757->406|1793->415|1830->425|1845->431|1896->461|1950->488|1960->489|1989->497|2028->508|2076->529|2086->530|2126->549|2184->577|2216->582|2360->700|2401->732|2441->734|2477->743|2549->788|2563->793|2599->808|2635->817|2679->831|2713->838|3004->1102|3036->1118|3076->1120|3115->1131|3162->1151|3260->1239|3301->1241|3346->1258|3428->1313|3467->1331|3508->1354|3521->1359|3560->1360|3605->1377|3723->1464|3764->1477|3812->1498|3822->1499|3849->1505|3908->1537|3923->1543|3983->1582|4030->1602|4040->1603|4069->1611|4147->1662|4157->1663|4193->1678|4260->1718|4270->1719|4300->1728|4369->1770|4417->1797|4491->1844|4506->1850|4565->1888|4762->2058|4777->2064|4836->2102|5056->2291|5090->2298|5165->2346|5180->2352|5229->2380|5362->2483
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|77->45|78->46|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|86->54|86->54|86->54|90->58|90->58|90->58|95->63|96->64|101->69|101->69|101->69|107->75
                  -- GENERATED --
              */
          