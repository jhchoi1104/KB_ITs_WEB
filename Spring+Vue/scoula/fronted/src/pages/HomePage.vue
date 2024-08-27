<script setup>
import { ref } from 'vue';
import authApi from '@/api/authApi';

const email = ref('');

const getName = async () => {
  email.value = await authApi.getEmail();
};
getName();
</script>
<template>
  <h1>첫번째 페이지</h1>
  <p>{{ email }}</p>
</template>
