<template>
    <section class="sessao-projetos" id="projetos" data-aos="fade-right">
            <h2>Projetos</h2>
            <div class="container-projetos">
                <article class="projeto-nosh">
                    <img src="@/assets/imagens/nosh.jpg" alt="">
                    <h3>Nosh</h3>
                    <p>Esse projeto foi para testar minhas habilidades de front-end, uma copia do site de comida Nosh.</p>
                    <button class="bnt">Em andamento</button>
                </article><!--projeto-nosh-->
                <article class="projeto-nosh">
                    <img src="@/assets/projeto-5/imagens/bg.jpg" alt="">
                    <h3>RM VEICULOS</h3>
                    <p>Esse projeto foi para testar minhas habilidades de front-end, um site de atividade do curso da danki-code.</p>
                    <a href="https://resplendent-crisp-ba74d9.netlify.app/index.html" target="_blank"><button class="bnt">Visualizar</button></a>
                </article><!--projeto-nosh-->
                <article class="projeto-nosh">
                    <img src="@/assets/imagens/projeto_odonto.jpeg" alt="">
                    <h3>Odontologia</h3>
                    <p>Esse projeto foi para testar minhas habilidades de front-end, um site de atividade do curso da danki-code.</p>
                    <a href="https://celebrated-marshmallow-90c661.netlify.app/" target="_blank"><button class="bnt">Visualizar</button></a>
                </article><!--projeto-nosh-->
                
            </div><!--container-projetos-->
        </section><!--sessao-projetos-->
</template>

<script>
    export default{
        name:'Corp3Projetos',
        data(){
            return {

            }
        }
    }
</script>

<style scoped>
    section.sessao-projetos {
    padding-top:130px;
}

 section.sessao-projetos div.container-projetos {
    display: grid;
    grid-template-columns:33.3% 33.3% 33.3%;
    max-width: 910px;
    margin: 0 auto;
    
}

 section.sessao-projetos h2{
    text-align: center;
    margin-bottom: 20px;
    font-size:4.5vh;
    color: var(--laranja);
    font-weight: 300;
}

 section.sessao-projetos h3{
    color: var(--azul-fraco);
}

 section.sessao-projetos p{
    color:white;
    font-size:2vh;
}

 section.sessao-projetos article.projeto-nosh img{
    width: 100%;
    max-width: 300px;
    height: 300px;
}

 section.sessao-projetos .projeto-nosh{
    max-width:100%;
    width: 300px;
    padding: 2%;
    
}

section.sessao-projetos article .bnt{
    width: 100px;
    height: 50px;
    background-color: var(--azul-fraco);
    text-align: center;
    border-radius:10px;
    margin-top: 10px;
}

section.sessao-projetos article .bnt:hover{
    background-color: #3f7884;
    cursor: pointer;
}
@media screen and (max-width: 860px) {
    section.sessao-projetos div.container-projetos {
        grid-template-columns:100%;
    }

    section.sessao-projetos div.container-projetos article{
        margin: 0 auto;
    }
}

</style>