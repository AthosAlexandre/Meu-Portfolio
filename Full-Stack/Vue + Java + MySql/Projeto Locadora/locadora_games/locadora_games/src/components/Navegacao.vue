<template>
  <div>
    <v-navigation-drawer v-model="isAbrirDrawer" class="elevation-12">
      <v-list>
        <v-list-subheader>Menu</v-list-subheader>
        <v-list-item prepend-icon="mdi-home-circle" to="/home" title="Home"></v-list-item>
        <v-list-item prepend-icon="mdi-gamepad-outline" to="/locar" title="Locar Games"></v-list-item>
        <v-list-item prepend-icon="mdi-arrow-left" to="/devolucao" title="Devolução"></v-list-item>
      </v-list>
    </v-navigation-drawer>

    <v-app-bar :elevation="10">
      <v-app-bar-nav-icon @click="isAbrirDrawer = !isAbrirDrawer"></v-app-bar-nav-icon>


      <v-spacer></v-spacer>
      <v-list>
        <v-list-item prepend-icon="mdi-gamepad"></v-list-item>
      </v-list>
      <v-list>
        <v-list-item-title class="mr-4"> SOHTA LOCADORA</v-list-item-title>
      </v-list>
    </v-app-bar>

  </div>
</template>

<script>
export default {
  name: 'Navegacao',
  data() {
    return {
      isAbrirDrawer: true
    }
  }
}
</script>

<style></style>