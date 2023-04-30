@echo off
echo Generando y Probando los Casos.
java GenerarCasos.java > CasosGenerados.txt
java Solution.java < CasosGenerados.txt > Salidas.txt
echo Finalizado.
pause

