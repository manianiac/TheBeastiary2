<web-app id="WebApp_ID" version="2.4" 
	xmlns="http://java.sun.com/xml/ns/j2ee" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee 
	http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
	<head>
			
			<link rel="stylesheet" type="text/css" href="resources/css/jquery.mobile.flatui.css" />
			<link rel="stylesheet" type="text/css" href="resources/css/cardUI.css" />
			<link rel="stylesheet" type="text/css" href="resources/css/smoothness/jquery-ui.theme.min.css"/>
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
				<div class="card">
					<div id="user-info" class="content">
						<span class="title">User Info</span>
						<h5>Username: ${user.displayname}</h5>
						<h5>Email: ${user.email}</h5>
						<h5>Join Date: ${user.datejoined}</h5>
					</div>
				</div>
		</div>
	</body>
</web-app>