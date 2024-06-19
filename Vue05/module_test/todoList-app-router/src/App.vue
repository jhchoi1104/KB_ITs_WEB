<script setup>
import { RouterLink, RouterView } from 'vue-router';
import Header from '@/components/Header.vue';
</script>

<template>
  <header>
    <Header></Header>
    <RouterView />
  </header>
</template>
