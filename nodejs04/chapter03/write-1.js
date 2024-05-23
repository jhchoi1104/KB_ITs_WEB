fs = require('fs');

const data = fs.readFileSync('./chapter03/example.txt', 'utf8');
console.log(data);