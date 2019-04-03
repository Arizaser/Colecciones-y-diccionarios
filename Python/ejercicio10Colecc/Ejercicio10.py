'''
 Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 para almacenar las parejas de palabras. El programa pedirá una palabra en
 español y dará la correspondiente traducción en inglés.
 '''

diccionarioIngles={'palabra':'word', 'lapiz':'pencil', 'coche':'car','manzana':'apple','ventana':'window',
             'cama':'bed','puerta':'door','suelo':'floor','ordenador':'computer','amarillo':'yellow'}

respuesta = (input("Introduzca la palabra que desea traducir "))

if(respuesta in diccionarioIngles):
    print(diccionarioIngles.get(respuesta))
else:
    print("Esa palabra no esta en el diccionario")