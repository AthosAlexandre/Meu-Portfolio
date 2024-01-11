<template>
  <InicioSobreMim />
  <MinhasSkills />
  <SobreMim />
  <MeusProjetos />
</template>
<script>
import InicioSobreMim from '@/components/inicio-sobre-mim/InicioSobreMim.vue'
import MeusProjetos from '@/components/meus-projetos/MeusProjetos.vue';
import MinhasSkills from '@/components/minhas-skills/MinhasSkills.vue'
import SobreMim from '@/components/sobre-mim/SobreMim.vue';
 export default {
   name: 'Home',
   
   data() {
     return {
       
     }
   },
   components: {
    InicioSobreMim,
    MinhasSkills,
    SobreMim,
    MeusProjetos
},
 }
</script>
