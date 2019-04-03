'''
  Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
  ArrayList y que luego calcule la suma, la media, el m�ximo y el m�nimo de
  esos n�meros. El tama�o de la lista tambi�n ser� aleatorio y podr� oscilar
  entre 10 y 20 elementos ambos inclusive.
 '''

from random import randint


lista = []

for i in range(randint(10, 20)):
    lista.append(randint(0, 100))

print(lista)
print ("Suma "+str(sum(lista)))
print ("Maximo "+str(max(lista)))
print ("Minimo "+str(min(lista)))
print ("Media "+str(sum(lista)//len(lista)))