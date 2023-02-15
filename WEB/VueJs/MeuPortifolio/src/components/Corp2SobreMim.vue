<template>
    <section class="sessao-sobre-mim" id="sobre-mim" data-aos="fade-right">
            <img src="@/assets/imagens/athos-alexandre.jpg" alt="">
            <article class="sobre-mim-texto-container">
                <h2>Sobre mim</h2>
                <p>Olá! Meu nome é Athos Alexandre, nesse momento estou cursando Sistemas de Informação na Universidade Federal de Mato Grosso do Sul, campus de Coxim, eu amo tecnologia. Apesar de que  estou cursando uma faculdade e trabalhando no exército brasileiro, estou estudando para ser um FULL-STACK, sei bem a parte do FRONT-END e duas Linguagens para a parte do BACK-END, então falta a parte do banco de dados, porém, já estou iniciando os estudos de banco de dados. Eu acredito que com o que  sei, consigo trabalhar no FRONT-END, sou muito estudioso, sempre estou buscando melhorar.</p>
            </article><!--sobre-mim-texto-container-->
        </section><!--sessao-sobre-mim-->
</template>

<script>
    export default{
        name:'Corp2SobreMim',
        data(){
            return {

            }
        }
    }
</script>

<style scoped>
    section.sessao-sobre-mim{
    display: flex;
    justify-content: center;
    flex-wrap: wrap;
    align-items: center;
    padding-top:160px;
    column-gap: 90px;
    padding-bottom:180px;
}
 section.sessao-sobre-mim img{
    width: 100%;
    max-width:300px;
    border-radius: 150px;
}

 section.sessao-sobre-mim article.sobre-mim-texto-container{
    max-width: 600px;
    padding: 0 2%;
}

 section.sessao-sobre-mim article.sobre-mim-texto-container h2{
    font-size:4.5vh;
    color: var(--laranja);
    font-weight: 300;
    padding: 2%;
}


 section.sessao-sobre-mim article.sobre-mim-texto-container p{
    color:white;
    font-size:2vh;
    padding: 2%;
}

</style>