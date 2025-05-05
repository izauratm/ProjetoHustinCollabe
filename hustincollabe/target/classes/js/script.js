document.addEventListener("DOMContentLoaded", () => {
    console.log("Página carregada!");

    // Tipo de imóvel
    const dropdownItems = document.querySelectorAll(".dropdown-item");

    dropdownItems.forEach(item => {
        item.addEventListener("click", function () {
            console.log(`Usuário escolheu: ${this.textContent}`);
        });
    });
});

/* Cálculo do financiamento */
function calcular() {
    const valorEmpreendimento = parseFloat(document.getElementById('valor').value);
    const numeroParcelas = parseInt(document.getElementById('parcelas').value);

    if (isNaN(valorEmpreendimento) || isNaN(numeroParcelas)) {
        document.getElementById('resultado').innerText = "Por favor, preencha todos os campos obrigatórios.";
        return;
    }
    const entradaSelecionada = document.querySelector('input[name="entrada"]:checked');
    if (!entradaSelecionada) {
        document.getElementById('resultado').innerText = "Por favor, selecione se há entrada (Sim ou Não).";
        return;
    }
    let valorEntrada = 0;
    if (entradaSelecionada.value === "Sim") {
        valorEntrada = parseFloat(document.getElementById('valorEntrada').value);
        if (isNaN(valorEntrada)) {
            document.getElementById('resultado').innerText = "Por favor, informe o valor de entrada.";
            return;
        }
    }
    const valorComissao = valorEmpreendimento * 0.06;
    const valorFinanciado = valorEmpreendimento - valorEntrada - valorComissao;
    const valorParcela = valorFinanciado / numeroParcelas; //calculo do valor de cada parcela

    // mostra resultados nos campos apropriados
    document.getElementById('comissao').innerText = `R$ ${valorComissao.toFixed(2)}`;
    document.getElementById('valorTotal').innerText = `R$ ${valorFinanciado.toFixed(2)}`;
    document.getElementById('valorParcela').innerText = `R$ ${valorParcela.toFixed(2)}`;

    //resumo da operação
    document.getElementById('resultado').innerText = `
        Valor da Comissão (6%): R$ ${valorComissao.toFixed(2)}
        Valor Financiado: R$ ${valorFinanciado.toFixed(2)}
        Valor de cada Parcela: R$ ${valorParcela.toFixed(2)}
    `;
}
