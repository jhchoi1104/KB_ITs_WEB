<script setup>
import axios from 'axios';

const requestAPI = async () => {
  const url = '/api/todos2';

  const todoList = await axios
    .get(url)
    .then((todoList) => {
      console.log('todoList', todoList);
    })
    .catch((e) => {
      console.log('에러~~~~~');
      console.log(e);
    });
};

requestAPI();
</script>
