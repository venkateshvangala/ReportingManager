
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.data.helpers.SignIn,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(userForm: models.data.helpers.SignIn):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.40*/("""

<!doctype html>
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
	  <link rel="shortcut icon" href=""""),_display_(Seq[Any](/*16.37*/routes/*16.43*/.Assets.at("src/img/app/favicon.ico"))),format.raw/*16.80*/("""" />
	  
	  <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*18.50*/routes/*18.56*/.Assets.at("src/css/app/styles.css"))),format.raw/*18.92*/(""""> </link>
	  <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*19.50*/routes/*19.56*/.Assets.at("src/css/lib/main.css"))),format.raw/*19.90*/(""""> </link>
	</head>
	<body>
		<div class="container" style="padding-top: 12.5%;"> 
			
		
			<div class="login-container">
				 """),_display_(Seq[Any](/*26.7*/if(userForm.hasGlobalErrors)/*26.35*/ {_display_(Seq[Any](format.raw/*26.37*/("""
    <p class="error">
    """),_display_(Seq[Any](/*28.6*/userForm/*28.14*/.globalError.message)),format.raw/*28.34*/("""
    </p>
""")))})),format.raw/*30.2*/("""

				<div class="row header">
					<div class="span_6 pull-left">
						<h3>Login</h3>
					</div>
					<div class="span_6 pull-left">	
						<img alt="Pramati Reporting Manager App" src="assets/src/img/app/logo.png" />
					</div>
				</div>
				<div class="clear-fix"><br/></div>
				
				<div class="row">
					<form action="/signIn" method="post" autocomplete="on" >
						<div class="span_12">
							<label>User Name</label>
							<input type="text" name="userName" placeholder="Enter User Name" value=""/>
						</div>
						<div class="clear-fix"><br/></div>
						<div class="span_12">
							<label>Password</label>
							<input type="password" name="password" placeholder="Enter Password" value=""/>
						</div>
						<div class="clear-fix"><hr/></div>
						<div class="row">
							
							<span>
								<button type="submit" class="btn btn-success pull-right">SignIn</button>
							</span>
							<span>
								<a href="javascript:void(0);" class="btn btn-link pull-right">Forgot Password?</a>
							</span>
						</div>
						
					</form>
					<div class="clear-fix"><br/></div>
				</div>
				
				
				<div class="clear-fix"></div>
			</div>
		</div>
</body>
    
</html>"""))}
    }
    
    def render(userForm:models.data.helpers.SignIn): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((models.data.helpers.SignIn) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 16 15:46:34 IST 2015
                    SOURCE: /home/venkateshv/projects/ReportingManager/app/views/login.scala.html
                    HASH: e9adaea965bb4657673b672682a14a31fc4339d5
                    MATRIX: 576->3|708->41|1508->805|1523->811|1582->848|1676->906|1691->912|1749->948|1845->1008|1860->1014|1916->1048|2080->1177|2117->1205|2157->1207|2220->1235|2237->1243|2279->1263|2321->1274
                    LINES: 19->2|22->2|36->16|36->16|36->16|38->18|38->18|38->18|39->19|39->19|39->19|46->26|46->26|46->26|48->28|48->28|48->28|50->30
                    -- GENERATED --
                */
            