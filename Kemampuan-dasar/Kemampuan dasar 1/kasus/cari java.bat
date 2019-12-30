@echo OFF

::Mencari File Extensi Java

IF EXIST dir *.java
	echo Ada file Java pada direktori 
	attrib /s /d *.java

pause