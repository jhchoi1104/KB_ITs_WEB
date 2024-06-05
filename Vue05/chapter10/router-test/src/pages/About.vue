<template>
  <div class="card card-body">
    <h2>About</h2>
    <p>요청 경로 : {{ $route.fullPath }}</p>
  </div>
</template>

<script setup>
import { onMounted } from 'vue';
import { useRoute } from 'vue-router';

const route = useRoute();

onMounted(() => {
  console.log(route);
});
</script>
