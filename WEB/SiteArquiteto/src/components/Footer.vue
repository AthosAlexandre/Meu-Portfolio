<template>
    <div class="d-flex flex-column">
      <div class="bg-blue-darken-2 d-flex w-100 align-center px-4">
        <strong>THIAGO ARQUITETO &COPY; TODOS OS DIREITOS RESERVADOS</strong>
  
        <v-spacer></v-spacer>
  
        <v-btn
          v-for="icon in icons"
          :key="icon"
          class="mx-4"
          :icon="icon"
          variant="plain"
          size="small"
        ></v-btn>
      </div>
  
      <div class="px-4 py-2 bg-black text-center w-100">
        {{ new Date().getFullYear() }} — <strong>ATHOS SOFTWARE</strong>
      </div>
    </div>
  </template>
  <script>
    export default {
        name: 'Footer',
      data: () => ({
        icons: [
          'mdi-facebook',
          'mdi-twitter',
          'mdi-linkedin',
          'mdi-instagram',
        ],
      }),
    }
  </script>

<style scoped>

</style>