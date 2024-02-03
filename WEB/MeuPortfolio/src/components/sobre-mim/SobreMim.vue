<template>
    <div id="sobre-mim" class="sobre-mim hidden d-flex align-center">
        <v-container class="conteiner-sobre-mim bg-grey-darken-4 w-75 rounded-xl">
            <h2 class="font-weight-regular" style="text-align: center;">Sobre Mim</h2>
            <div class="container-sobre-mim d-flex justify-space-evenly align-center flex-md-row flex-column">
                <div class="texto">
                    <p>Olá, meu nome é <span class="font-weight-bold">Athos</span>, tenho 24 anos e sou estudante de <span
                            class="font-weight-bold">Sistemas de Informação</span> na <span
                            class="font-weight-bold">UFMS</span> de Coxim-MS.</p>
                    <p>Atualmente estou no 7º semestre do curso e estou em busca de uma oportunidade de estágio para colocar
                        em prática os conhecimentos adquiridos durante o curso.</p>
                    <p>Meu objetivo é me tornar um <span class="font-weight-bold">Desenvolvedor Full Stack</span> e para
                        isso estou estudando as tecnologias mais utilizadas no mercado.</p>
                    <p>Além disso, estou sempre em busca de novos conhecimentos e me aperfeiçoando cada vez mais.</p>

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