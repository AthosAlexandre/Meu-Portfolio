<template>
  <v-navigation-drawer v-model="abrirDrawer" class="elevation-12">
    <v-list>
      <v-list-item
          prepend-avatar="https://scontent.fcgr9-1.fna.fbcdn.net/v/t39.30808-6/356888281_6185196668225031_6838111619637752780_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=9c7eae&_nc_eui2=AeEBaTkaDzZ94HzwOrwxo4Zg2Xf1kilFBt7Zd_WSKUUG3rfnpYqilkdgBH9p0AumL1JD6YNKC6Sv_X8NxbRDr5wz&_nc_ohc=tbTFn9HZZFIAX_XXzFn&_nc_oc=AQndZFSgtoYQZOb60h-h7VRv_kMDMnblaFZa8V_2GCpHYKmOjYoGHIPthSAfvZ76WLSpmAI0-mONXApbxGHJsBzD&_nc_ht=scontent.fcgr9-1.fna&oh=00_AfDAqspo5V6CsAIMA6scOcMFLNO3saqtpbxlCAxeM_tmWA&oe=659FC5D7"
          title="Athos Alexandre"
          nav
        />
        <v-divider></v-divider>

        <v-list-item prepend-icon="mdi-home" title="Home"></v-list-item>
        <v-list-item prepend-icon="mdi-github" title="Repositorio"></v-list-item>
    </v-list>
    
  </v-navigation-drawer>
</template>

<script>
  export default {
    name: 'DefaultBar',
    data(){
      return {
        abrirDrawer: true
      }
    }
  }
</script>
