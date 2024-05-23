const fs = require('fs');

let files = fs.readdir('./', (err, files) => {
  if (err) {
    console.error(err);
    return;
  }
  console.log(console.log(files));
});
console.log(files);
