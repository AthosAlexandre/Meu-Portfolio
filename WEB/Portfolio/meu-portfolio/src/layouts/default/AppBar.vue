<template>
  <div>

    <v-navigation-drawer v-model="abrirDrawer" class="elevation-12">
      <v-list>
        <v-list-item
          prepend-avatar="https://scontent-gru1-2.xx.fbcdn.net/v/t39.30808-6/363312172_6278556488889048_2821519706653054295_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=9c7eae&_nc_ohc=kU8oEF7RdqMAX8esPMb&_nc_ht=scontent-gru1-2.xx&oh=00_AfAg9C5nXHfcXHTlyg_ozQjmqZOBanseJaOTQ5hC9oOxCw&oe=65B4E2A8"
          title="Athos Alexandre" nav />
        <v-divider></v-divider>
        <v-list-item prepend-icon="mdi-home" title="Home" to="/"></v-list-item>

        <v-list-group value="Navegação">
          <template v-slot:activator="{props}">
            <v-list-item v-bind:="props" prepend-icon="mdi-navigation" title="Navegação"></v-list-item>
          </template>
         
            <a href="#imagem-corpo">
              <v-list-item class="sub-item" prepend-icon="mdi-home-export-outline" title="Inicio"></v-list-item>
            </a>
          
          <a href="#minhas-skills">
            <v-list-item class="sub-item" prepend-icon="mdi-microsoft-visual-studio-code" title="Habilidades"></v-list-item>
          </a>
          <a href="#sobre-mim">
            <v-list-item class="sub-item" prepend-icon="mdi-account-circle" title="Sobre Mim"></v-list-item>
          </a>
          <a href="#meus-projetos">
            <v-list-item class="sub-item" prepend-icon="mdi-application-brackets-outline" title="Meus Projetos"></v-list-item>
          </a>
        </v-list-group>

        <v-list-item prepend-icon="mdi-github" title="Repositorio"
          href="https://github.com/AthosAlexandre/Meu-Portfolio/tree/main" target="_blank"></v-list-item>
        <v-list-item prepend-icon="mdi-linkedin" title="Linkedin"
          href="https://www.linkedin.com/in/athos-alexandre-109199218/" target="_blank"></v-list-item>
      </v-list>

    </v-navigation-drawer>

    <v-app-bar class="bg-grey-darken-4">
      <v-app-bar-nav-icon @click.stop="abrirDrawer = !abrirDrawer"></v-app-bar-nav-icon>
      <v-toolbar-title>Meu Portfolio</v-toolbar-title>
    </v-app-bar>
  </div>
</template>

<script>
export default {
  name: 'DefaultBar',
  data() {
    return {
      abrirDrawer: true,
    }
  },
  created() {
    if (window.innerWidth < 1280) {
        this.abrirDrawer = false;
      }
  },

}
</script>

<style scoped>
a{
  text-decoration: none;
  color: inherit;
}


.sub-item:hover{
  background-color: rgba(83, 83, 83, 0.147);
}
</style>