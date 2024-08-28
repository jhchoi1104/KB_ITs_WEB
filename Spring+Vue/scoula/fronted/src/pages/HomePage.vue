<script setup>
import { ref, reactive } from 'vue';
import authApi from '@/api/authApi';
import weatherAPI from '@/api/weatherAPI';

const email = ref('');
const weather = ref('');

const getName = async () => {
  email.value = await authApi.getEmail();
};
const getWeather = async () => {
  weather.value = await weatherAPI.getWeather();
};
getName();
getWeather();
</script>
<template>
  <h1>첫번째 페이지</h1>
  <p>{{ email }}</p>
  <p>{{ weather }}</p>
</template>
