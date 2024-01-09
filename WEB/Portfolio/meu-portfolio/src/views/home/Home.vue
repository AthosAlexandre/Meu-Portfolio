<template>
  <InicioSobreMim />
  <MinhasSkills />
</template>
<script>
import InicioSobreMim from '@/components/inicio-sobre-mim/InicioSobreMim.vue'
import MinhasSkills from '@/components/minhas-skills/MinhasSkills.vue'
 export default {
   name: 'Home',
   
   data() {
     return {
       
     }
   },
   components: {
    InicioSobreMim,
    MinhasSkills
    },
 }
</script>
