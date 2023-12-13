<template>
  <v-container>
    <h2 class="center">Locar um jogo</h2>
    <main class="container-main">
      <form action="">
        <div class="container-jogo d-flex flex-column flex-sm-row justify-space-evenly">
          <v-combobox class="ma-1 w-100" label="Selecionar Console" :items="consoleNomes"
            v-model="consoleSelecionado"></v-combobox>
          <v-combobox class="ma-1 w-100" label="Jogos" :items="jogosPorConsole" v-model="jogoSelecionado"></v-combobox>
        </div>

        <div class="usuario">
          <v-combobox v-model="usuarioSelecionado" class="w-100" label="Selecione o Locador"
            :items="pegarUsario()"></v-combobox>
        </div>

        <v-btn class="w-100" @click="enviarLocacaoDeGame()" append-icon="mdi-subdirectory-arrow-right">LOCAR JOGO</v-btn>
      </form>
    </main>
  </v-container>
</template>

<script>
import axios from 'axios';

export default {
  name: 'LocadoraDeJogosView',
  data() {
    return {
      games_api: [],
      usuario: [],
      consoleNomes: ["PS5", "PS4", "PS3", "XBOXONE", "XBOX360", "PC", "NINTENDO"],
      consoleSelecionado: null,
      jogoSelecionado: null,
      usuarioSelecionado: null,
    };
  },
  computed: {
    jogosPorConsole() {
      if (!this.consoleSelecionado) {
        return [];
      }
      return this.games_api.filter((jogo) => jogo.consoles === this.consoleSelecionado).map((jogo) => jogo.nome);
    },
  },
  methods: {
    async passarApi() {
      try {
        const resposta = await axios.get('http://localhost:8080/games');
        this.games_api = resposta.data.content;
        
      } catch (erro) {
        console.log("Deu erro", erro);
      }
    },
    async usuarios() {
      try {
        const resposta = await axios.get('http://localhost:8080/usuarios');
        this.usuario = resposta.data.content;
        console.log("Deu certo dos usuarios");
        console.log(this.usuario);
      } catch (erro) {
        console.log("Deu erro", erro);
      }
    },
    pegarUsario() {
      if (Array.isArray(this.usuario)) {
        return this.usuario.map((usuario) => usuario.nome);
      } else {
        return [];
      }
    },
    async enviarLocacaoDeGame() {
      var idJogo = null;
      var idUsuario = null;

      idJogo = this.games_api.filter((jogo) => jogo.nome === this.jogoSelecionado)
        .map((jogo) => jogo.id);
      idUsuario = this.usuario.filter((usuario) => usuario.nome === this.usuarioSelecionado)
        .map((usuario) => usuario.id);

      var locado = this.games_api.filter((jogo) => jogo.nome === this.jogoSelecionado)
        .map((jogo) => jogo.locado);

      if (locado[0] === 0) {
        if ((idJogo != "") && (idUsuario != "")) {
          idJogo = parseInt(idJogo);
          idUsuario = parseInt(idUsuario);

          await axios.put('http://localhost:8080/usuarios', {
            "id": idUsuario,
            "games": { "id": idJogo }
          }).then(resposta => {
            console.log("Jogo adicionado com Sucesso" + resposta.data.value);
            this.usuarioSelecionado = null;
            this.jogoSelecionado = null;
            this.consoleSelecionado = null;
          }).catch(erro => {
            console.log("Deu erro", erro);
          });

          await axios.put('http://localhost:8080/games',{
              "id":idJogo,
              "locado":1
          }).then(resposta=>{
            console.log("Mudou o estado de locacao para locado ",resposta.data.value);
          }).catch(erro =>{
            console.log("Deu erro quando foi mudar de estado de locado ",erro.data.value);
          });
          
          setTimeout(() => {
              location.reload();
          }, 3000);

        } else {
          console.log("Campo vazio");
        }
      }else{
        console.log("Jogo já esta alugado");
      }
    },
  },
  watch: {
    consoleSelecionado: function (novoConsole) {
      // Limpar a seleção de jogo se não pertencer ao novo console
      if (this.jogoSelecionado && !this.jogosPorConsole.includes(this.jogoSelecionado)) {
        this.jogoSelecionado = null;
      }
    },
  },
  async created() {
    await this.passarApi();
    await this.usuarios();
  },
};
</script>

<style scoped>
.center {
  text-align: center;
}

main.container-main {
  width: 700px;
  max-width: 100%;
  margin: 0 auto;
  padding-top: 20px;
}
</style>
