<template>
 <section class="sessao-habilidades" id="habilidades" data-aos="fade-right">
                <h2>Habilidades</h2>
            <div class="container-habilidades">
                
                <div class="container-logos">

                    <div v-for="habilidade in this.habilidades" :key="habilidade.id"
                     @mouseover="getDadosDaTecnologia(habilidade.descricao, habilidade.linguagem, habilidade.exp)"
                     @mouseout="resetDadosDaDescricao()" class="imagens-programacao html">
                        <img :src="habilidade.url" alt="" :id="habilidade.linguagem">
                    </div><!--imagens-programacao-->

                </div><!--container-logos-->

                <div class="container-texto">
                    <p class="nome-tecnologia">{{ this.nomeDaTecnologia }}</p>
                    <p class="sobre-a-linguagem">{{ this.SOBRE_A_LINGUAGEM}}</p>
                    <p class="experiencia-tecnologia">{{this.nivelDeExperiencia }}</p>
                </div><!--container-texto-->

            </div><!--container-habilidades-->
        </section>
</template>

<script>
import axios from 'axios';
export default {
    name: 'Corp4Habilidades',
    data() {
        return {
            habilidades: Object,
            SOBRE_A_LINGUAGEM:'Passe o mouse por cima de cada tecnologia ao lado.',
            nomeDaTecnologia:'',
            nivelDeExperiencia:''
        }
    },
    methods: {
        getData() {
            axios.get('http://localhost:3000/habilidades').then((response) => {
                this.habilidades = response.data;
                console.log(this.habilidades);
            });
        },
        getDadosDaTecnologia(SOBRE_A_LINGUAGEM, nomeDaTecnologia, nivelDeExperiencia){
            this.SOBRE_A_LINGUAGEM = SOBRE_A_LINGUAGEM;
            this.nomeDaTecnologia = nomeDaTecnologia;
            this.nivelDeExperiencia = nivelDeExperiencia;
        },

        resetDadosDaDescricao(){
            this.SOBRE_A_LINGUAGEM = "Passe o mouse por cima de cada tecnologia ao lado.";
            this.nomeDaTecnologia = "";
            this.nivelDeExperiencia = "";
        }

    },
    mounted() {
        this.getData();
    }
}
</script>

<style scoped>
    .sessao-habilidades{
    padding-top:130px;
    max-width:1100px;
    margin: 0 auto;
}

.sessao-habilidades p{
    color:white;
    font-size:23px;

}

.sessao-habilidades h2{
    text-align: center;
    margin-bottom: 50px;
    font-size: 40px;
    color: var(--laranja);
    font-weight: 300;   
}

.container-habilidades{
    display: flex;
    gap: 50px;
    
}

.container-logos{
    display: grid;
    grid-template-columns:33% 33% 33%;
    width: 50%;
}

.container-texto{
    width: 50%;
}

.container-habilidades img{
    max-width: 150px;
    width:100% ;
}

.container-habilidades img#VueJS{
 height: 120px;
 margin-top:10px ;
 padding-top:10px ;
}

.imagens-programacao{
    background-color: white;
    margin: 15px;
    border-radius: 20px;
}

.container-habilidades .container-texto p.sobre-a-linguagem{
    margin-top:30px;
}

/*inicio parte do javaScript*/
.container-habilidades .container-texto p.nome-tecnologia{
    margin-top:10px;
}
.container-habilidades .container-texto p.sobre-tecnologia{
    margin-top:30px;
}

.container-habilidades .container-texto p.experiencia-tecnologia{
    margin-top:30px;
}
@media screen and (max-width: 1009px){
    .container-habilidades{
        display: flex;
        gap: 50px;
        flex-wrap: wrap;
    }

    
    
    .container-logos{
        display: grid;
        grid-template-columns:33% 33% 33%;
        width: 100%;
        order: 1;
        max-width: 500px;
        margin: 0 auto;
    }

    .container-texto{
        width: 100%;
        order: 2;
        height: 350px;
        max-width: 500px;
        margin: 0 auto;
        padding: 0 2%;
    }
}
</style>