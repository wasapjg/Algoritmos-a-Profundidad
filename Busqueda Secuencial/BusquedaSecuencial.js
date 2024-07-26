const busquedaSecuencial = (arr, elemento) => {
	for(let i = 0; i < arr.length; i++) {
		if (arr[i] === elemento) {
		 return i
		 }
	}
	return -1
}

const lista = [1, 4, 5, 7, 2, 6, 8, 9, 0, 3]
const elemento = 7

console.log(busquedaSecuencial(lista, elemento)) // 3