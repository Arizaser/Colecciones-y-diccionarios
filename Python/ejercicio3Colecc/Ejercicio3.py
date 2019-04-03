'''
 Escribe un programa que ordene 10 n�meros enteros introducidos por teclado y
 almacenados en un objeto de la clase ArrayList.
 '''

lista = []

for i in range (10):
    lista.append(int(input("Introduzca un numero a la lista ")))

print("lista sin ordenar:")
print(lista)

lista.sort()
print("lista ordenada:")
print(lista)