<script setup>
import axios from 'axios';

const requestAPI = async () => {
  const listUrl = '/api/todos';
  let data = { todo: '윗몸일으키기 3세트', desc: '너무 빠르지 않게...' };
  const todoList = await axios.post(listUrl, data);
  console.log('todoList : ', todoList.data);
  const renew = await axios.get(listUrl);
  console.log('todoList ; ', renew.data);
};

requestAPI();
</script>
