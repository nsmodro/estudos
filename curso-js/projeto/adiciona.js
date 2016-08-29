var botao = document.querySelector("#adicionar-paciente");//query selector seleciona apenas o primeiro elemento da lista
botao.addEventListener("click", function(event) {
	event.preventDefault(); //impede comportamento padrão

	var campoNome = document.querySelector("#campo-nome");
	var campoPeso = document.querySelector("#campo-peso");
	var campoAltura = document.querySelector("#campo-altura");


	var pacienteNovo = "<tr class='paciente'>"+
						"<td class='info-nome'>"+campoNome.value+"</td>"+
						"<td class='info-peso'>"+campoPeso.value+"</td>"+
						"<td class='info-altura'>"+campoAltura.value+"</td>"+
						"<td class='info-imc'></td>"+
						"</tr>"

	var tabela = document.querySelector("table");
	tabela.innerHTML = tabela.innerHTML + pacienteNovo;

	campoNome.value = "";
	campoPeso.value = "";
	campoAltura.value = "";
});