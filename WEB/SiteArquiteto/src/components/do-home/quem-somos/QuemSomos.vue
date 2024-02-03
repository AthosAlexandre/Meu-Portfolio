<template>
    <section class="quem-somos">
        <v-container class="quem-somos-container">
            <v-container class="texto">
                <h1 style="text-align: center;" class="text-h4">Quem somos</h1>
                <h2 style="text-align: center;" class="text-h5">Descubra a Essência por Trás da Thiago Arquitetura</h2>
                <p style="margin-top: 10px;">Bem-vindo à Thiago Arquitetura, onde cada traço, cada espaço, conta uma
                    história
                    única. Somos mais que
                    profissionais, somos contadores de sonhos, transformando ideias em realidades arquitetônicas
                    excepcionais.</p>
            </v-container>

            <v-container class="carrossel">
                <v-carousel>
                    <v-carousel-item src="https://images4.alphacoders.com/557/557107.jpg" cover></v-carousel-item>
                    <v-carousel-item src="https://images4.alphacoders.com/287/287558.jpg" cover></v-carousel-item>
                    <v-carousel-item src="https://images7.alphacoders.com/436/436350.jpg" cover></v-carousel-item>
                </v-carousel>
            </v-container>
        </v-container>

    </section>
</template>

<script>
export default {
    name: 'QuemSomos',
    data() {

    }
}
</script>

<style scoped>

.quem-somos{
    height: 100vh;
}

.quem-somos-container{
    border-bottom: 2px solid #030303;
}

@media screen and (max-width: 900px){
    .quem-somos{
        height: 100%;
    }
}

</style>