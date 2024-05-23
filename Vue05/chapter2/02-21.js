const p = new Promise((resolve, err) => {
  setTimeout(() => {
    let num = Math.random();
    if (num >= 0.8) {
      err(`생성된 숫자가 0.8이상임 - ${num}`);
    }
    resolve(`처리 결과: ${num}`);
  }, 2000);
});

p.then((result) => {
  console.log('처리 결과: ', result);
}).catch((err) => {
  console.log('오류 : ', err);
});

console.log('## Promise 객체 생성!');
