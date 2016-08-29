function calculaTodosImcs() {
	var trsPacientes = document.getElementsByClassName("paciente");

	percorreArray(trsPacientes, imprimeEModificaTdDeImc);

	function imprimeEModificaTdDeImc(trPaciente){

	    var pacienteAtual = montaPaciente(trPaciente);    
	    var imc = pacienteAtual.pegaImc();

	    var tdImc = trPaciente.getElementsByClassName("info-imc")[0]; 
	    tdImc.textContent = imc;
	}
}


var botao = document.getElementById("calcula-imcs");
//botao.onClick = calculaTodosImcs; dessa forma posso atribuir apenas um evento
botao.addEventListener("click", calculaTodosImcs);

//imc = peso/(altura*altura)


/* ************* antes da função de monta paciente 
var trsPacientes = document.getElementsByClassName("paciente"); //array de trs

percorreArray(trsPacientes, function(trPaciente) {
	
	var tdNome = trPaciente.getElementsByClassName("info-nome")[0];
	var tdPeso = trPaciente.getElementsByClassName("info-peso")[0];
	var tdAltura = trPaciente.getElementsByClassName("info-altura")[0];

	//var pacienteAtual = {nome : tdNome.textContent, peso : tdPeso.textContent, altura: tdAltura.textContent, pegaImc : calculaIMC}; // fazendo a função ser do Paciente
	var pacienteAtual = {nome : tdNome.textContent, 
						peso : tdPeso.textContent, 
						altura: tdAltura.textContent, 
						pegaImc : function() {
							if (this.altura > 0) {
								var imc = this.peso/(this.altura*this.altura);
								return imc;
							} else console.log("altura tem que ser positiva e diferente de zero");
						}}; // Função anonima que não está no escopo global

	//calculaIMC(pacienteAtual);

	var tdImc = trPaciente.getElementsByClassName("info-imc")[0];
	tdImc.textContent = pacienteAtual.pegaImc();
});

*/


/* *********** duas formas de função só que ainda é global
function calculaIMC() {
	if (this.altura > 0) {
		var imc = this.peso/(this.altura*this.altura);
		return imc;
		
	} else console.log("altura tem que ser positiva e diferente de zero");
}


function calculaIMC(paciente) {
	if (paciente.altura > 0) {
		var imc = paciente.peso/(paciente.altura*paciente.altura);
		return imc;
		
	} else console.log("altura tem que ser positiva e diferente de zero");
}


var trsPacientes = document.getElementsByClassName("paciente"); //array de trs


for (var i = 0; i < trsPacientes.length; i++){
	var trPaciente = trsPacientes[i];
	var tdNome = trPaciente.getElementsByClassName("info-nome")[0];
	var tdPeso = trPaciente.getElementsByClassName("info-peso")[0];
	var tdAltura = trPaciente.getElementsByClassName("info-altura")[0];

	//var pacienteAtual = {nome : tdNome.textContent, peso : tdPeso.textContent, altura: tdAltura.textContent, pegaImc : calculaIMC}; // fazendo a função ser do Paciente
	var pacienteAtual = {nome : tdNome.textContent, 
						peso : tdPeso.textContent, 
						altura: tdAltura.textContent, 
						pegaImc : function() {
							if (this.altura > 0) {
								var imc = this.peso/(this.altura*this.altura);
								return imc;
							} else console.log("altura tem que ser positiva e diferente de zero");
						}}; // Função anonima que não está no escopo global

	//calculaIMC(pacienteAtual);

	var tdImc = trPaciente.getElementsByClassName("info-imc")[0];
	tdImc.textContent = pacienteAtual.pegaImc();
}
*/


/* **************** while
var tdPeso = document.getElementById("peso-1");
var tdAltura = document.getElementById("altura-1");

//Obj em js
var paciente1 = {"peso" : tdPeso.textContent, "altura" : tdAltura.textContent};

var tdPeso = document.getElementById("peso-2");
var tdAltura = document.getElementById("altura-2");
var paciente2 = {"peso" : tdPeso.textContent, "altura" : tdAltura.textContent};


var pacientes = [paciente1, paciente2];

var i = 0;
while (i < pacientes.length){
	var paciente = pacientes[i];

	if (paciente.altura > 0) {
		var imc = paciente.peso/(paciente.altura*paciente.altura);
		console.log(imc);
		tdImc = document.getElementById("imc-1");
		tdImc.textContent = imc;
	} else console.log("altura tem que ser positiva e diferente de zero");

	i++;
}
*/


/* *********** modo simples if
var peso = 59;
var altura = 1.7;

var alturaDiferenteDeZero = (altura > 0); //true or false


if (alturaDiferenteDeZero) {
	var imc = peso/(altura*altura);
	console.log(imc);
} else console.log("altura tem que ser positiva e diferente de zero");
*/