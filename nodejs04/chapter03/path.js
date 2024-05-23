const path = require('path');

const fullPath = path.join('some', 'work', 'ex.txt');
console.log(fullPath);

console.log(`파일 절대 경로: ${__filename}`);

const dir = path.dirname(__filename);
console.log(`경로만 ${dir}`);

console.log(path.basename(__filename));
console.log(path.basename(__filename, '.js'));
console.log(path.extname(__filename));
console.log(path.parse(__filename));
