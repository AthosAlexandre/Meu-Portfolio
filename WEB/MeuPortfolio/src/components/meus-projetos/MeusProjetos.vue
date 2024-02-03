<template>
    <div class="meus-projetos hidden d-flex align-center" id="meus-projetos">
        <v-container>
            <h2 class="font-weight-regular pb-4" style="text-align: center;">Meus Projetos</h2>
            <div class="container-cards-meus-projetos">
                <v-row>
                    <v-col class="cards cards-hover" v-for="(projeto, index) in projetos" :key="index" cols="12" sm="4">
                        <v-card class="mx-auto " max-width="344">
                            <v-img :src="projeto.imagem" height="200px" cover></v-img>
                            <v-card-title>
                                {{ projeto.titulo }}
                            </v-card-title>
                            <v-card-subtitle>
                                {{ projeto.subtitulo }}
                            </v-card-subtitle>
                            <v-card-actions>
                                <v-dialog width="500">
                                    <template v-slot:activator="{ props }">
                                        <v-btn v-bind="props" color="black" prepend-icon="mdi-arrow-left-circle"
                                            variant="elevated">
                                            Ver Projeto
                                        </v-btn>
                                    </template>
                                    <template v-slot:default="{ isActive }">
                                        <v-card title="Quer ver a onde?">
                                            <v-card-actions class="d-flex justify-center">
                                                <v-btn @click="mudarDePagina(projeto.repositorio)" append-icon="mdi-github"
                                                    style="width: 150px;" text="Repositório" color="black"
                                                    variant="elevated"></v-btn>
                                                <v-btn @click="mudarDePagina(projeto.site)" style="width: 150px;"
                                                    text="Site" color="black" variant="elevated"
                                                    append-icon="mdi-page-next"></v-btn>
                                            </v-card-actions>
                                            <v-card-actions>
                                                <v-spacer></v-spacer>
                                                <v-btn icon="mdi-close-box" @click="isActive.value = false"></v-btn>
                                            </v-card-actions>
                                        </v-card>
                                    </template>
                                </v-dialog>
                                <v-spacer></v-spacer>
                                <v-btn :icon="projeto.show ? 'mdi-chevron-up' : 'mdi-chevron-down'"
                                    @click="projeto.show = !projeto.show"></v-btn>
                            </v-card-actions>
                            <v-expand-transition>
                                <div v-show="projeto.show">
                                    <v-divider></v-divider>
                                    <v-card-text>
                                        {{ projeto.descricao }}
                                    </v-card-text>
                                </div>
                            </v-expand-transition>
                        </v-card>
                    </v-col>
                </v-row>
            </div>
        </v-container>
    </div>
</template>

<script>

export default {
    name: 'MeusProjetos',
    data() {
        return {
            show: false,
            projetos: [
                {
                    id: 1,
                    titulo: 'Site de Arquiteto',
                    descricao: 'Este site está em produção ainda, mas já da para ver como está ficando. O site foi feito para um arquiteto, e está sendo feito com o intuito de mostrar os projetos do arquiteto, e também para que o cliente possa entrar em contato com o arquiteto. O site foi feito com Vue.js, Vuetify, e Firebase. O site está hospedado no Netlify. Ele vai conseguir fazer login para poder postar seus projetos.',
                    subtitulo: 'Em produção... mas já da para ver',
                    imagem: 'site_arquiteto_thiago.png',
                    show: false,
                    repositorio: 'https://github.com/AthosAlexandre/Meu-Portfolio',
                    site: 'https://thiago-arquiteto.netlify.app'
                },
                {
                    id: 2,
                    titulo: 'Novidades em breve!',
                    descricao: 'Novidades em breve!',
                    imagem: 'https://www.faculdadesesi.edu.br/wp-content/uploads/2024/01/Em-breve.jpg',
                    show: false,
                    repositorio: 'https://github.com/AthosAlexandre/Meu-Portfolio',
                    site: 'https://www.google.com.br'
                },
                {
                    id: 3,
                    titulo: 'Novidades em breve!',
                    descricao: 'Novidades em breve!',
                    imagem: 'https://www.faculdadesesi.edu.br/wp-content/uploads/2024/01/Em-breve.jpg',
                    show: false,
                    repositorio: 'https://github.com/AthosAlexandre/Meu-Portfolio',
                    site: 'https://www.google.com.br'
                },
            ]
        }
    },
    components: {

    },
    methods: {
        mudarDePagina(link) {
            window.open(link, '_blank');
        },
       
    },
    mounted() {
        
    }

}
</script>

<style scoped>
a {
    color: white;
    text-decoration: none;
    display: inline-block;
}

.meus-projetos {
    height: 100vh;
}

.cards-hover{
    transition: .2s;
}

.cards-hover:hover{
    scale: 1.1;
    transition: .5s;
}
@media screen and (max-width: 600px) {
    .meus-projetos {
        height: 170vh;
    }
}

@media screen and (max-width: 350px) {
    .meus-projetos {
        height: 230vh;
    }
}

</style>