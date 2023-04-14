boolean isHardmode        = false
boolean isDevelopmentDone = false
boolean activateGTNAe     = false
if(isHardmode == true || isDevelopmentDone == true){ 
    boolean activateGTNAe = true
    echo("GTNAe was activated.")
} else {echo("GTNAe is inactive.")}

String hm = "hardmode"
String nm = "normalmode"
String loaded = "was loaded sucesfully."