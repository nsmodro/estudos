//imc = peso/(altura*altura)

var tdPeso = document.getElementById("peso-1");
var tdAltura = document.getElementById("altura-1");

//Obj em js
var paciente = {"peso" : tdPeso.textContent, "altura" : tdAltura.textContent};

var alturaDiferenteDeZero = (paciente.altura > 0); //true or false


if (alturaDiferenteDeZero) {
	var imc = paciente.peso/(paciente.altura*paciente.altura);

	tdImc = document.getElementById("imc-1");
	tdImc.textContent = imc;

	console.log(imc);
} else console.log("altura tem que ser positiva e diferente de zero");

/*
var peso = 59;
var altura = 1.7;

var alturaDiferenteDeZero = (altura > 0); //true or false


if (alturaDiferenteDeZero) {
	var imc = peso/(altura*altura);
	console.log(imc);
} else console.log("altura tem que ser positiva e diferente de zero");
*/
