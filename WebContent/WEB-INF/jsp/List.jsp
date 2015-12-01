<%@ taglib prefix="c" 
       uri="http://java.sun.com/jsp/jstl/core" %>
<web-app id="WebApp_ID" version="2.4" 
	xmlns="http://java.sun.com/xml/ns/j2ee" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee 
	http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">

	<head>
			
			<link rel="stylesheet" type="text/css" href="resources/css/jquery.mobile.flatui.css" />
			<link rel="stylesheet" type="text/css" href="resources/css/smoothness/jquery-ui.theme.min.css"/>
						<link rel="stylesheet" type="text/css" href="resources/css/cardUI.css" />
			
			<script src="resources/js/jquery.js"></script>
			<script>
				$(document).bind('mobileinit',function(){
					$.mobile.changePage.defaults.changeHash = false;
					$.mobile.hashListeningEnabled = false;
					$.mobile.pushStateEnabled = false;
				});
			</script>
			<script src="resources/js/jquery.mobile-1.4.0-rc.1.js"></script>
			
			<meta charset="utf-8">
			<meta http-equiv="X-UA-Compatible" content="IE=edge">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			
	</head>
	<body>
		<div data-role="page">
		
				<script>console.log("${test}");</script>
		
		<c:forEach items="${monsters}" var="monster">    
		
		 
			<div class="card">
			
				<c:if test="${monster.picture != 'picture link' }">
					<div class="image">
						<img src="${monster.picture}">
					</div>
				</c:if>
			
				<div class="content">
					<span class="title">${monster.monstername}</span>
					<h5>
						Author: <a href="/user?id=${monster.userid}">
						<c:forEach items="${users}" var="user">
							<c:if test="${user.userid == monster.userid}">
							${user.displayname}
							</c:if>
						</c:forEach>						
						</a>
					</h5>
					<h5>Challenge: ${monster.challenge}</h5>
					<p>WE NEED A DESCRIPTION FIELD</p>
				</div>
				<div class="action">
					<a href='/HelloProject/monster?id=${monster.monsterid}'>Full Stat Block</a>
				</div>
			</div>
		</c:forEach>

		<div class="card">
				<div class="image">
					<img src="resources/content/orcShaman.jpg">
				</div>
				<div class="content">
					<span class="title">Shaman of Grumash</span>
					<h5>Author: <a href="javascript:document.location='/HelloProject/user?id=0001">manianiac</a></h5>
					<h5>Challenge: 4</h5>
					<p>This is a space for fluff about whatever monster was created, a simple paragraph to interest casual browsers</p>
				</div>
				<div class="action">
					<a href="javascript:document.location='/monster'">Full Stat Block</a>
				</div>
			</div>
			<div class="card">
				<div class="content">
					<span class="title">Goblin Warrunner</span>
					<h5>Author: <a href="LINK TO AUTHOR">jtkerp</a></h5>
					<h5>Challenge: 2</h5>
					<p>This is a block for a creature that was not created with an image assigned</p>
				</div>
				<div class="action">
					<a href='#'>Full Stat Block</a>
				</div>
			</div>			
		</div>
	</body>
</web-app>