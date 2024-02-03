<template>
    <section class="nosso-portfolio">
        <v-container>
            <h3 style="text-align: center;">Nosso Portfólio</h3>
            <p style="text-align: center;">Aqui está alguns dos nossos projetos, realizando sonhos dos nossos clientes. </p>
            <v-container>
                <section class="cards">
                    <v-row class="">
                        <v-col v-for="portfolio in nossoPortfolio" :key="portfolio.id" cols="12" sm="4" class="cards-hover" >

                            <v-card  class="mx-auto " max-width="344">
                                <v-img :src="portfolio.imagem" height="200px" cover></v-img>
                                <v-card-title>
                                    {{ portfolio.titulo }}
                                </v-card-title>
                                <v-card-subtitle>
                                    {{ portfolio.subtitulo }}
                                </v-card-subtitle>
                                <v-card-actions>
                                    <v-btn color="orange-lighten-2" variant="text">
                                        Explore
                                    </v-btn>
                                    <v-spacer></v-spacer>
                                    <v-btn :icon="portfolio.show ? 'mdi-chevron-up' : 'mdi-chevron-down'"
                                        @click="portfolio.show = !portfolio.show"></v-btn>
                                </v-card-actions>
                                <v-expand-transition>
                                    <div v-show="portfolio.show">
                                        <v-divider></v-divider>
                                        <v-card-text>
                                            {{ portfolio.descricao }}
                                        </v-card-text>
                                    </div>
                                </v-expand-transition>
                            </v-card>

                        </v-col>
                    </v-row>
                </section>
            </v-container>
        </v-container>
    </section>
</template>

<script>
export default {
    name: 'NossoPortfolio',
    data() {
        return {
            nossoPortfolio: [{
                id: 1,
                titulo: 'Sobrado em Ipanema',
                subtitulo: 'Uma casa elegante e Moderna',
                imagem: 'https://i.pinimg.com/736x/9c/6f/8a/9c6f8abcc9a12d4d19d1a7051b418c27.jpg',
                descricao: 'Nossa casa é mais que uma estrutura; é um testemunho de elegância e conforto meticulosamente entrelaçados. Cada centímetro deste sobrado foi concebido com uma visão singular: proporcionar um ambiente que transcende as expectativas.',
                show: false
            },
            {
                id: 2,
                titulo: 'Casa de Campo',
                subtitulo: 'Uma casa elegante',
                imagem: 'https://i.pinimg.com/originals/7b/60/de/7b60def5c9bedf143b96e8f8bdcd0a74.jpg',
                descricao: 'Nossa casa é mais que uma estrutura; é um testemunho de elegância e conforto meticulosamente entrelaçados. Cada centímetro deste sobrado foi concebido com uma visão singular: proporcionar um ambiente que transcende as expectativas.',
                show: false
            },
            {
                id: 3,
                titulo: 'Mansão em Beverly Hills',
                subtitulo: 'Casa de Luxo',
                imagem: 'https://conteudo.imguol.com.br/c/entretenimento/21/2021/01/13/the-one-e-anunciada-como-a-maior-mansao-do-mundo-e-podera-ser-a-mais-cara-ja-vendida-na-america-1610544079895_v2_4x3.jpg',
                descricao: 'Nossa casa é mais que uma estrutura; é um testemunho de elegância e conforto meticulosamente entrelaçados. Cada centímetro deste sobrado foi concebido com uma visão singular: proporcionar um ambiente que transcende as expectativas.',
                show: false
            },],
        }
    }
}
</script>

<style scoped>

.cards-hover{
    transition: .5s;
    

}

.cards-hover:hover{
    scale: 1.1;
    transition: .5s;
}




</style>