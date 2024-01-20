<template>
  <router-view />
  <whats />
</template>

<script>
import Whats from '@/components/botao-whatsapp/BotaoWhatsApp.vue'
import style from '@/styles/scroll.css'
export default {
  name: 'App',
  data() {
    return {

    }
  },
  components: {
    Whats

  },
  
}
//
</script>
