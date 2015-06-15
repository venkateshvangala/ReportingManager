
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js ie6 oldie" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js ie7 oldie" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js ie8 oldie" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" xml:lang="en" lang="en"> <!--<![endif]-->
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<title>Reporting Manager</title>
	<link rel="shortcut icon" href=""""),_display_(Seq[Any](/*12.35*/routes/*12.41*/.Assets.at("src/img/app/favicon.ico"))),format.raw/*12.78*/("""" />
	<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*13.48*/routes/*13.54*/.Assets.at("src/css/combined.css"))),format.raw/*13.88*/("""" />    	
	<script data-main=""""),_display_(Seq[Any](/*14.22*/routes/*14.28*/.Assets.at("src/config/require-config"))),format.raw/*14.67*/("""" src=""""),_display_(Seq[Any](/*14.75*/routes/*14.81*/.Assets.at("src/js/lib/require.js"))),format.raw/*14.116*/(""""></script>
</head> 
<body>
	<div class="row full-layout"></div>
</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 15 18:37:37 IST 2015
                    SOURCE: /home/venkateshv/projects/ReportingManager/app/views/main.scala.html
                    HASH: 097234f40ea95b1f42a2d2c0d7b02626b28d5d3f
                    MATRIX: 636->0|1236->564|1251->570|1310->607|1398->659|1413->665|1469->699|1536->730|1551->736|1612->775|1656->783|1671->789|1729->824
                    LINES: 22->1|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|35->14|35->14|35->14
                    -- GENERATED --
                */
            