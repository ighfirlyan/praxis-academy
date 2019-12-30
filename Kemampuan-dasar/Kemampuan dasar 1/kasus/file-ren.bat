@echo OFF

IF EXIST dir *.java 
	(ECHO Ada file Java pada direktori
	attrib /s /d *.java)

	ECHO nama-file.java ada,
	
	set choice=
	set /p choice=diganti namanya[Y/N]?

	IF '%CHOICE%'=='Y' (
		
		SET /p dir*.java= Masukkan nama file lama :
		SET /p dir*.txt=Masukkan nama file baru :
		
		REN dir *.java dir *.java
		)
	
	IF '%CHOICE%'=='N' (ECHO lanjutkan proses)

PAUSE