<template>
  <div class="main">
    <Inicio />
    <QueSomos />
    <SobreThiago />
    <NossaFilosofiaMissao />
    <NossoPortfolio />
  </div>
</template>

<script>
import Inicio from '@/components/do-home/inicio/Inicio.vue';
import QueSomos from '@/components/do-home/quem-somos/QuemSomos.vue';
import NossoPortfolio from '@/components/do-home/nosso-portfolio/NossoPortfolio.vue';
import SobreThiago from '@/components/do-home/sobre-thiago/SobreThiago.vue';
import NossaFilosofiaMissao from '@/components/do-home/nossa-filosofia-missao/NossaFilosofiaMissao.vue';

export default {
  name: 'Home',
  data() {
    return {

    };
  },
  components: {
    Inicio,
    QueSomos,
    NossoPortfolio,
    SobreThiago,
    NossaFilosofiaMissao,

  },
  methods: {
    efeitoScroll() {

      const myObserver = new IntersectionObserver((entradas) => {
        entradas.forEach((entrada) => {
          if (entrada.isIntersecting) {
            entrada.target.classList.add('show');
          }else{
            entrada.target.classList.remove('show');
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

<style scoped></style>
