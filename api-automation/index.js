// importar o express
const express = require('express');

//criação da aplicação
const app = express();

//permitir entender requisições com corpo JSON
app.use(express.json());

//escuta da porta 3000
const port = 3000;

// Rota POST para receber o desafio
app.post('/desafio', (req, res) => {
    const challengeCode = req.body.challenge_code; // Pegar o código do corpo da requisição
  
    // Verificar se o código foi enviado
    if (!challengeCode) {
      return res.status(400).send('Código de desafio não encontrado!');
    }
  
    // Responder com uma mensagem de sucesso
    res.send(`Código de desafio recebido: ${challengeCode}`);
  });


//inicialização do servidor
app.listen(port, () => {
    console.log(`API rodando em http://localhost:${port}`);
});