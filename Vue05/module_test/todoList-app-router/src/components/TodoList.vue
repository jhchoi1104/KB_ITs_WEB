<template>
  <div class="card card-body">
    <h2>존재하지 않는 경로</h2>
    <p>요청 경로: {{ currentRoute.path }}</p>
  </div>
</template>

<script setup>
import { useRoute } from 'vue-router';

currentRoute = useRoute();
</script>
