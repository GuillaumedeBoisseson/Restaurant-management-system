<!DOCTYPE html>
<html  dir="ltr" lang="en-us" xml:lang="en-us">
<head>
    <title>UCL Moodle: Log in to the site</title>
    <link rel="shortcut icon" href="https://moodle.ucl.ac.uk/theme/image.php/ucl/theme/1476699993/favicon" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="moodle, UCL Moodle: Log in to the site" />
<link rel="stylesheet" type="text/css" href="https://moodle.ucl.ac.uk/theme/yui_combo.php?rollup/3.17.2/yui-moodlesimple-min.css" /><script id="firstthemesheet" type="text/css">/** Required in order to fix style inclusion problems in IE with YUI **/</script><link rel="stylesheet" type="text/css" href="https://moodle.ucl.ac.uk/theme/styles.php/ucl/1476699993/all" />
<script type="text/javascript">
//<![CDATA[
var M = {}; M.yui = {};
M.pageloadstarttime = new Date();
M.cfg = {"wwwroot":"https:\/\/moodle.ucl.ac.uk","sesskey":"NjH4KyZWHq","loadingicon":"https:\/\/moodle.ucl.ac.uk\/theme\/image.php\/ucl\/core\/1476699993\/i\/loading_small","themerev":"1476699993","slasharguments":1,"theme":"ucl","jsrev":"1476084028","admin":"admin","svgicons":true};var yui1ConfigFn = function(me) {if(/-skin|reset|fonts|grids|base/.test(me.name)){me.type='css';me.path=me.path.replace(/\.js/,'.css');me.path=me.path.replace(/\/yui2-skin/,'/assets/skins/sam/yui2-skin')}};
var yui2ConfigFn = function(me) {var parts=me.name.replace(/^moodle-/,'').split('-'),component=parts.shift(),module=parts[0],min='-min';if(/-(skin|core)$/.test(me.name)){parts.pop();me.type='css';min=''};if(module){var filename=parts.join('-');me.path=component+'/'+module+'/'+filename+min+'.'+me.type}else me.path=component+'/'+component+'.'+me.type};
YUI_config = {"debug":false,"base":"https:\/\/moodle.ucl.ac.uk\/lib\/yuilib\/3.17.2\/","comboBase":"https:\/\/moodle.ucl.ac.uk\/theme\/yui_combo.php?","combine":true,"filter":null,"insertBefore":"firstthemesheet","groups":{"yui2":{"base":"https:\/\/moodle.ucl.ac.uk\/lib\/yuilib\/2in3\/2.9.0\/build\/","comboBase":"https:\/\/moodle.ucl.ac.uk\/theme\/yui_combo.php?","combine":true,"ext":false,"root":"2in3\/2.9.0\/build\/","patterns":{"yui2-":{"group":"yui2","configFn":yui1ConfigFn}}},"moodle":{"name":"moodle","base":"https:\/\/moodle.ucl.ac.uk\/theme\/yui_combo.php?m\/1476084028\/","combine":true,"comboBase":"https:\/\/moodle.ucl.ac.uk\/theme\/yui_combo.php?","ext":false,"root":"m\/1476084028\/","patterns":{"moodle-":{"group":"moodle","configFn":yui2ConfigFn}},"filter":null,"modules":{"moodle-core-dragdrop":{"requires":["base","node","io","dom","dd","event-key","event-focus","moodle-core-notification"]},"moodle-core-tooltip":{"requires":["base","node","io-base","moodle-core-notification-dialogue","json-parse","widget-position","widget-position-align","event-outside","cache-base"]},"moodle-core-formchangechecker":{"requires":["base","event-focus"]},"moodle-core-checknet":{"requires":["base-base","moodle-core-notification-alert","io-base"]},"moodle-core-languninstallconfirm":{"requires":["base","node","moodle-core-notification-confirm","moodle-core-notification-alert"]},"moodle-core-actionmenu":{"requires":["base","event","node-event-simulate"]},"moodle-core-blocks":{"requires":["base","node","io","dom","dd","dd-scroll","moodle-core-dragdrop","moodle-core-notification"]},"moodle-core-notification":{"requires":["moodle-core-notification-dialogue","moodle-core-notification-alert","moodle-core-notification-confirm","moodle-core-notification-exception","moodle-core-notification-ajaxexception"]},"moodle-core-notification-dialogue":{"requires":["base","node","panel","escape","event-key","dd-plugin","moodle-core-widget-focusafterclose","moodle-core-lockscroll"]},"moodle-core-notification-alert":{"requires":["moodle-core-notification-dialogue"]},"moodle-core-notification-confirm":{"requires":["moodle-core-notification-dialogue"]},"moodle-core-notification-exception":{"requires":["moodle-core-notification-dialogue"]},"moodle-core-notification-ajaxexception":{"requires":["moodle-core-notification-dialogue"]},"moodle-core-event":{"requires":["event-custom"]},"moodle-core-popuphelp":{"requires":["moodle-core-tooltip"]},"moodle-core-maintenancemodetimer":{"requires":["base","node"]},"moodle-core-chooserdialogue":{"requires":["base","panel","moodle-core-notification"]},"moodle-core-handlebars":{"condition":{"trigger":"handlebars","when":"after"}},"moodle-core-dock":{"requires":["base","node","event-custom","event-mouseenter","event-resize","escape","moodle-core-dock-loader","moodle-core-event"]},"moodle-core-dock-loader":{"requires":["escape"]},"moodle-core-lockscroll":{"requires":["plugin","base-build"]},"moodle-core-formautosubmit":{"requires":["base","event-key"]},"moodle-core_availability-form":{"requires":["base","node","event","panel","moodle-core-notification-dialogue","json"]},"moodle-backup-confirmcancel":{"requires":["node","node-event-simulate","moodle-core-notification-confirm"]},"moodle-backup-backupselectall":{"requires":["node","event","node-event-simulate","anim"]},"moodle-calendar-info":{"requires":["base","node","event-mouseenter","event-key","overlay","moodle-calendar-info-skin"]},"moodle-course-dragdrop":{"requires":["base","node","io","dom","dd","dd-scroll","moodle-core-dragdrop","moodle-core-notification","moodle-course-coursebase","moodle-course-util"]},"moodle-course-modchooser":{"requires":["moodle-core-chooserdialogue","moodle-course-coursebase"]},"moodle-course-util":{"requires":["node"],"use":["moodle-course-util-base"],"submodules":{"moodle-course-util-base":{},"moodle-course-util-section":{"requires":["node","moodle-course-util-base"]},"moodle-course-util-cm":{"requires":["node","moodle-course-util-base"]}}},"moodle-course-toolboxes":{"requires":["node","base","event-key","node","io","moodle-course-coursebase","moodle-course-util"]},"moodle-course-formatchooser":{"requires":["base","node","node-event-simulate"]},"moodle-course-categoryexpander":{"requires":["node","event-key"]},"moodle-course-management":{"requires":["base","node","io-base","moodle-core-notification-exception","json-parse","dd-constrain","dd-proxy","dd-drop","dd-delegate","node-event-delegate"]},"moodle-form-dateselector":{"requires":["base","node","overlay","calendar"]},"moodle-form-passwordunmask":{"requires":["node","base"]},"moodle-form-shortforms":{"requires":["node","base","selector-css3","moodle-core-event"]},"moodle-form-showadvanced":{"requires":["node","base","selector-css3"]},"moodle-core_message-messenger":{"requires":["escape","handlebars","io-base","moodle-core-notification-ajaxexception","moodle-core-notification-alert","moodle-core-notification-dialogue","moodle-core-notification-exception"]},"moodle-core_message-deletemessage":{"requires":["node","event"]},"moodle-question-searchform":{"requires":["base","node"]},"moodle-question-preview":{"requires":["base","dom","event-delegate","event-key","core_question_engine"]},"moodle-question-qbankmanager":{"requires":["node","selector-css3"]},"moodle-question-chooser":{"requires":["moodle-core-chooserdialogue"]},"moodle-availability_completion-form":{"requires":["base","node","event","moodle-core_availability-form"]},"moodle-availability_date-form":{"requires":["base","node","event","io","moodle-core_availability-form"]},"moodle-availability_grade-form":{"requires":["base","node","event","moodle-core_availability-form"]},"moodle-availability_group-form":{"requires":["base","node","event","moodle-core_availability-form"]},"moodle-availability_grouping-form":{"requires":["base","node","event","moodle-core_availability-form"]},"moodle-availability_profile-form":{"requires":["base","node","event","moodle-core_availability-form"]},"moodle-qtype_ddimageortext-dd":{"requires":["node","dd","dd-drop","dd-constrain"]},"moodle-qtype_ddimageortext-form":{"requires":["moodle-qtype_ddimageortext-dd","form_filepicker"]},"moodle-qtype_ddmarker-form":{"requires":["moodle-qtype_ddmarker-dd","form_filepicker","graphics","escape"]},"moodle-qtype_ddmarker-dd":{"requires":["node","event-resize","dd","dd-drop","dd-constrain","graphics"]},"moodle-qtype_ddwtos-dd":{"requires":["node","dd","dd-drop","dd-constrain"]},"moodle-mod_assign-history":{"requires":["node","transition"]},"moodle-mod_attendance-groupfilter":{"requires":["base","node"]},"moodle-mod_forum-subscriptiontoggle":{"requires":["base-base","io-base"]},"moodle-mod_hsuforum-livelog":{"requires":["widget"]},"moodle-mod_hsuforum-io":{"requires":["base","io-base","io-form","io-upload-iframe","json-parse"]},"moodle-mod_hsuforum-article":{"requires":["base","node","event","router","core_rating","querystring","moodle-mod_hsuforum-io","moodle-mod_hsuforum-livelog","moodle-core-formchangechecker"]},"moodle-mod_quiz-dragdrop":{"requires":["base","node","io","dom","dd","dd-scroll","moodle-core-dragdrop","moodle-core-notification","moodle-mod_quiz-quizbase","moodle-mod_quiz-util-base","moodle-mod_quiz-util-page","moodle-mod_quiz-util-slot","moodle-course-util"]},"moodle-mod_quiz-quizquestionbank":{"requires":["base","event","node","io","io-form","yui-later","moodle-question-qbankmanager","moodle-core-notification-dialogue"]},"moodle-mod_quiz-randomquestion":{"requires":["base","event","node","io","moodle-core-notification-dialogue"]},"moodle-mod_quiz-autosave":{"requires":["base","node","event","event-valuechange","node-event-delegate","io-form"]},"moodle-mod_quiz-util":{"requires":["node"],"use":["moodle-mod_quiz-util-base"],"submodules":{"moodle-mod_quiz-util-base":{},"moodle-mod_quiz-util-slot":{"requires":["node","moodle-mod_quiz-util-base"]},"moodle-mod_quiz-util-page":{"requires":["node","moodle-mod_quiz-util-base"]}}},"moodle-mod_quiz-toolboxes":{"requires":["base","node","event","event-key","io","moodle-mod_quiz-quizbase","moodle-mod_quiz-util-slot","moodle-core-notification-ajaxexception"]},"moodle-mod_quiz-questionchooser":{"requires":["moodle-core-chooserdialogue","moodle-mod_quiz-util","querystring-parse"]},"moodle-mod_quiz-modform":{"requires":["base","node","event"]},"moodle-mod_quiz-repaginate":{"requires":["base","event","node","io","moodle-core-notification-dialogue"]},"moodle-mod_quiz-quizbase":{"requires":["base","node"]},"moodle-mod_scheduler-limitchoices":{"requires":["base","node","event"]},"moodle-mod_scheduler-delselected":{"requires":["base","node","event"]},"moodle-mod_scheduler-studentlist":{"requires":["base","node","event","io"]},"moodle-mod_scheduler-saveseen":{"requires":["base","node","event"]},"moodle-message_airnotifier-toolboxes":{"requires":["base","node","io"]},"moodle-filter_glossary-autolinker":{"requires":["base","node","io-base","json-parse","event-delegate","overlay","moodle-core-event","moodle-core-notification-alert","moodle-core-notification-exception","moodle-core-notification-ajaxexception"]},"moodle-filter_mathjaxloader-loader":{"requires":["moodle-core-event"]},"moodle-editor_atto-rangy":{"requires":[]},"moodle-editor_atto-editor":{"requires":["node","transition","io","overlay","escape","event","event-simulate","event-custom","node-event-html5","yui-throttle","moodle-core-notification-dialogue","moodle-core-notification-confirm","moodle-editor_atto-rangy","handlebars","timers"]},"moodle-editor_atto-plugin":{"requires":["node","base","escape","event","event-outside","handlebars","event-custom","timers","moodle-editor_atto-menu"]},"moodle-editor_atto-menu":{"requires":["moodle-core-notification-dialogue","node","event","event-custom"]},"moodle-format_grid-gridkeys":{"requires":["event-nav-keys"]},"moodle-report_eventlist-eventfilter":{"requires":["base","event","node","node-event-delegate","datatable","autocomplete","autocomplete-filters"]},"moodle-report_loglive-fetchlogs":{"requires":["base","event","node","io","node-event-delegate"]},"moodle-gradereport_grader-gradereporttable":{"requires":["base","node","event","handlebars","overlay","event-hover"]},"moodle-gradereport_history-userselector":{"requires":["escape","event-delegate","event-key","handlebars","io-base","json-parse","moodle-core-notification-dialogue"]},"moodle-tool_capability-search":{"requires":["base","node"]},"moodle-tool_lp-dragdrop-reorder":{"requires":["moodle-core-dragdrop"]},"moodle-tool_monitor-dropdown":{"requires":["base","event","node"]},"moodle-assignfeedback_editpdf-editor":{"requires":["base","event","node","io","graphics","json","event-move","event-resize","transition","querystring-stringify-simple","moodle-core-notification-dialog","moodle-core-notification-exception","moodle-core-notification-ajaxexception"]},"moodle-atto_accessibilitychecker-button":{"requires":["color-base","moodle-editor_atto-plugin"]},"moodle-atto_accessibilityhelper-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_align-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_bold-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_charmap-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_clear-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_collapse-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_emoticon-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_equation-button":{"requires":["moodle-editor_atto-plugin","moodle-core-event","io","event-valuechange","tabview","array-extras"]},"moodle-atto_helixatto-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_html-button":{"requires":["moodle-editor_atto-plugin","event-valuechange"]},"moodle-atto_htmlplus-button":{"requires":["moodle-editor_atto-plugin","moodle-atto_htmlplus-beautify","moodle-atto_htmlplus-codemirror","event-valuechange"]},"moodle-atto_htmlplus-codemirror":{"requires":["moodle-atto_htmlplus-codemirror-skin"]},"moodle-atto_htmlplus-beautify":{},"moodle-atto_image-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_imagedragdrop-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_indent-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_italic-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_link-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_managefiles-usedfiles":{"requires":["node","escape"]},"moodle-atto_managefiles-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_media-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_noautolink-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_orderedlist-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_rtl-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_strike-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_subscript-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_superscript-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_table-button":{"requires":["moodle-editor_atto-plugin","moodle-editor_atto-menu","event","event-valuechange"]},"moodle-atto_title-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_underline-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_undo-button":{"requires":["moodle-editor_atto-plugin"]},"moodle-atto_unorderedlist-button":{"requires":["moodle-editor_atto-plugin"]}}},"gallery":{"name":"gallery","base":"https:\/\/moodle.ucl.ac.uk\/lib\/yuilib\/gallery\/","combine":true,"comboBase":"https:\/\/moodle.ucl.ac.uk\/theme\/yui_combo.php?","ext":false,"root":"gallery\/1476084028\/","patterns":{"gallery-":{"group":"gallery"}}}},"modules":{"core_filepicker":{"name":"core_filepicker","fullpath":"https:\/\/moodle.ucl.ac.uk\/lib\/javascript.php\/1476084028\/repository\/filepicker.js","requires":["base","node","node-event-simulate","json","async-queue","io-base","io-upload-iframe","io-form","yui2-treeview","panel","cookie","datatable","datatable-sort","resize-plugin","dd-plugin","escape","moodle-core_filepicker"]},"core_comment":{"name":"core_comment","fullpath":"https:\/\/moodle.ucl.ac.uk\/lib\/javascript.php\/1476084028\/comment\/comment.js","requires":["base","io-base","node","json","yui2-animation","overlay"]},"mathjax":{"name":"mathjax","fullpath":"https:\/\/cdn.mathjax.org\/mathjax\/2.6-latest\/MathJax.js?delayStartupUntil=configured"}}};
M.yui.loader = {modules: {}};

//]]>
</script>

<meta name="robots" content="noindex" />    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/ucl/javascript/ucl-login-input.js"></script>
    <noscript>
			<link rel="stylesheet" type="text/css" href="https://moodle.ucl.ac.uk/theme/ucl/style/nojs.css" />
	</noscript>
    <!-- Google web fonts -->
    <link href="//fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet" type="text/css">
    <!-- iOS Homescreen Icons -->
    
<link rel="apple-touch-icon-precomposed" sizes="57x57" href="https://moodle.ucl.ac.uk/theme/image.php/ucl/theme/1476699993/homeicon/iphone" />
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="https://moodle.ucl.ac.uk/theme/image.php/ucl/theme/1476699993/homeicon/ipad" />
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="https://moodle.ucl.ac.uk/theme/image.php/ucl/theme/1476699993/homeicon/iphone_retina" />
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="https://moodle.ucl.ac.uk/theme/image.php/ucl/theme/1476699993/homeicon/ipad_retina" /></head>

<body  id="page-login-index" class="format-site  path-login safari dir-ltr lang-en_us yui-skin-sam yui3-skin-sam moodle-ucl-ac-uk pagelayout-login course-1 context-1 notloggedin two-column ucl-colours-defualt has-region-side-pre empty-region-side-pre has-region-home-left empty-region-home-left has-region-home-middle empty-region-home-middle has-region-home-right empty-region-home-right has-region-footer-left empty-region-footer-left has-region-footer-middle empty-region-footer-middle has-region-footer-right empty-region-footer-right has-region-hidden-dock used-region-hidden-dock hidden-dock-only layout-option-nonavbar">

<div class="skiplinks"><a class="skip" href="#maincontent">Skip to main content</a></div>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/yui_combo.php?rollup/3.17.2/yui-moodlesimple-min.js&amp;rollup/1476084028/mcore-min.js"></script><script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/core/jquery-1.12.1.min.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/theme_ucl/cslider_1.0.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/theme_ucl/custom_1.0.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/theme_ucl/bootstrap_plugins/alert_2.3.2.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/theme_ucl/bootstrap_plugins/carousel_2.3.2.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/theme_ucl/bootstrap_plugins/collapse_2.3.2.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/theme_ucl/bootstrap_plugins/modal_2.3.2.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/theme_ucl/bootstrap_plugins/scrollspy_2.3.2.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/theme_ucl/bootstrap_plugins/tab_2.3.2.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/theme_ucl/bootstrap_plugins/tooltip_2.3.2.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/theme_ucl/bootstrap_plugins/transition_2.3.2.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/theme_ucl/modernizr_2.6.2.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/jquery.php/theme_ucl/ba-floatingscrollbar.js"></script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/lib/javascript.php/1476084028/lib/javascript-static.js"></script>
<script type="text/javascript">
//<![CDATA[
document.body.className += ' jsenabled';
//]]>
</script>




	<header id="page-header" class="clearfix">

    <div class="container-fluid">
    
    <div class="row-fluid-small">
    	<div class="span12">
    		<h1 id="title">UCL Moodle</h1>
    		<div class="logo-background-small">
        		        		<div class="logo-small">
        			<a class="logo-link-small" href="http://www.ucl.ac.uk"></a>
        		</div>
        	</div>
    	</div>
    </div>
    
    <div class="row-fluid">
    <!-- HEADER: LOGO AREA -->
       
        <div class="span9">
            <h1 id="title">UCL Moodle</h1>
        </div> <!-- class="span9" -->
        <div class="span3">
        	<div class="logo-background">
        	        		<div class="logo">
        			<a class="logo-link" href="http://www.ucl.ac.uk"></a>
        		</div>
        	</div>
        </div>

            </div>
</header>

<header role="banner" class="navbar">
    <nav role="navigation" class="navbar-inner">
        <div class="container-fluid">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <div class="nav-collapse collapse">
                <ul class="nav"><li class="dropdown"><a href="#cm_submenu_1" class="dropdown-toggle" data-toggle="dropdown" title="Staff Help">Staff Help<b class="caret"></b></a><ul class="dropdown-menu"><li><a title="Login Problems?" href="https://wiki.ucl.ac.uk/display/MoodleResourceCentre/Moodle+Staff+FAQs#MoodleStaffFAQs-HowdoIlogin%3F "target=\"_blank">Login Problems?</a></li><li><a title="Moodle Resource Centre" href="https://wiki.ucl.ac.uk/display/MoodleResourceCentre/Guides+to+using+Moodle+for+staff" target=\"_blank "target=\"_blank">Moodle Resource Centre</a></li><li><a title="About Moodle at UCL" href="http://www.ucl.ac.uk/isd/staff/e-learning/core-tools/moodle/about "target=\"_blank">About Moodle at UCL</a></li><li><a title="FAQs" href="https://wiki.ucl.ac.uk/display/MoodleResourceCentre/Moodle+Staff+FAQs "target=\"_blank">FAQs</a></li><li><a title="Request a Moodle Course" href="http://www.ucl.ac.uk/isd-extra/staff/e-learning/tools/moodle/newcourse.php "target=\"_blank">Request a Moodle Course</a></li><li><a title="Moodle Exam Notification" href="http://www.ucl.ac.uk/isd-extra/staff/e-learning/tools/moodle/exam.php "target=\"_blank">Moodle Exam Notification</a></li><li><a title="Moodle Training" href="https://www.ucl.ac.uk/isd/services/learning-teaching/elearning-staff/training "target=\"_blank">Moodle Training</a></li><li><a title="Contact Moodle Support" href="http://www.ucl.ac.uk/isd/services/learning-teaching/elearning-staff/about/support "target=\"_blank">Contact Moodle Support</a></li><li><a title="UCL Moodle User Group" href="https://moodle.ucl.ac.uk/course/view.php?id=46">UCL Moodle User Group</a></li></ul><li class="dropdown"><a href="#cm_submenu_2" class="dropdown-toggle" data-toggle="dropdown" title="Student Help">Student Help<b class="caret"></b></a><ul class="dropdown-menu"><li><a title="Login Problems?" href="https://wiki.ucl.ac.uk/display/ELearningStudentSupport/Moodle+FAQs#MoodleFAQs-Whycan%27tIlogontoUCLMoodlewithmyUCLusernameandpassword%3F "target=\"_blank">Login Problems?</a></li><li><a title="Moodle Quick Start Guide" href="https://wiki.ucl.ac.uk/display/ELearningStudentSupport/Moodle+Quick+Start+Guide+for+Students "target=\"_blank">Moodle Quick Start Guide</a></li><li><a title="Moodle for e-Assessment" href="https://wiki.ucl.ac.uk/x/igWmAQ "target=\"_blank">Moodle for e-Assessment</a></li><li><a title="Learning with Technology" href="https://moodle.ucl.ac.uk/course/view.php?id=34285">Learning with Technology</a></li><li><a title="Plagiarism and Academic Writing" href="https://moodle.ucl.ac.uk/course/view.php?id=12731">Plagiarism and Academic Writing</a></li><li><a title="Subject area Study Skills" href="https://moodle.ucl.ac.uk/course/category.php?id=70">Subject area Study Skills</a></li><li><a title="IT training for Students" href="http://www.ucl.ac.uk/isd/students/training "target=\"_blank">IT training for Students</a></li><li><a title="FAQs" href="https://wiki.ucl.ac.uk/display/ELearningStudentSupport/Moodle+FAQs "target=\"_blank">FAQs</a></li><li><a title="Turnitin Help" href="https://wiki.ucl.ac.uk/display/ELearningStudentSupport/Turnitin "target=\"_blank">Turnitin Help</a></li><li><a title="More student links" href="http://www.ucl.ac.uk/students "target=\"_blank">More student links</a></li></ul><li class="dropdown"><a href="#cm_submenu_3" class="dropdown-toggle" data-toggle="dropdown" title="Services">Services<b class="caret"></b></a><ul class="dropdown-menu"><li><a title="Moodle Snapshot" href="https://moodle-snapshot.ucl.ac.uk/ "target=\"_blank">Moodle Snapshot</a></li><li><a title="Lynda" href="http://www.ucl.ac.uk/lynda "target=\"_blank">Lynda</a></li><li><a title="Box of Broadcasts" href="http://bobnational.net/ "target=\"_blank">Box of Broadcasts</a></li><li><a title="Portico" href="http://www.ucl.ac.uk/portico "target=\"_blank">Portico</a></li><li><a title="Common Timetable" href="http://www.ucl.ac.uk/timetable "target=\"_blank">Common Timetable</a></li><li><a title="Library" href="http://www.ucl.ac.uk/library "target=\"_blank">Library</a></li><li><a title="MyAccount" href="https://myaccount.ucl.ac.uk/ "target=\"_blank">MyAccount</a></li><li><a title="Live@UCL Email" href="http://outlook.com/live.ucl.ac.uk "target=\"_blank">Live@UCL Email</a></li><li><a title="MyPortfolio" href="https://myportfolio.ucl.ac.uk "target=\"_blank">MyPortfolio</a></li></ul></ul>                <ul class="nav pull-right">
                    <li></li>
                                    </ul>
            </div>
        </div>
    </nav>
</header>


<div id="ucllogin" class="container-fluid loggedout-1">
<div class="row-fluid">
    <div class="span6"> 
    <!-- A fluid gap -->	
    </div>
    
    <div class="span6 ">
  	<div class="loginbox-container">
    <div class="loginbox"
      <div class="loginpanel">
          
        <h2>
          You are not logged in        </h2>
          <div class="subcontent loginsub">
                        
            <!-- normal login -->
            <form action="https://moodle.ucl.ac.uk/login/index.php" method="post" id="login"  >
            	<div class="loginform">
                	<div class="form-input">
                  		<input title="Username" type="text" name="username" id="username" size="15" value="" />
                	</div>
                <div class="clearer"><!-- --></div>
                <div id="loginbtn-hover"></div>
                <div class="form-input">
                	<input type="text" name="textpassword" id="textpassword" value="Password" onfocus="pwdFocus()" />
                	<input style="display: none" type="password" name="password" id="password" size="15" value="" onblur="pwdBlur()" />
                  	<div class="forgetpass"><a href="/login/forgot_password.php">Forgotten your username or password?</a></div>
                  	<input type="submit" id="loginbtn" value="" />
    	        </div><!-- <div class="form-input"> -->
                
                <div class="clearer"><!-- --></div>
              	</div><!-- <div class="loginform"> -->
              	<div class="clearer"><!-- --></div> 
            </form>
            
            <!-- guest login --> 
            <div id='ucl-guest-login'>
    			<div id='ucl-guest-login-text'>
                        					<form id="guestlogin" method="post" action="/login/index.php">
    						<div class="guestform">
    							<input type="hidden" value="guest" name="username">
    							<input type="hidden" value="guest" name="password">
    							<input type="submit" value="Log in as a guest">
    						</div>
    					</form>
                        			</div>
    		</div>
          </div>
          </div>
         </div>
         </div>
    </div>
</div>
</div>

<!-- Start Main Regions -->
<div id="page" class="container-fluid">

<!-- Start Alerts -->

<!-- Alert #1 -->
<div class="useralerts-frame">

<!-- Alert #2 -->

<!-- Alert #3 -->
</div>
<!-- End Alerts -->

<!-- Start News Slideshow -->
        <div id="da-slider" class="da-slider news-hidden-phone" style="background-position: 8650% 0%;"> 
    	<div id="news-banner"><p>Service</br>News</p></div>

            <div class="da-slide">
                <div class="da-content"><a id="p1205947"></a><div class="forumpost clearfix firstpost starter" role="region" aria-label="Moodle Outage: 8 November 2016 by Domi Sinclair"><div class="row header clearfix"><div class="left picture"><a href="https://moodle.ucl.ac.uk/user/profile.php?id=208863"><img src="https://moodle.ucl.ac.uk/pluginfile.php/1493565/user/icon/ucl/f2?rev=33529285" alt="Picture of Domi Sinclair" title="Picture of Domi Sinclair" class="userpicture" width="35" height="35" /></a></div><div class="topic firstpost starter"><span class="subject" role="heading" aria-level="2">Moodle Outage: 8 November 2016</span><span class="author" role="heading" aria-level="2"> by <a href="https://moodle.ucl.ac.uk/user/view.php?id=208863&amp;course=1">Domi Sinclair</a> - Friday, October 21, 2016, 2:31 PM</span></div></div><div class="row maincontent clearfix"><div class="left"><div class="grouppictures">&nbsp;</div></div><div class="no-overflow"><div class="content"><div class="posting shortenedpost"><p><span>Moodle will be unavailable on Tuesday 8 November 2016 from 04:00 to 10:00 whilst we carry out a ...</span></p><a href="https://moodle.ucl.ac.uk/mod/forum/discuss.php?d=714805">Read the rest of this topic</a><div class="post-word-count">(47 words)</div></div></div></div></div><div class="row side"><div class="left">&nbsp;</div><div class="options clearfix"><div class="commands"></div></div></div></div></div>
            </div>

            <div class="da-slide">
                <div class="da-content"><a id="p484266"></a><div class="forumpost clearfix firstpost starter" role="region" aria-label="Moodle Maintenance: 8am Every Tuesday by Fiona Harkin"><div class="row header clearfix"><div class="left picture"><a href="https://moodle.ucl.ac.uk/user/profile.php?id=62631"><img src="https://moodle.ucl.ac.uk/pluginfile.php/384038/user/icon/ucl/f2?rev=38644837" alt="Picture of Fiona Harkin" title="Picture of Fiona Harkin" class="userpicture" width="35" height="35" /></a></div><div class="topic firstpost starter"><span class="subject" role="heading" aria-level="2">Moodle Maintenance: 8am Every Tuesday</span><span class="author" role="heading" aria-level="2"> by <a href="https://moodle.ucl.ac.uk/user/view.php?id=62631&amp;course=1">Fiona Harkin</a> - Wednesday, January 6, 2016, 10:30 AM</span></div></div><div class="row maincontent clearfix"><div class="left"><div class="grouppictures">&nbsp;</div></div><div class="no-overflow"><div class="content"><div class="posting shortenedpost"><p> PLEASE NOTE: Moodle should be considered unavailable between 8 am - 9 am with limited ...</p><a href="https://moodle.ucl.ac.uk/mod/forum/discuss.php?d=274131">Read the rest of this topic</a><div class="post-word-count">(69 words)</div></div></div></div></div><div class="row side"><div class="left">&nbsp;</div><div class="options clearfix"><div class="commands"></div></div></div></div></div>
            </div>

            <div class="da-slide">
                <div class="da-content"><a id="p921623"></a><div class="forumpost clearfix firstpost starter" role="region" aria-label="Getting help from the Digital Education Team by Domi Sinclair"><div class="row header clearfix"><div class="left picture"><a href="https://moodle.ucl.ac.uk/user/profile.php?id=208863"><img src="https://moodle.ucl.ac.uk/pluginfile.php/1493565/user/icon/ucl/f2?rev=33529285" alt="Picture of Domi Sinclair" title="Picture of Domi Sinclair" class="userpicture" width="35" height="35" /></a></div><div class="topic firstpost starter"><span class="subject" role="heading" aria-level="2">Getting help from the Digital Education Team</span><span class="author" role="heading" aria-level="2"> by <a href="https://moodle.ucl.ac.uk/user/view.php?id=208863&amp;course=1">Domi Sinclair</a> - Wednesday, January 6, 2016, 10:28 AM</span></div></div><div class="row maincontent clearfix"><div class="left"><div class="grouppictures">&nbsp;</div></div><div class="no-overflow"><div class="content"><div class="posting shortenedpost"><p>There are many ways you can get help from Digital Education (formerly E-Learning Environments).</p>
...<a href="https://moodle.ucl.ac.uk/mod/forum/discuss.php?d=551425">Read the rest of this topic</a><div class="post-word-count">(153 words)</div></div></div></div></div><div class="row side"><div class="left">&nbsp;</div><div class="options clearfix"><div class="commands"></div></div></div></div></div>
            </div>
        
            <nav class="da-arrows">
                <span class="da-arrows-prev"></span>
                <span class="da-arrows-next"></span>
            </nav>
            
        </div>
        
<!-- End News Slideshow -->

<!-- Start Frontpage Content -->
<!-- End Frontpage Content -->

<hr class="divider"/>

<!-- Start Marketing Spots -->
	<h1 id='marketing-spots-heading'>UCL News</h1>


<div class="row-fluid marketing" id="middle-blocks">
    
    <div class="span3">
        <!-- Advert #1 -->
        <div class="service lines-left-right">
            <!-- Icon & title -->
                        	<div class="marketing-image1-container">
            		<p class="flag">Digital Education YouTube</p>
            		<img class="marketing-image1" src="//moodle.ucl.ac.uk/pluginfile.php/1/theme_ucl/marketing1image/1476699993/hands-1167621_1920.jpg" />
            	</div>
            	        
            <p>Did you know you can find the Digital Education team on YouTube?</p>
<p>We have all sorts of videos from our <a href="https://www.youtube.com/playlist?list=PLzpwcAEdfawIeqwmLPNwp3afyzRj-5X7v">monthly vlog</a>, to <a href="https://www.youtube.com/playlist?list=PLzpwcAEdfawIRYj2RAhjyWcBkJnQmkMX-">ABC Curriculum Design</a> and more.</p>
<p>You can <a href="https://www.youtube.com/channel/UCskdaAhAHHUTYRnYnAUKvOA">subscribe to our channel</a> to make sure you never miss any content we add. </p>            
                    </div>
    </div>
    
    <div class="span3">
        <!-- Advert #2 -->
        <div class="service lines-left-right">
            <!-- Icon & title. -->
                        	<div class="marketing-image2-container">
            		<p class="flag">UCL Student Student Support and Wellbeing Blog</p>
            		<img class="marketing-image2" src="//moodle.ucl.ac.uk/pluginfile.php/1/theme_ucl/marketing2image/1476699993/portico.jpg" />
            	</div>
                        
            
            <p>Weekly articles by professionals, staff and students supporting a healthy, happy and balanced student life, covering topics such as:</p>
<ul>
<li>Healthy recipes</li>
<li>Tech to help you study</li>
<li>Looking after your mental wellbeing</li>
<li>Support available at UCL</li>
<li>Living with flatmates</li>
<li>And so much more!</li>
</ul>
<p><a href="https://www.ucl.ac.uk/current-students/support/ssw-blog" title="UCL Student Support and Wellbeing Blog">Student Support and Wellbeing Blog.</a></p>
<p></p>            
            	
        </div>
    </div>
    
    <div class="span3">
        <!-- Advert #3 -->
        <div class="service lines-left-right">
            <!-- Icon & title. -->
                        	<div class="marketing-image3-container">
            		<p class="flag">Moodle Summer Upgrade</p>
            		<img class="marketing-image3" src="//moodle.ucl.ac.uk/pluginfile.php/1/theme_ucl/marketing3image/1476699993/summer_front_2016.png" />
            	</div>
                        
                        
            <p>The annual Moodle Summer Upgrade and Snapshot has been completed.</p>
<p><a href="https://wiki.ucl.ac.uk/display/MoodleResourceCentre/Moodle+3.1+-+Summer+2016+upgrade">Read about the new features available...</a></p>            
            	
        </div>
    </div>

    <div class="span3">
        <!-- Advert #4 -->
        <div class="service lines-left-right">
            <!-- Icon & title. -->
                        	<div class="marketing-image4-container">
            		<p class="flag">Getting help with Moodle</p>
            		<img class="marketing-image4" src="//moodle.ucl.ac.uk/pluginfile.php/1/theme_ucl/marketing4image/1476699993/keyboard-824317_1920.jpg" />
            	</div>
                        
            
            <p></p>
<p><strong style="line-height: 1.5;">Students</strong></p>
<p></p>
<ul>
<li><span style="line-height: 1.5;">Visit the </span><a href="https://wiki.ucl.ac.uk/display/ELearningStudentSupport/" style="line-height: 1.5;">Student E-Learning wiki</a><span style="line-height: 1.5;">.</span></li>
<li><span style="color: #333333; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif, 'Helvetica Neue'; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 21px; orphans: auto; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; display: inline !important; float: none;">Raise issues with your tutor or course administrator first, as they can normally help.</span></li>
</ul>
<p></p>
<p><strong>Staff</strong></p>
<p></p>
<ul>
<li><span style="line-height: 1.5;"><span style="color: #333333; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif, 'Helvetica Neue'; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; orphans: auto; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; line-height: 1.5;">Staff should refer to the </span><a href="https://wiki.ucl.ac.uk/display/MoodleResourceCentre" style="color: #0070a8; text-decoration: none; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif, 'Helvetica Neue'; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; orphans: auto; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; line-height: 1.5;">Moodle Resource Centre</a><span style="color: #333333; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif, 'Helvetica Neue'; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; orphans: auto; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; line-height: 1.5;">.</span><br /></span></li>
<li><span style="line-height: 1.5;">Raise a ticket in the <a title="Raise a ticket with ELE" href="https://www.ucl.ac.uk/isd/services/learning-teaching/elearning-staff/about/support" style="color: #0070a8; text-decoration: none; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif, 'Helvetica Neue'; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; orphans: auto; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; line-height: 1.5;">UCL support system</a><span style="color: #333333; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif, 'Helvetica Neue'; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; orphans: auto; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 1; word-spacing: 0px; -webkit-text-stroke-width: 0px; line-height: 1.5;"> </span>or call</span><span style="line-height: 1.5;"> the ISD Service Desk on </span><strong style="line-height: 1.5;">020 7679 5000</strong><span style="line-height: 1.5;"> (internal </span><strong style="line-height: 1.5;">25000</strong><span style="line-height: 1.5;">).</span></li>
</ul>
<p></p>
<p></p>
<p></p>            
            	
        </div>
    </div>
    
</div>

<hr class="divider" />
<!-- End Marketing Spots -->

<!-- Start Middle Blocks -->

<div class="row-fluid" id="middle-blocks">
    <aside id="block-region-home-left" class="span4 block-region" data-blockregion="home-left" data-droptarget="1"></aside><aside id="block-region-home-middle" class="span4 block-region" data-blockregion="home-middle" data-droptarget="1"></aside><aside id="block-region-home-right" class="span4 block-region" data-blockregion="home-right" data-droptarget="1"></aside></div><!-- End Middle Blocks -->

    <div id="page-content" class="row-fluid">
    	        <section id="region-main" class="span8 pull-right">
                	<div id="page-navbar" class="clearfix">
            	<div class="breadcrumb-nav"><span class="accesshide">Page path</span><ul class="breadcrumb"><li><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a itemprop="url" href="https://moodle.ucl.ac.uk/"><span itemprop="title">UCL Moodle</span></a></span> <span class="divider"> <span class="accesshide " ><span class="arrow_text">/</span>&nbsp;</span><span class="arrow sep">&#x25BA;</span> </span></li><li><span tabindex="0">Log in to the site</span></li></ul></div>
            	<nav class="breadcrumb-button"></nav>
        	</div>
            <span class="notifications" id="user-notifications"></span><div role="main"><span id="maincontent"></span><div class="loginbox clearfix onecolumn">
  <div class="loginpanel">
    <h2>Log in</h2>
      <div class="subcontent loginsub">
                <form action="https://moodle.ucl.ac.uk/login/index.php" method="post" id="login"  >
          <div class="loginform">
            <div class="form-label"><label for="username">Username</label></div>
            <div class="form-input">
              <input type="text" name="username" id="username" size="15" value="" />
            </div>
            <div class="clearer"><!-- --></div>
            <div class="form-label"><label for="password">Password</label></div>
            <div class="form-input">
              <input type="password" name="password" id="password" size="15" value=""  />
            </div>
          </div>
            <div class="clearer"><!-- --></div>
                        <div class="clearer"><!-- --></div>
          <input id="anchor" type="hidden" name="anchor" value="" />
          <script>document.getElementById('anchor').value = location.hash</script>
          <input type="submit" id="loginbtn" value="Log in" />
          <div class="forgetpass"><a href="forgot_password.php">Forgotten your username or password?</a></div>
        </form>
        <div class="desc">
            Cookies must be enabled in your browser<span class="helptooltip"><a href="https://moodle.ucl.ac.uk/help.php?component=moodle&amp;identifier=cookiesenabled&amp;lang=en_us" title="Help with Cookies must be enabled in your browser" aria-haspopup="true" target="_blank"><img src="https://moodle.ucl.ac.uk/theme/image.php/ucl/core/1476699993/help" alt="Help with Cookies must be enabled in your browser" class="iconhelp" /></a></span>        </div>
      </div>

      <div class="subcontent guestsub">
        <div class="desc">
          Some courses may allow guest access        </div>
        <form action="index.php" method="post" id="guestlogin">
          <div class="guestform">
            <input type="hidden" name="username" value="guest" />
            <input type="hidden" name="password" value="guest" />
            <input type="submit" value="Log in as a guest" />
          </div>
        </form>
      </div>
     </div>
</div>
</div>        </section>
        <aside id="block-region-side-pre" class="span4 desktop-first-column block-region" data-blockregion="side-pre" data-droptarget="1"></aside>    </div>
    
    <!-- End Main Regions -->

    	
	

<p class="helplink"></p>
<footer id="page-footer" class="wrapper container-fluid clearfix">

		
	<article class="block-myucl">
		<h2>Facilities</h2>
		<ul>
			<li><a href="http://www.ucl.ac.uk/departments/faculties">Faculties and departments</a></li>
			<li><a href="http://www.ucl.ac.uk/library/">Library</a></li>
			<li><a href="http://www.ucl.ac.uk/museums">Museums and Collections</a></li>
			<li><a href="http://www.thebloomsbury.com/">UCL Bloomsbury Theatre</a></li>
			<li><a href="http://www.ucl.ac.uk/maps">Maps and buildings</a></li>
		</ul>
	</article>

	<article class="block-finditfast1">
		<h2>Locations</h2>
		<ul>
			<li><a href="http://www.ucl.ac.uk/london">UCL and London</a></li>
			<li><a href="http://www.ucl.ac.uk/australia#">UCL Australia</a></li>
			<li><a href="http://www.ucl.ac.uk/qatar">UCL Qatar</a></li>
		</ul>
	</article>

	<article class="block-finditfast2">
		<h2>Connect with us</h2>
		<ul>
			<li><a href="http://www.ucl.ac.uk/alumni">Alumni</a></li>
			<li><a href="http://www.ucl.ac.uk/enterprise">Businesses</a></li>
			<li><a href="http://www.ucl.ac.uk/media">Media Relations</a></li>
			<li><a href="http://www.ucl.ac.uk/hr/jobs/">Jobs</a></li>
			<li><a href="http://www.ucl.ac.uk/makeyourmark">Support us</a></li>
		</ul>

	</article>

	<hr>

	<p>University College London,&nbsp;Gower Street,&nbsp;London,&nbsp;WC1E 6BT&nbsp;Tel:&nbsp;+44&nbsp;(0)&nbsp;20 7679 2000</p>

	<p id="footer-links">Copyright &copy; 2013 UCL <a href="http://www.ucl.ac.uk/disclaimer">Disclaimer</a> | <a href="http://www.ucl.ac.uk/foi">Freedom of Information</a> | <a href="http://www.ucl.ac.uk/accessibility">Accessibility</a> | <a href="http://www.ucl.ac.uk/privacy">Privacy</a> | <a href="http://www.ucl.ac.uk/cookies">Cookies</a> | <a href="http://www.ucl.ac.uk/contact-list">Contact Us</a></p>

	<div class="usepolicy"><a href="//moodle.ucl.ac.uk/pluginfile.php/1/theme_ucl/usepolicy/1476699993/UCL_Moodle_usage_policy.html" target="_blank">UCL Moodle usage policy and guidelines</a></div>
	<div class="moodlepower">Powered by: Moodle 3.1</div>
	
</footer>
    <script type="text/javascript">
//<![CDATA[
var require = {
    baseUrl : 'https://moodle.ucl.ac.uk/lib/requirejs.php/1476084028/',
    // We only support AMD modules with an explicit define() statement.
    enforceDefine: true,
    skipDataMain: true,

    paths: {
        jquery: 'https://moodle.ucl.ac.uk/lib/javascript.php/1476084028/lib/jquery/jquery-1.12.1.min',
        jqueryui: 'https://moodle.ucl.ac.uk/lib/javascript.php/1476084028/lib/jquery/ui-1.11.4/jquery-ui.min',
        jqueryprivate: 'https://moodle.ucl.ac.uk/lib/javascript.php/1476084028/lib/requirejs/jquery-private'
    },

    // Custom jquery config map.
    map: {
      // '*' means all modules will get 'jqueryprivate'
      // for their 'jquery' dependency.
      '*': { jquery: 'jqueryprivate' },

      // 'jquery-private' wants the real jQuery module
      // though. If this line was not here, there would
      // be an unresolvable cyclic dependency.
      jqueryprivate: { jquery: 'jquery' }
    }
};

//]]>
</script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/lib/javascript.php/1476084028/lib/requirejs/require.min.js"></script>
<script type="text/javascript">
//<![CDATA[
require(['core/first'], function() {
;
require(["block_navigation/navblock"], function(amd) { amd.init("321033"); });;
require(["block_settings/settingsblock"], function(amd) { amd.init("321036", null); });;
require(["core/log"], function(amd) { amd.setConfig({"level":"warn"}); });
});
//]]>
</script>
<script type="text/javascript" src="https://moodle.ucl.ac.uk/theme/javascript.php/ucl/1476699993/footer"></script>
<script type="text/javascript">
//<![CDATA[
M.str = {"moodle":{"lastmodified":"Last modified","name":"Name","error":"Error","info":"Information","yes":"Yes","no":"No","viewallcourses":"View all courses","ok":"OK","morehelp":"More help","loadinghelp":"Loading...","cancel":"Cancel","confirm":"Confirm","areyousure":"Are you sure?","closebuttontitle":"Close","unknownerror":"Unknown error"},"repository":{"type":"Type","size":"Size","invalidjson":"Invalid JSON string","nofilesattached":"No files attached","filepicker":"File picker","logout":"Logout","nofilesavailable":"No files available","norepositoriesavailable":"Sorry, none of your current repositories can return files in the required format.","fileexistsdialogheader":"File exists","fileexistsdialog_editor":"A file with that name has already been attached to the text you are editing.","fileexistsdialog_filemanager":"A file with that name has already been attached","renameto":"Rename to \"{$a}\"","referencesexist":"There are {$a} alias\/shortcut files that use this file as their source","select":"Select"},"admin":{"confirmdeletecomments":"You are about to delete comments, are you sure?","confirmation":"Confirmation"}};
//]]>
</script>
<script type="text/javascript">
//<![CDATA[
(function() {M.util.load_flowplayer();
setTimeout("fix_column_widths()", 20);
Y.use("moodle-filter_glossary-autolinker",function() {M.filter_glossary.init_filter_autolinking({"courseid":0});
});
Y.use("moodle-filter_mathjaxloader-loader",function() {M.filter_mathjaxloader.configure({"mathjaxconfig":"MathJax.Hub.Config({\r\n    config: [\"Accessible.js\", \"Safe.js\"],\r\n    errorSettings: { message: [\"!\"] },\r\n    skipStartupTypeset: true,\r\n    messageStyle: \"none\"\r\n});\r\n","lang":"en"});
});
M.util.help_popups.setup(Y);
Y.use("moodle-core-popuphelp",function() {M.core.init_popuphelp();
});
M.util.init_skiplink(Y);
 M.util.js_pending('random580b7576c25483'); Y.on('domready', function() { M.util.js_complete("init");  M.util.js_complete('random580b7576c25483'); });
})();
//]]>
</script>

</div>

<!-- Start Google Analytics -->
	<script type="text/javascript">
	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
	(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
	m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
	})(window,document,'script','//www.google-analytics.com/analytics.js','ga');


	ga('create', 'UA-4551567-2', 
	{
		'cookieDomain': 'moodle.ucl.ac.uk',
		'cookieExpires': '10800'
	});
			ga('send', 'pageview' );

	</script><!-- End Google Analytics -->

<script type="text/javascript">
jQuery(document).ready(function() {
    var offset = 220;
    var duration = 500;
    jQuery(window).scroll(function() {
        if (jQuery(this).scrollTop() > offset) {
            jQuery('.back-to-top').fadeIn(duration);
        } else {
            jQuery('.back-to-top').fadeOut(duration);
        }
    });
    
    jQuery('.back-to-top').click(function(event) {
        event.preventDefault();
        jQuery('html, body').animate({scrollTop: 0}, duration);
        return false;
    })
});
</script>

</body>
</html>
