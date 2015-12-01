<%@ taglib prefix="c" 
       uri="http://java.sun.com/jsp/jstl/core" %>
<web-app id="WebApp_ID" version="2.4" 
	xmlns="http://java.sun.com/xml/ns/j2ee" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee 
	http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
<head>

<link rel="stylesheet" type="text/css"
	href="resources/css/jquery.mobile.flatui.css" />
<link rel="stylesheet" type="text/css" href="resources/css/cardUI.css" />
<link rel="stylesheet" type="text/css"
	href="resources/css/smoothness/jquery-ui.theme.min.css" />
<script src="resources/js/jquery.js"></script>
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
</head>




<title>Statblock example</title>
<style>
body {
	margin: 0;
}

stat-block {
	/* A bit of margin for presentation purposes, to show off the drop
        shadow. */
	margin-left: 20px;
	margin-top: 20px;
}
</style>
</head>
<body>
	<template id="tapered-rule">
	<style>
svg {
	fill: #922610;
	/* Stroke is necessary for good antialiasing in Chrome. */
	stroke: #922610;
	margin-top: 0.7em;
	margin-bottom: 0.35em;
}
</style>
	<svg height="5" width="400">
    <polyline points="0,0 400,2.5 0,5"></polyline>
  </svg> </template>
	<script>
(function(window, document) {
  var elemName = 'tapered-rule';
  var thatDoc = document;
  var thisDoc = (thatDoc.currentScript || thatDoc._currentScript).ownerDocument;
  var proto = Object.create(HTMLElement.prototype, {
    createdCallback: {
      value: function() {
        var template = thisDoc.getElementById(elemName);
        var clone = thatDoc.importNode(template.content, true);
        this.createShadowRoot().appendChild(clone);
      }
    }
  });
  thatDoc.registerElement(elemName, {prototype: proto});
})(window, document);
</script>
	<template id="top-stats"> <tapered-rule></tapered-rule> <content></content>
	<tapered-rule></tapered-rule> </template>
	<script>
(function(window, document) {
  var elemName = 'top-stats';
  var thatDoc = document;
  var thisDoc = (thatDoc.currentScript || thatDoc._currentScript).ownerDocument;
  var proto = Object.create(HTMLElement.prototype, {
    createdCallback: {
      value: function() {
        var template = thisDoc.getElementById(elemName);
        var clone = thatDoc.importNode(template.content, true);
        this.createShadowRoot().appendChild(clone);
      }
    }
  });
  thatDoc.registerElement(elemName, {prototype: proto});
})(window, document);
</script>
	<template id="creature-heading">
	<style>
::content>h1 {
	font-family: 'Lora', 'Calisto MT', 'Bookman Old Style', Bookman,
		'Goudy Old Style', Garamond, 'Hoefler Text', 'Bitstream Charter',
		Georgia, serif;
	color: #7A200D;
	font-weight: 700;
	margin-top: -6px;
	margin-bottom: -2px;
	font-size: 25px;
	letter-spacing: 2px;
	font-variant: small-caps;
}

::content>h2 {
	font-weight: normal;
	font-style: italic;
	font-size: 12px;
	margin: 0;
}
</style>
	<content select="h1"></content> <content select="h2"></content> </template>
	<script>
(function(window, document) {
  var elemName = 'creature-heading';
  var thatDoc = document;
  var thisDoc = (thatDoc.currentScript || thatDoc._currentScript).ownerDocument;
  var proto = Object.create(HTMLElement.prototype, {
    createdCallback: {
      value: function() {
        var template = thisDoc.getElementById(elemName);
        var clone = thatDoc.importNode(template.content, true);
        this.createShadowRoot().appendChild(clone);
      }
    }
  });
  thatDoc.registerElement(elemName, {prototype: proto});
})(window, document);
</script>
	<template id="abilities-block">
	<style>
:host {
	color: #7A200D;
}

table {
	width: 100%;
	border: 0px;
	border-collapse: collapse;
}

th, td {
	width: 50px;
	text-align: center;
}
</style>
	<tapered-rule></tapered-rule>
	<table>
		<tbody>
			<tr>
				<th>STR</th>
				<th>DEX</th>
				<th>CON</th>
				<th>INT</th>
				<th>WIS</th>
				<th>CHA</th>
			</tr>
			<tr>
				<td id="str"></td>
				<td id="dex"></td>
				<td id="con"></td>
				<td id="int"></td>
				<td id="wis"></td>
				<td id="cha"></td>
			</tr>
		</tbody>
	</table>
	<tapered-rule></tapered-rule> </template>
	<script>
(function(window, document) {
  function abilityModifier(abilityScore) {
    var score = parseInt(abilityScore, 10);
    return Math.floor((score - 10) / 2);
  }

  function formattedModifier(abilityModifier) {
    if (abilityModifier >= 0) {
      return '+' + abilityModifier;
    }
    // This is an en dash, NOT a "normal" dash. The minus sign needs to be more
    // visible.
    return '+' + Math.abs(abilityModifier);
  }

  function abilityText(abilityScore) {
    return [String(abilityScore),
            ' (',
            formattedModifier(abilityModifier(abilityScore)),
            ')'].join('');
  }

  var elemName = 'abilities-block';
  var thatDoc = document;
  var thisDoc = (thatDoc.currentScript || thatDoc._currentScript).ownerDocument;
  var proto = Object.create(HTMLElement.prototype, {
    createdCallback: {
      value: function() {
        var template = thisDoc.getElementById(elemName);
        var clone = thatDoc.importNode(template.content, true);
        var root = this.createShadowRoot().appendChild(clone);
      }
    },
    attachedCallback: {
      value: function() {
        var root = this.shadowRoot;
        for (var i = 0; i < this.attributes.length; i++) {
          var attribute = this.attributes[i];
          var abilityShortName = attribute.name.split('-')[1];
          root.getElementById(abilityShortName).textContent =
             abilityText(attribute.value);
        }

      }
    }
  });
  thatDoc.registerElement(elemName, {prototype: proto});
})(window, document);
</script>
	<template id="property-block">
	<style>
::content>h4 {
	display: inline;
	font-weight: bold;
	font-style: italic;
}

::content>p {
	display: inline;
}

p {
	margin-top: 0.3em;
	margin-bottom: 0.9em;
}
</style>
	<p>
		<content></content>
	</p>
	</template>
	<script>
(function(window, document) {
  var elemName = 'property-block';
  var thatDoc = document;
  var thisDoc = (thatDoc.currentScript || thatDoc._currentScript).ownerDocument;
  var proto = Object.create(HTMLElement.prototype, {
    createdCallback: {
      value: function() {
        var template = thisDoc.getElementById(elemName);
        var clone = thatDoc.importNode(template.content, true);
        this.createShadowRoot().appendChild(clone);
      }
    }
  });
  thatDoc.registerElement(elemName, {prototype: proto});
})(window, document);
</script>
	<template id="property-line">
	<style>
:host {
	color: #7A200D;
}

div {
	/* Indenting everything EXCEPT the first line. */
	text-indent: -1em;
	margin-left: 1em;
}

::content>* {
	display: inline;
}

::content>p {
	margin-left: 0.4em;
}
</style>
	<!-- Specific select expressions needed instead of just one <content>
  to avoid the original witespace between the elements.  -->
	<div>
		<content select="h4"></content>
		<content select="p"></content>
	</div>
	</template>
	<script>
(function(window, document) {
  var elemName = 'property-line';
  var thatDoc = document;
  var thisDoc = (thatDoc.currentScript || thatDoc._currentScript).ownerDocument;
  var proto = Object.create(HTMLElement.prototype, {
    createdCallback: {
      value: function() {
        var template = thisDoc.getElementById(elemName);
        var clone = thatDoc.importNode(template.content, true);
        this.createShadowRoot().appendChild(clone);
      }
    }
  });
  thatDoc.registerElement(elemName, {prototype: proto});
})(window, document);
</script>
	<template id="stat-block">
	<style>
:host {
	width: 424px;
	display: block; <!--
	float: right;
	-->
}

#content-wrap {
	font-family: 'Noto Sans', 'Myriad Pro', Calibri, Helvetica, Arial,
		sans-serif;
	font-size: 13px;
	display: block;
	background: #FDF1DC;
	padding: 0.6em;
	border: 1px #DDD solid;
	box-shadow: 0 0 1.5em #867453;
	/* We don't want the box-shadow in front of the bar divs. */
	position: relative;
	z-index: 0;
	/* Leaving room for the two bars to protrude outwards */
	margin-left: 2px;
	margin-right: 2px;
}

::content>h3 {
	border-bottom: 1px solid #7A200D;
	color: #7A200D;
	font-size: 18px;
	font-variant: small-caps;
	font-weight: normal;
	letter-spacing: 1px;
	margin: 0;
}

/* Last block shouldn't have margin, too much white space. */
::content property-block:last-child /deep/ p {
	margin-bottom: 0;
}

.bar {
	height: 5px;
	background: #E69A28;
	border: 1px solid #000;
	position: relative;
	z-index: 1;
}
</style>
	<div class="bar"></div>
	<div id="content-wrap">
		<content></content>
	</div>
	<div class="bar"></div>
	</template>
	<script>
(function(window, document) {
  var elemName = 'stat-block';
  var thatDoc = document;
  var thisDoc = (thatDoc.currentScript || thatDoc._currentScript).ownerDocument;
  var proto = Object.create(HTMLElement.prototype, {
    createdCallback: {
      value: function() {
        var template = thisDoc.getElementById(elemName);
        var clone = thatDoc.importNode(template.content, true);
        this.createShadowRoot().appendChild(clone);
      }
    }
  });
  thatDoc.registerElement(elemName, {prototype: proto});
})(window, document);
</script>
<body>
	<div data-role="page">


		<div class="card">
			<div class="image">
				<img src="${monster.picture}">
			</div>
		</div>
		<div class="card">
			<div class="content">

				<creature-heading>
				<h1>${monster.monstername}</h1>
				<h2>${monster.size} ${monster.race}, ${monster.alignment}</h2>
				</creature-heading>

				<top-stats> <property-line>
				<h4>Armor Class</h4>
				<p>${monster.armorclass}</p>
				</property-line> <property-line>
				<h4>Hit Points</h4>
				<p>${monster.hitdice}</p>
				</property-line> <property-line>
				<h4>Speed</h4>
				<p>${monster.speed}</p>
				</property-line> 
				Thing
				<stat-block data-cha=${monster.cha} data-con=${monster.con} data-dex=${monster.dex}
					data-int="1" data-str="14" data-wis="3">
				</stat-block> <property-line>
				Thing
				<h4>Damage Immunities</h4>
				<p>${monster.damageimmunities}</p>
				</property-line> <property-line>
				<h4>Condition Immunities</h4>
				<p>${monster.conditionimmunities}</p>
				</property-line> <property-line>
				<h4>Senses</h4>
				<p>${monster.senses}</p>
				</property-line> <property-line>
				<h4>Languages</h4>
				<p>${monster.languages}</p>
				</property-line> <property-line>
				<h4>Challenge</h4>
				<p>${monster.challenge}</p>
				</property-line> </top-stats>
			</div>
		</div>

		<div class="card">
			<div class="content">

			<c:forEach items="${abilities}" var="ability">    
				<property-block>
				<h4>${ability.abilityName}.</h4>
				<p>
					${ability.abilityText}
				</p>
				</property-block>
			</c:forEach>
			
			<h3>Actions</h3>
			
			<c:forEach items="${actions}" var="action">    
				<property-block>
				<h4>${action.actionName}.</h4>
				<p>
					${action.actionText}
				</p>
				</property-block>
			</c:forEach>
			</div>
		</div>
	</div>
</body>
