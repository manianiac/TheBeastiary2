<web-app id="WebApp_ID" version="2.4" 
	xmlns="http://java.sun.com/xml/ns/j2ee" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee 
	http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd"
	xmlns:th="http://www.thymeleaf.org">
   <head>
      <link rel="stylesheet" type="text/css" href="resources/css/jquery.mobile.flatui.css" />
      <link rel="stylesheet" type="text/css" href="resources/css/cardUI.css" />
      <link rel="stylesheet" type="text/css" href="resources/css/smoothness/jquery-ui.theme.min.css" />
      <script src="resources/js/jquery.js"></script>
      <script src="resources/js/jquery-ui.js"></script>
      <script>
         $(document).bind('mobileinit', function() {
             $.mobile.changePage.defaults.changeHash = false;
             $.mobile.hashListeningEnabled = false;
             $.mobile.pushStateEnabled = false;
         });
      </script>
      <script src="resources/js/jquery.mobile-1.4.0-rc.1.js"></script>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      
      <script>
      	$(function() {
      		$("#newAbility").button({
      			icons: {primary: "ui-icon-plusthick"}
      		});
    	  });
      </script>
      
   </head>
   
   
   <body>
		<div data-role="page">
			<form action="#" th:action="@{/newMonster}" th:object="${monster}" method="post">
				<div class="card" id="GeneralInfo">
					<span class="title">General Monster Information</span>
						Monster Name: <input			type="text" th:field="*{monstername}"><br>
						Race: <input 					type="text" th:field="*{race}"><br>
						Size: <input 					type="text" th:field="*{size}"><br>
						Alignment: <input 				type="text" th:field="*{alignment}"><br>
						Armor Class: <input 			type="text" th:field="*{armorclass}"><br>
						Armor Type: <input 				type="text" th:field="*{armortype}"><br>
						Hit Dice: <input 				type="text" th:field="*{hitdice}"><br>
				</div>
				<div class="card" id="MiddleInfo">
					<span class="title">Middle Information</span>
						Damage Resistance: <input 		type="text" th:field="*{damageresistance}"><br>
						Damage Immunities: <input 		type="text" th:field="*{damageimmunities}"><br>
						Condition Immunities: <input 	type="text" th:field="*{conditionimmunities}"><br>
						Senses: <input 					type="text" th:field="*{senses}"><br>
						Languages: <input 				type="text" th:field="*{languages}"><br>					
						Challenge: <input 				type="text" th:field="*{challenge}"><br>
						Skills: <input 					type="text" th:field="*{skills}"><br>
						Saves: <input 					type="text" th:field="*{saves}"><br>
				</div>
				<div class="card" id="Abilities">
					<span class="title">Abilities</span>
						Ability Name: <input 			type="text" th:field="*{ability1Name}"><br>
						Ability Description: <input 		type="text" th:field="*{ability1Description}"><br>
							<a href="#" id="newAbility">Add New Ability</a><br>
				</div>
				<div class="card" id="Actions">
					<span class="title">Actions</span>
						Action Name: <input 			type="text" th:field="*{action1Name}"><br>
						Action Description: <input 		type="text" th:field="*{action1Description}""><br>
						Add New Action +<br>
				</div>
				
<!-- 				<div class="card" id="LegendaryLairAction"> -->
<!-- 					<span class="title">Legendary and Lair Action</span> -->
<!-- 						Legendary Action Name:  -->
<!-- 								<input 					type="text" th:field="*{action1Name}"><br> -->
<!-- 						Legendary Action Description:  -->
<!-- 								<input					type="text" th:field="*{action1Description}"><br> -->
<!-- 						Add New Legendary Action + -->
<!-- 						<br> -->
<!-- 						<br> -->
<!-- 						Lair Action Name: <input 		type="text" th:field="*{action1Name}"><br> -->
<!-- 						Lair Action Description:  -->
<!-- 								<input 					type="text" th:field="*{action1Description}"><br> -->
<!-- 						Add New Lair Action + -->
<!-- 						<br> -->
<!-- 				</div> -->
				
				<div class="card" id="Fluff">
					<span class="title">Description and Image</span>
						Description: 
							<input 						type="text" th:field="*{fluff}"><br>
						Image: <input 					type="url" th:field="*{picture}"/><br>
				</div>
				
				<div class="card" id="submit">
					<input type="submit" value="Submit"/>
				</div>
			</form>
		</div>
   </body>
   
</web-app>