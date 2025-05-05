document.addEventListener("DOMContentLoaded", () => {
    console.log("Página carregada!");

    // Exemplo de funcionalidade para log quando escolher tipo de imóvel
    const dropdownItems = document.querySelectorAll(".dropdown-item");

    dropdownItems.forEach(item => {
        item.addEventListener("click", function () {
            console.log(`Usuário escolheu: ${this.textContent}`);
        });
    });
});
  
/*calculo financiamento*/  
function calcular() {
    const valorEmpreendimento = parseFloat(document.getElementById('valor').value);
    const entrada = parseFloat(document.getElementById('entrada').value);
    const numeroParcelas = parseInt(document.getElementById('parcelas').value);

    if (isNaN(valorEmpreendimento) || isNaN(numeroParcelas)) {
        document.getElementById('resultado').innerText = "Por favor, preencha todos os campos obrigatórios.";
        return;
    }

    const entradaSelecionada = document.querySelector('input[name="entrada"]:checked'); // Verifica se Sim ou Não foi escolhido
    if (!entradaSelecionada) {
        document.getElementById('resultado').innerText = "Por favor, selecione se há entrada (Sim ou Não).";
        return;
    }

    const valorComissao = valorEmpreendimento * 0.06; // 6% de comissão
    let valorFinanciado;

    if (entradaSelecionada.value === "Sim") {
        if (isNaN(entrada)) {
            document.getElementById('resultado').innerText = "Por favor, informe o valor de entrada.";
            return;
        }
        valorFinanciado = valorEmpreendimento - entrada - valorComissao; // Deduz a entrada e a comissão
    } else {
        valorFinanciado = valorEmpreendimento - valorComissao; // Apenas deduz a comissão
    }

    const valorParcela = valorFinanciado / numeroParcelas; // Divide o valor financiado pelo número de parcelas

    // Exibe os resultados nos campos apropriados
    document.getElementById('comissao').value = `R$ ${valorComissao.toFixed(2)}`;
    document.getElementById('valorTotal').value = `R$ ${valorFinanciado.toFixed(2)}`;

    // Exibe mensagem de resumo
    document.getElementById('resultado').innerText = `
        Valor da Comissão (6%): R$ ${valorComissao.toFixed(2)}
        Valor Financiado: R$ ${valorFinanciado.toFixed(2)}
        Valor de cada Parcela: R$ ${valorParcela.toFixed(2)}
    `;
}
 