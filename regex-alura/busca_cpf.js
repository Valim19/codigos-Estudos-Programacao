const fs = require('fs');
const bancoCSV = 'database.csv';
const banco = fs.readFileSync(bancoCSV, "utf-8");