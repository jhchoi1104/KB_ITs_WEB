<template>
  <div className="mt-5">
    <img :src="member.photo" class="img /" />
    <h4 class="mt-2">{{ member.name }}({{ member.role }})</h4>
    <p>{{ member.desc }}</p>
    <a v-if="member.insta" class="fa fa-instagram m-1" href="member.insta"></a>
    <a
      v-if="member.facebook"
      class="fa fa-facebook m-1"
      href="member.facebook"
    ></a>
    <a
      v-if="member.youtube"
      class="fa fa-youtube m-1"
      href="member.youtube"
    ></a>
    <br /><br />
    <router-link to="/members"></router-link>
  </div>
</template>

<script setup>
import { useRoute } from 'vue-router';
import members from '@/members.json';

const currentRoute = useRoute();
const id = parseInt(currentRoute.params.id, 10);
const member = members.find((m) => m.id === id);
</script>
