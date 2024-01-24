<template>
    <div id="sobre-mim" class="sobre-mim hidden d-flex align-center" >
        <v-container class=" bg-grey-darken-4 w-75 rounded-xl">
            <h2 class="font-weight-regular" style="text-align: center;">Sobre Mim</h2>
            <div class="container-sobre-mim d-flex justify-space-evenly align-center flex-sm-row flex-column">
                <div class="texto">
                    <p>Olá, meu nome é <span class="font-weight-bold">Athos</span>, tenho 24 anos e sou estudante de <span class="font-weight-bold">Sistemas de Informação</span> na <span class="font-weight-bold">UFMS</span> de Coxim-MS.</p>
                    <p>Atualmente estou no 7º semestre do curso e estou em busca de uma oportunidade de estágio para colocar em prática os conhecimentos adquiridos durante o curso.</p>
                    <p>Meu objetivo é me tornar um <span class="font-weight-bold">Desenvolvedor Full Stack</span> e para isso estou estudando as tecnologias mais utilizadas no mercado.</p>
                    <p>Além disso, estou sempre em busca de novos conhecimentos e me aperfeiçoando cada vez mais.</p>
                    
                </div>
                <div class="imagem">
                    <v-img class="rounded-xl elevation-12 tamanho"
                        src="../../assets/img/foto_athos.jpg"
                        alt="Foto do Athos"
                    >
                    </v-img>
                </div>
            </div>
        </v-container>
    </div>
</template>

<script>
export default {
    name: 'SobreMim',
    data() {
        return {
            
        }
    },
    components: {
        
    },
}
</script>

<style scoped>
.sobre-mim{
    height: 100vh;
    border-bottom: 1px solid #ccc;
}
.tamanho{
    width: 300px;
    max-width: 100%;
}
@media screen and (max-width: 600px) {
    .sobre-mim{
        height: 120vh;
    }
    .tamanho{
        margin-top: 10px;
        width: 250px;
        max-width: 100%;
    }
    
}
</style>