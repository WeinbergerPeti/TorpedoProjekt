uml

projekt neve: TorpedoProjekt

package: main
TorpedoProgram:main
__________________________________________________________
Torpedo								         |
--------------------------							         |
-hajoHossz: int
-palyaHossz: int
-talalatE: boolean
-probakSzamlalo: int
_______________
+palyaRajzol:void() //(megjeleníti a pályát)
+ hajoElhelyez:void() //(random elhelyezzük a pályán)
+ loves:void() //(pálya egyik mezőjére kattintva imitáljuk a lövést)

