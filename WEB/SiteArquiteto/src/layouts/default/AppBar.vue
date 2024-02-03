<template>
  <v-app-bar location="top" class="elevation-10">
    <v-container class="d-flex align-center justify-space-between">
      <div class="container-img">
        <v-img src="@/assets/logo-thiago.jpeg" :height="60" :width="60"></v-img>
      </div>

      <!-- Exibe o menu regular quando a largura é maior que 800 pixels -->
      <v-list v-if="screenWidth > 900" class="d-flex" color="#9E9E9E">
        <v-list-item prepend-icon="mdi-home" title="HOME" to="/"></v-list-item>
        <v-list-item prepend-icon="mdi-home" title="ESCRITÓRIO" to="/escritorio"></v-list-item>
      </v-list>

      <!-- Ícone de hamburguer para telas menores que 800 pixels -->
      <v-app-bar-nav-icon v-else @click="drawer = !drawer"></v-app-bar-nav-icon>

      <!-- Menu lateral para telas menores que 800 pixels -->

    </v-container>
  </v-app-bar>

  <v-navigation-drawer v-model="drawer" location="right" app>
    <v-list color="#9E9E9E">
      <v-list-item prepend-icon="mdi-home" title="HOME" to="/"></v-list-item>
      <v-list-item prepend-icon="mdi-home" title="ESCRITÓRIO" to="/escritorio"></v-list-item>
    </v-list>
  </v-navigation-drawer>
</template>

<script setup>
import { ref, watch } from 'vue';

const screenWidth = ref(window.innerWidth);
const drawer = ref(false);

// Atualizar a largura da tela quando a janela for redimensionada
watch(() => {
  window.addEventListener('resize', () => {
    screenWidth.value = window.innerWidth;
  });
});

</script>

<style scoped>
/* Adicione estilos específicos, se necessário */
</style>
