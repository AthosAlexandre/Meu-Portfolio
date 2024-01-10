<template>
  <InicioSobreMim />
  <MinhasSkills />
  <SobreMim />
</template>
<script>
import InicioSobreMim from '@/components/inicio-sobre-mim/InicioSobreMim.vue'
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
    SobreMim
},
 }
</script>
