nf11
====

*condition vraie*

	VE
	FPOS [ 300 300 ]
	FCC [ 0 0 0 ]
	
	SI 1<2
	[
	 FCC [ 0 255 0 ]
	]
	
	AV 50


*condition fausse*

	VE
	FPOS [ 300 300 ]
	FCC [ 0 0 0 ]
	
	SI 8<2
	[
	 FCC [ 255 0 0 ]
	]
	
	AV 50
	

*alternative*

	VE
	FPOS [ 300 300 ]
	FCC [ 0 0 0 ]
	
	SI 8<2
	[
	 FCC [ 255 0 0 ]
	 AV 50
	]
	[
	 FCC [ 0 255 0 ]
	 AV 50
	]
	

*boucle repete*

	VE
	FPOS [ 300 300 ]
	FCC [ 0 0 0 ]

	REPETE 8
	[
		FCC LOOP
		AV 50
		TD 360/8
	]
	
*variable*

	VE
	FPOS [ 300 300 ]
	FCC [ 0 0 0 ]

	DONNE "nbc 3
	DONNE "lc 50

	REPETE :nbc
	[
		FCC LOOP
		AV :lc
		TD 360/:nbc
	]
	

*boucle tant que*

	VE
	FPOS [ 300 300 ]
	FCC [ 0 0 0 ]
	
	DONNE "nbc 5
	DONNE "lc 50

	DONNE "i 0
	TANTQUE :i<:nbc
	[
		FCC :i
		AV :lc
		TD 360/:nbc
		DONNE "i :i+1
	]



*fonction*
	
	POUR triangle
	 REPETE 3 [ AV 50 TD 120 ]
	FIN
	
	POUR carre :c
	 REPETE 4 [ AV :c TD 90 ]
	FIN
	
	POUR partie_cercle :l :a
	 REPETE :a
	 [
	  AV :l/90
	  TD 1
	 ]
	FIN
	
	FPOS [ 300 300 ] triangle
	FPOS [ 400 300 ] carre 75
	FPOS [ 500 300 ] partie_cercle 50 45
	
	trianglle
	carre
	carre 12 14
	partie_cercle 5 5 5
	
	
*jolie mais inutile ?*

	POUR partie_cercle :l :a
	 REPETE :a
	 [
	  AV :l/90
	  TD 1
	 ]
	FIN
	
	POUR etoile_cercle :x :y :l :c
	 DONNE "i 1
	 TANTQUE :i < 25
	 [
	  REPETE 8 
	  [
	    FPOS [ :x :y ]
	    FCC [ 0 :i*10 :i*10 ]
	    partie_cercle :l*:i 360/:c
	  ]
	  DONNE "i :i+1
	 ]
	FIN
	
	etoile_cercle 300 300 30 5
	etoile_cercle 400 300 30 3
	etoile_cercle 500 300 30 8

*procedure*

	VE
	FPOS [ 300 300 ]
	FCC [ 0 0 0 ]
	
	POUR _carre :x
	 RENDS :x*:x
	FIN
	
	AV 10
	TD 90
	AV (_carre 10)

*recursion*

	POUR factoriel :n
	 SI :n > 1 [ RENDS :n * (factoriel :n-1) ] [ RENDS 1 ]
	FIN
	
	VE
	FCC [ 0 0 0 ]
	
	DONNE "r 10
	REPETE :r
	[
	 FPOS [ 300 300 ] 
	 FCAP 360/:r*LOOP
	 AV (factoriel LOOP)
	]
	
*video*

POUR carre :c 
	LC
	AV :c/2
	TD 90
	AV :c/2
	BC
	
	REPETE 4 
	[
		TD 90
		AV :c
	]
FIN

POUR ccarre :c :n :x :y 
	REPETE :n 
	[ 
		FPOS [ :x :y ] 
		carre :c/LOOP
	]
FIN

REPETE 500
[
	VE
	LOCALE "var 20
	
	SI ((LOOP / :var) MOD 2) = 0 
	[
		FCAP 5 * (LOOP MOD :var) * (0-1)  + :var
	]
	[
		FCAP 5 * (LOOP MOD :var)
	]
	ccarre LOOP*25 50 300 300
	
	SI LOOP < 100 [ FCC [ LOOP 0 0 ] ] [  FCC [ LOOP 0 LOOP/4 ] ]
	PAUSE 40
]

*video bis*

	POUR carre :c 
		LC
		AV :c/2
		TD 90
		AV :c/2
		BC
		
		REPETE 4 
		[
			TD 90
			AV :c
		]
	FIN
	
	POUR ccarre :c :x :y 
		FPOS [ :x :y ] 
		carre :c
	FIN
	
	REPETE 500
	[
		VE
		LOCALE "var 20
		
		FCAP 5 * (LOOP MOD :var)
		ccarre 50 300 300
		
		SI LOOP < 100 [ FCC [ LOOP 0 0 ] ] [  FCC [ LOOP 0 LOOP/4 ] ]
		PAUSE 30
	]
	
	
*la totale*


POUR carre :c :x :y 
 FPOS [ :x :y ] 
 LC
 AV :c/2
 TD 90
 AV :c/2
 BC
	
 REPETE 4 
 [
  TD 90
  AV :c
 ]
FIN
	
POUR fibo :n 
 SI :n > 1 [ RENDS (fibo :n-1) + (fibo :n-2) ] [ RENDS :n ]
FIN


DONNE "x 300
DONNE "y 300
DONNE "r 30

REPETE :r
[
 LOCALE "cote LOOP/2
 carre (fibo :cote) :x :y 
]
