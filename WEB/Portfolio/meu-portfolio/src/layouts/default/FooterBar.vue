<template>
  <v-footer class="bg-grey-darken-4">
    <v-row justify="center" no-gutters>
      <v-btn v-for="link in links" :key="link" color="white" variant="text" class="mx-2" rounded="xl" target="_blanck"
        :href="link.link" :to="link.to">
        {{ link.nome }}
      </v-btn>
      <v-col class="text-center mt-4" cols="12">
        <strong>Athos Alexandre</strong> - <v-icon>mdi-copyright</v-icon>
      </v-col>
    </v-row>
  </v-footer>
</template>

<script>
export default {
  name: 'FooterBar',
  data() {
    return {
      links: [
        {
          nome: 'Home',
          to: '/'
        },
        {
          nome: 'Teste',
          to: '/RotaTeste'
        },
        {
          nome: 'Repositorio',
          link: 'https://github.com/AthosAlexandre/Meu-Portfolio/tree/main'
        },
        {
          nome: 'Linkedin',
          link: 'https://www.linkedin.com/in/athos-alexandre-109199218/'
        }
      ]
    }
  },

}
</script>

<style scoped>
.texto {
  background-color: #000;
  color: #fff;
  padding: 20px;

}
</style>