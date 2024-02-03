<template>
  <v-app>
    <router-view />
  </v-app>
  <FooterV></FooterV>
</template>

<script >
import FooterV from './components/Footer.vue';
import style from '@/styles/efeitoScroll.css'
export default {
  name: 'App',
  components: {
    FooterV
  },
  setup() {
    return {

    }
  }
}

</script>
