<script setup>
import { ref, reactive } from 'vue';
import authApi from '@/api/authApi';
import weatherAPI from '@/api/weatherAPI';
import { useAuthStore } from '@/stores/auth';

const email = ref('');
const weather = ref('');

const auth = useAuthStore();

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
  <!-- <p>{{ email }}</p>
  <p>{{ weather }}</p> -->
  <input
    type="text"
    placeholder="종현이의 취미는?"
    id="habit"
    v-model="auth.habit"
  />
  <br />
  <button type="button" @click="auth.changeText">버튼</button> <br />
  <div v-if="auth.stateScreen">그것은 "{{ auth.habit }}"</div>
</template>
