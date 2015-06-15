
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!doctype html>
<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7 ui-mobile-rendering" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js lt-ie9 lt-ie8 ui-mobile-rendering" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js lt-ie9 ui-mobile-rendering" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js ui-mobile-rendering" lang="en"> <!--<![endif]-->
	<head>
	  <meta charset="utf-8">
	  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	  <meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, width=device-width">
	  
	  <title>Event Management</title>
	  <link rel="shortcut icon" href=""""),_display_(Seq[Any](/*13.37*/routes/*13.43*/.Assets.at("src/img/app/favicon.ico"))),format.raw/*13.80*/("""" />
	  
	  <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*15.50*/routes/*15.56*/.Assets.at("src/css/app/styles.css"))),format.raw/*15.92*/(""""> </link>
	  <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*16.50*/routes/*16.56*/.Assets.at("src/css/lib/main.css"))),format.raw/*16.90*/(""""> </link>
	</head>
	<body>
		<div class="container" style="padding-top: 12.5%;"> 
			<div class="login-container">
				<div class="row header">
					<div class="span_6 pull-left">
						<h3>Login</h3>
					</div>
					<div class="span_6 pull-left">	
						<img alt="Pramati Eventmanagement App" src="assets/src/img/app/logo.png" />
					</div>
				</div>
				<div class="clear-fix"><br/></div>
				
				<div class="row">
					<form action="/signup" method="post" autocomplete="on" >
						<div class="span_12">
							<label>User Name</label>
							<input type="text" name="username" placeholder="Enter User Name" value=""/>
						</div>
						<div class="clear-fix"><br/></div>
						<div class="span_12">
							<label>Password</label>
							<input type="password" name="password" placeholder="Enter Password" value=""/>
						</div>
						<div class="clear-fix"><br/></div>
						<div class="span_12">
							<button type="submit" class="btn btn-link">Forgot Password?</button>
						</div>
					</form>
					<div class="clear-fix"><br/></div>
				</div>
				
				<div class="row btn-container">
					<button type="button" class="btn btn-success pull-right">Sign In</button>
				</div>
				<div class="clear-fix"></div>
			</div>
		</div>
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
                    SOURCE: /home/venkateshv/projects/ReportingManager/app/views/login.scala.html
                    HASH: 545ede15dbaf1567a8a88f701dcc062b15b6b2f3
                    MATRIX: 637->0|1435->762|1450->768|1509->805|1603->863|1618->869|1676->905|1772->965|1787->971|1843->1005
                    LINES: 22->1|34->13|34->13|34->13|36->15|36->15|36->15|37->16|37->16|37->16
                    -- GENERATED --
                */
            