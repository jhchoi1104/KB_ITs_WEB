<script setup>
import axios from 'axios';

const listUrl = '/api/todos';
const todoUrlPrefix = '/api/todos/';

const requestAPI = () => {
  let todoList = [];

  axios
    .get(listUrl)
    .then((response) => {
      todoList = response.data;
      console.log('TodoList : ', todoList);
      return todoList;
    })
    .then((response) => {
      console.log('todoList 첫번째 : ', response[0]);
    });

  // axios
  //   .get(listUrl)
  //   .then((response) => {
  //     todoList = response.data;
  //     console.log('# TodoList :', todoList);
  //     return todoList[0].id;
  //   })
  //   .then((id) => {
  //     return axios.get(todoUrlPrefix + id);
  //   })
  //   .then((response) => {
  //     console.log('# 첫번째 Todo ', response.data);
  //   });
};

requestAPI();
</script>

<template>
  <div>
    <h2>콘솔을 확인합니다.</h2>
  </div>
</template>
