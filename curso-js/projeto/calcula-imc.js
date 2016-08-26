//imc = peso/(altura*altura)

var peso = 59;
var altura = 1.7;

var alturaDiferenteDeZero = (altura > 0); //true or false

if (alturaDiferenteDeZero) {
	var imc = peso/(altura*altura);
	console.log(imc);
} else console.log("altura tem que ser positiva e diferente de zero");