<template>
    <v-container style="padding: 10px;" class="nossa hidden d-flex justify-center align-center flex-column">
        <h2 class="text-h5" style="margin-bottom: 30px;">Filosofia & Missão</h2>
        <v-container style="border-radius: 40px;" class="d-flex flex-column flex-md-row bg-blue">
            <article class="nossa-filosofia pa-6">
                <h2 class="text-h5">Nossa Filosofia</h2>
                <p>Acreditamos que cada projeto é uma colaboração, uma simbiose entre a visão do cliente e a expertise
                    do
                    arquiteto. Cada espaço é uma tela em branco esperando para contar uma história, e nós, na Thiago
                    Arquitetura, somos os narradores dedicados desse conto.</p>
            </article>

            <article class="nossa-missao pa-6">
                <h2 class="text-h5">Nossa Missão</h2>
                <p>Nossa missão é transcender as barreiras do convencional, reinventando a arquitetura de maneira que
                    não
                    apenas encante, mas também eleve a qualidade de vida. Na Thiago Arquitetura, não construímos apenas
                    estruturas; construímos lares, locais de trabalho e espaços que ressoam com a essência e a
                    identidade de
                    quem os habita.</p>
            </article>
        </v-container>
    </v-container>
</template>

<script>
export default {
    name: 'NossaFilosofiaMissao',
    data() {
        return {

        };
    }
}
</script>

<style scoped>

.nossa{
    height: 100vh;
    border-bottom: 2px solid #030303;
    border-top: 2px solid #030303;
}

@media screen and (max-width: 600px){
    .nossa{
        height: 100%;
    }
    
}

</style>