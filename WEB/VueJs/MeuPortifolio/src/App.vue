<template>
  <div>
    <Cabecalho/>
    <Corp1Home/>
    <Corp2SobreMim/>
    <Corp3Projetos/>
    <Corp4Habilidadess/>
    <Corp5Experiencia/>
    <rodape/>
  </div>
</template>

<script>

import Cabecalho from './components/Cabecalho.vue';
import Corp1Home from './components/Corp1Home.vue';
import Corp2SobreMim from './components/Corp2SobreMim.vue';
import Corp3Projetos from './components/Corp3Projetos.vue';
import Corp4Habilidadess from './components/Corp4Habilidadess.vue';
import Corp5Experiencia from './components/Corp5Experiencia.vue';
import Rodape from './components/Rodape.vue';
export default {
  name:'App',
    data() {
    },
    components: { Cabecalho,
      Corp1Home,
      Corp2SobreMim,
      Corp3Projetos,
      Corp4Habilidadess,
      Corp5Experiencia,
      Rodape
    }
}
</script>