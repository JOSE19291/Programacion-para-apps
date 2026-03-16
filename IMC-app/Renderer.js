const btnCalcular = document.getElementById('btn-calcular');

btnCalcular.addEventListener('click', () => {
    // 1. Se capturan los valores
    const peso = parseFloat(document.getElementById('peso').value);
    const altura = parseFloat(document.getElementById('altura').value);

    // 2. Validación simple
    if (peso > 0 && altura > 0) {
        // 3. Aplicamos la fórmula
        const imc = peso / (altura * altura);
        
        // 4. Se muestra resultado
        document.getElementById('valor-imc').innerText = imc.toFixed(2);

        // 5. Categoría
        let categoria = "";
        if (imc < 18.5) categoria = "Bajo peso";
        else if (imc < 25) categoria = "Peso normal";
        else if (imc < 30) categoria = "Sobrepeso";
        else categoria = "Obesidad";

        document.getElementById('categoria-imc').innerText = categoria;
    } else {
        alert("Por favor, ingresa valores válidos.");
    }
});