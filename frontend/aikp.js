const express = require('express');
const path = require('path');

const app = express();
const PORT = process.env.PORT || 8080;

// Serve all files in current directory
app.use(express.static(__dirname));

// Serve index.html at root
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));
});

// Example dynamic content for testing
app.get('/api/message', (req, res) => {
    res.json({ message: 'Hello from Node frontend!' });
});

app.listen(PORT, () => {
    console.log(`Frontend running at http://localhost:${PORT}`);
});
