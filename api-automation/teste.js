fetch('https://script.google.com/macros/s/AKfycbwKdA7InU58sU5tVygP9-oC6L9_6INJCcp_ID6ZkHalfeRtyiAczgxjsXF-G1vMEz2GIw/exec', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json',
    },
    body: JSON.stringify({
        challenge_code: 'AUTOMATE123'
    }),
})

    .then((response) => {
        if (!response.ok) {
            throw new Error(`Erro ao executar a requisição: ${response.status}`);

        }
        return response.json(); //converte o response para jSON
    })

    .then((data) => console.log('Resposta:', data)) //mostra a resposta no console
    .catch((error) => console.error('Erro:', error)); //mostra o erro 