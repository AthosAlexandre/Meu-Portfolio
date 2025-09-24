<template>
    <div id="sobre-mim" class="sobre-mim hidden d-flex align-center">
        <v-container class="conteiner-sobre-mim bg-grey-darken-4 w-75 rounded-xl">
            <h2 class="font-weight-regular" style="text-align: center;">Sobre Mim</h2>
            <div class="container-sobre-mim d-flex justify-space-evenly align-center flex-md-row flex-column">
                <div class="texto">
                    <p>Olá, meu nome é <span class="font-weight-bold">Athos</span>, tenho 26 anos e sou estudante de <span
                            class="font-weight-bold">Sistemas de Informação</span> na <span
                            class="font-weight-bold">UFMS</span> de Coxim-MS.</p>
                    <p>Atualmente estou no ultimo semestre do curso.</p>
                        <p>Trabalho como desenvolvedor web
fullstack. Tenho experiência no desenvolvimento de sistemas
em projetos acadêmicos e profissionais, utilizando ferramentas
como HTML, CSS, JavaScript, Bootstrap, React.js, Vue.js,
Firebase, Java, Spring Boot, Docker, Vuetify, Git e MySQL.
Estou sempre em busca de novas oportunidades para aprender
e aprimorar minhas habilidades na área de desenvolvimento.
                        </p>
                        <p>
                            Como desenvolvedor de software, fui da equipe responsável pela criação e
manutenção de um sistema web para provedores de internet. Responsável
pela implementação do front-end, aplicação do novo design system e
melhorias para a plataforma, utilizando React e consumindo dados de APIs
externas e internas.
                        </p>

                </div>

                <ImgCardAthosEfeito />

            </div>
        </v-container>
    </div>
</template>

<script>
import ImgCardAthosEfeito from '../img-card-athos-efeito/ImgCardAthosEfeito.vue';

export default {
    name: 'SobreMim',
    data() {
        return {

        }
    },
    components: {
        ImgCardAthosEfeito
    },
}
</script>

<style scoped>
.sobre-mim {
    height: 100vh;
    border-bottom: 1px solid #ccc;
}

.conteiner-sobre-mim {
    max-height: 90vh;
}

@media screen and (max-width: 600px) {
    .sobre-mim {
        height: 130vh;
    }

    .container-sobre-mim {
        width: 100%;
        height: 100%;
    }

    .conteiner-sobre-mim {
        max-height: 80%;
    }

}

@media screen and (max-width: 350px) {
    .sobre-mim {
        height: 190vh;
    }
}
</style>