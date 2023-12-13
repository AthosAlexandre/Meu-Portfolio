<template >
   <div class="d-flex flex-column justify-center align-center imagem-fundo">
     <h1 class="text-center font-weight-regular sobre-foto-overlay">Aqui está o melhores jogos da atualidade para ser locado</h1>

     <h2 class="text-center font-weight-regular sobre-foto-overlay">Aqui está o melhores jogos da atualidade para ser locado</h2>
   </div>

   <v-container class="mt-5">
    <h2 class="text-center font-weight-regular mb-5">Nossos jogos</h2>
    <CatalogoDeJogos></CatalogoDeJogos>
   </v-container>
</template>

<script>
import CatalogoDeJogos from '@/components/CatalogoDeJogos.vue'
export default {
  name: 'home',
  data() {
    return {
    
    }
  },
  components:{
    CatalogoDeJogos
  },
  methods: {
    
  },
   created() {
  
  },
}
</script>

<style scoped>
  .imagem-fundo{
  position: relative; /* Adicione essa linha para posicionamento relativo */
  max-width: 100%;
  width: 100%;
  height: 60vh;
  background-image: url('https://kanto.legiaodosherois.com.br/w760-h398-gnw-cfill-q95/wp-content/uploads/2019/11/legiao_a0RM4jslYHoUbwBvgzX6CSdk1VhDQ_5yqJ8xe9pZiL.png.webp');
  background-position: center;
  background-size: cover;
  }

  .imagem-fundo::before {
  content: '';
  background: rgba(0, 0, 0, 0.685); /* Cor de fundo com transparência */
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
}
  
.sobre-foto-overlay{
  z-index: 0;
}
</style>
