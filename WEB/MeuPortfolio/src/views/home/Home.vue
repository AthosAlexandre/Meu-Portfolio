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
methods: {
    efeitoScroll() {
      
      const myObserver = new IntersectionObserver((entradas) => {
        entradas.forEach((entrada)=>{
            if(entrada.isIntersecting){
              entrada.target.classList.add('show');
            }
        })
      });

      const elements = document.querySelectorAll('.hidden');


      elements.forEach((element) => {
        myObserver.observe(element);
      });

    }
  },
  mounted() {
    this.efeitoScroll();
  },
    
 }
</script>
