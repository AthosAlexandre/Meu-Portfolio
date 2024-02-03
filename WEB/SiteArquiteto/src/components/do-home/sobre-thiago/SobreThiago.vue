<template>
    <v-container class="sobre-thiago d-flex align-center">
        <v-container class="article d-flex align-center">
            <article class="article-sobre-mim">
                <h2 class="text-h5">Nosso Arquiteto, Thiago</h2>
                <p>Thiago é mais que um nome, é uma marca de excelência em design arquitetônico. Com uma paixão
                    incansável por
                    criar espaços que inspiram, ele traz consigo anos de experiência e uma visão única. Sua abordagem
                    personalizada e atenção aos detalhes garantem que cada projeto seja uma expressão autêntica da
                    individualidade e aspirações de nossos clientes.</p>
            </article>

            <ImgCardThiagoEfeito/>

        </v-container>
    </v-container>
</template>

<script>
import ImgCardThiagoEfeito from '@/components/img-card-thiago-efeito/ImgCardThiagoEfeito.vue';

export default {
    name: 'SobreThiago',
    data() {
        return {};
    },
    components: { ImgCardThiagoEfeito }
}
</script>

<style scoped>
.sobre-thiago {
    height: 100vh;
}

.article-sobre-mim {
    max-width: 60%;
    margin-right: 20px;
}

@media screen and (max-width: 900px) {
    .article {
        flex-direction: column;
    }

    .article .article-sobre-mim {
        max-width: 100%;
        margin-bottom: 25px;
    }

}

@media screen and (max-width: 600px){
    .sobre-thiago {
    height: 100%;
}
}

</style>