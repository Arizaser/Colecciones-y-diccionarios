'''
 Realiza un programa que escoja al azar 5 palabras en español del
 minidiccionario del ejercicio anterior. El programa irá pidiendo que el
 usuario teclee la traducción al inglés de cada una de las palabras y
 comprobará si son correctas. Al final, el programa deberá mostrar cuántas
 respuestas son válidas y cuántas erróneas.
 '''


import random

cont=0
lista = []
listaPalabras = []
diccionarioIngles={'palabra':'word', 'lapiz':'pencil', 'coche':'car','manzana':'apple','ventana':'window',
             'cama':'bed','puerta':'door','suelo':'floor','ordenador':'computer','amarillo':'yellow'}

for i in diccionarioIngles:
    lista.append(i)

random.shuffle(lista)

for i in range(5):
    listaPalabras.append(lista.pop(0))

for i in listaPalabras:
    a = input("Dime la traduccion de la palabra: "+ i + "\n")
    if(a==diccionarioIngles.get(i)):
        print("Correcto")
        cont=cont+1
    else:
        print("Incorrecto")

print("Has acertado ",cont,"/5 palabras")
