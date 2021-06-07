Algoritmo Ejercicio13
	opciones=0
	Mientras opciones<>3 Hacer
		Escribir "Opciones que se pueden realizar"
		Escribir "1.Sumar, 2.Dividir, 3.Salir"
		Escribir "Ingrese el numero de la  opcion que desea realizar"
		Leer opciones
		si opciones=1 Entonces
			Escribir "Ingrese el primer numero"
			Leer num1
			Escribir "Ingrese el segundo numero"
			Leer num2
			suma=num1+num2
			Escribir "La suma es: " suma
		sino si opciones=2 Entonces
				Escribir "ingrese el dividendo"
				Leer dividendo
				Escribir "Ingrese el divisior"
				Leer divisor
				si divisor=0 Entonces
					Escribir "No es posible divir dentro de 0"
				sino
					division=dividendo/divisor
					Escribir "La division es: " division
				FinSi
			SiNo
				Escribir "-----Adios------"
			FinSi
		FinSi
	FinMientras
	
FinAlgoritmo
