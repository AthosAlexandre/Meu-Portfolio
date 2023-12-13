<template>
  <v-app theme="dark">
    <Navegacao />
    <v-main >
        <router-view></router-view>
    </v-main>
  </v-app>
</template>

<script>
import Navegacao from './components/Navegacao.vue';
export default {
  name:'App',
  data() {
    return {

    }
  },
  components:{
    Navegacao
  }
}

</script>

<style scoped>

</style>
