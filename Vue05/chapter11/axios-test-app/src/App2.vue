<script setup>
import axios from 'axios';

const listUrl = '/api/todos';
const todoUrlPrefix = '/api/todos/';

const requestAPI = async () => {
  let todoList;

  let response = await axios.get(listUrl);
  todoList = response.data;
  console.log('# todoList :', todoList);
};

requestAPI();
</script>
