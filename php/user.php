<?php
print "enter plain text: ";
$x=fgets(STDIN); 		//scans input
$pt=rtrim($x,"\n\r");  //excludes linebreaks of stdin

print "enter key: ";
$y=fgets(STDIN); 		//scans input
$key=rtrim($y,"\n\r"); //excludes linebreaks of stdin

/*Conversion of string to Array*/

$ptarray=str_split($pt);
$charnum = count($ptarray);

function str_to_ascii($pt){
	$ascii = null;
	for($i=0; $i<=strlen($pt); $i++){
		$ascii += ord($pt[$i]);
		print $ascii." ";
	}
}
str_to_ascii($pt);

?>