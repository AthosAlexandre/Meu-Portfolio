<template>
    <div>
        <v-row>
            <v-col cols="12" sm="4" v-for="(game, index) in games_api" :key="index">
                <v-card style="height: 340px;">
                    <v-img class="align-end text-white"
                        :src="game.img">
                    </v-img>

                    <v-card-subtitle class="mt-5">{{ game.nome }}</v-card-subtitle>
                    <v-card-text>
                        <div>
                            É um dos melhores jogos de todos os tempos
                        </div>
                        <div>
                            Da plataforma {{ game.consoles }}
                        </div>
                    </v-card-text>
                </v-card>
            </v-col>
        </v-row>
    </div>
</template>
    
<script>
import axios from 'axios';
export default {
    name: 'CatalogoDeJogos',
    data() {
        return {
            games_api: [],
        }
    },
    methods: {
        async passarApi() {
            try {
                const resposta = await axios.get('http://localhost:8080/games');
                this.games_api = resposta.data.content;
                console.log("Deu certo");
                console.log(this.games_api);
            } catch (erro) {
                console.log("Deu erro", erro);
            }
        }
    },
    async created() {
        await this.passarApi();
    },
}
</script>

<style scoped></style>