<template>
    <v-footer class="bg-grey-darken-4" >
    <v-row justify="center" no-gutters>
      <v-btn
        v-for="link in links"
        :key="link"
        color="white"
        variant="text"
        class="mx-2"
        rounded="xl"
      >
        {{ link }}
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
        'Home',
        'Teste',
        'Repositorio',
        'Linkedin'
      ]
        }
    },
    
}
</script>

<style scoped>
    .texto{
        background-color: #000;
        color: #fff;
        padding: 20px;
        
    }
</style>