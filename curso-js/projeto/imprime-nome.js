var trsPacientes = document.getElementsByClassName("paciente");

percorreArray(trsPacientes, imprimeNome);

function imprimeNome(trPaciente) {
	var tdNome = trPaciente.getElementsByClassName("info-nome")[0];
	var tdPeso = trPaciente.getElementsByClassName("info-peso")[0];
	var tdAltura = trPaciente.getElementsByClassName("info-altura")[0];

	var pacienteAtual = {nome : tdNome.textContent, 
						peso : tdPeso.textContent, 
						altura: tdAltura.textContent, 
						pegaImc : function() {
							if (this.altura > 0) {
								var imc = this.peso/(this.altura*this.altura);
								return imc;
							} else console.log("altura tem que ser positiva e diferente de zero");
						}};
	console.log(pacienteAtual.nome);
}


