<template>
    <div>
        <section class="sessao-home-cont" id="home" data-aos="fade-right">
            <article class="sessao-home">
                <h2>Olá, eu sou</h2>
                <h1>Athos Alexandre</h1>
                <h2 class="typing-demo">Desenvolvedor FRONT-END</h2>
                <P>Observação:(A caminho do FULL-STACK)</P>
                <div class="container-bnt">
                    <a href="https://github.com/AthosAlexandre" target="_blank"><button class="bnt-git">GitHub</button></a>
                    <a href="https://www.linkedin.com/in/athos-alexandre-109199218/" target="_blank"><button class="bnt-link">Linkedin</button></a>
                </div><!--container-bnt-->
            </article><!--sessao-home-->
        <Tilt :options="this.options" parallax="true">
                <img src="@/assets/imagens/garoto-dev-principal.jpg" alt="" class="box">
        </Tilt>
        </section><!--sessao-home-cont-->
    </div>
</template>

<script>
    import Tilt from './tilt.vue'
    export default{
        name:'Corp1Home',
        data(){
            return {
                options: {max: 25, speed: 400}
            }
        },
        components:{
            Tilt
        }
    }
</script>

<style scoped>
    .sessao-home{
        width: 330px;
    }
    section.sessao-home-cont{
    display: flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
    align-items: center;
    padding-top:150px;
    padding-bottom:80px;
}

 section.sessao-home-cont img{
    width: 100%;
    max-width: 600px;
    min-width: 350px;
   z-index: 10;
   transition: .5s;
   border: 1px solid white;
   transform-style: preserve-3d;
}

 
section.sessao-home-cont img{
    transform: translateZ(20px);
}

 section.sessao-home-cont p{
    color: var(--vermelho);
    margin-top:10px;
}

 h2{
    color: var(--laranja);
    font-weight: 300;
    font-size: 27px;
}

.typing-demo{
    width: 346px;
    animation: typing 2s steps(22), blink .5s step-end infinite alternate;
    white-space: nowrap;
    overflow: hidden;
    border-right:3px solid white;
}

@keyframes typing{

    from{
        width: 0;
    }
}

@keyframes blink{
    50%{
        border-color: transparent;
    }
}

section.sessao-home-cont h2:last-of-type{
    margin-top:10px;
}

 h1{
    margin-top:10px;
    color: var(--azul-fraco);
    font-weight: 300;
    font-size: 40px;
}

section.sessao-home-cont div.container-bnt{
    display: flex;
    justify-content: space-between;
}

 section.sessao-home-cont button{
    width: 140px;
    height: 40px;
    cursor: pointer;
    margin-top:20px;
    border-radius: 10px;
    background-color: #27283D;
    color: white;
}

 section.sessao-home-cont button.bnt-git{
    border: 2px solid #E74B27;
}

 section.sessao-home-cont button.bnt-link{
    border: 2px solid #0A66C2;
}
</style>