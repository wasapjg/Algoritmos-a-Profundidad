def busqueda_secuencial(lista, elemento):
		for i in range(len(lista)):
			if lista[i] == elemento:
				return i
		return -1

lista = [1, 4, 5, 7, 2, 6, 8, 9, 0, 3]
elemento = 7

print(busqueda_secuencial(lista, elemento)) # 3