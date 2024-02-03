<template>
  <v-main>
    <router-view />
    <FooterBar/>
  </v-main>
</template>

<script >
import FooterBar from './FooterBar.vue';

export default {
  name: 'DefaultView',
  data() {
    return {
      
    }
  },
  components: {
    FooterBar
  },
}

  //
</script>
