<template>
    <header class="cabecalho">
        
        <nav class="navegacao-sobre-mim">
            <img src="@/assets/imagens/coding.png" alt="">

            <label for="checkbox" class="hamburguer" >
                <input type="checkbox" id="checkbox" @click="abrirMenu()">
                <span class="line line--top"></span>
                <span class="line line--middle"></span>
                <span class="line line--bottom"></span>
            </label>

            
            <div :class="{active: isActive}" id="navegacao">
                <a href="#home">Home</a>
                <a href="#sobre-mim">Sobre mim</a>
                <a href="#projetos">Projetos</a>
                <a href="#habilidades">Habilidades</a>
                <a href="#experiencia">Experiência</a>
            </div><!--navegacao-->
        </nav><!--navegacao-sobre-mim-->
        
    </header><!--cabecalho-->
</template>

<script>

export default {
    name:'Cabecalho',
    data() {
        return{
            isActive: true,
        }
    },
    methods: {
        abrirMenu(){
            this.isActive = !this.isActive;
        }
    }
}
</script>

<style scoped>
/*inicio header*/
header{
    background-color:#fea34df9;
    position: fixed;
    border-bottom: 1px solid white;
    width: 100%;
    overflow: hidden;
    top: 0;
    z-index: 11;
}

header.cabecalho nav.navegacao-sobre-mim img{
    width: 90px;
}
header.cabecalho nav.navegacao-sobre-mim{
    display: flex;
    justify-content: space-around;
    align-items: center;
    padding: 15px 1%;
    
}

header.cabecalho .navegacao-sobre-mim a{
    margin-left: 20px;
    color: aliceblue;
}

header.cabecalho .navegacao-sobre-mim a:hover{
    color:#D63A5F;
    transition: .5s ease;
    border-radius: 5px;
}

#navegacao{
    display: flex;
}

#checkbox{
    display:none;
}

.hamburguer{
    position: relative;
    padding: 10px 25px 12px 3px;
    display: none;
    align-items: center;
    justify-content: center;
    cursor: pointer;
    width: 5px;
}

.line{
    position: absolute;
    width: 23px;
    height: 2px;
    background-color: #fff;
    border-radius:3px;
    transition: transform .25s, opacity .35s;
}

.line--top{
    transform: translateY(-7px);
}

.line--bottom{
    transform: translateY(7px);
}

#checkbox:checked~ .line--top{
    transform: rotate(45deg);
}

#checkbox:checked~ .line--middle{
    transform: translateX(16px);
    opacity:0;
}

#checkbox:checked~ .line--bottom{
    transform: rotate(-45deg);
}
/*fim header*/

@media screen and (max-width: 588px) {
    
    .hamburguer{
        display: block;
        z-index: 1000;
    }
    

    #navegacao{
        position: fixed;
        top: 0;
        margin: 0;
        right: 0;
        height: 100vh;
        background-color: #784e26;
        flex-direction: column;
        align-items: center;
        padding: 100px 20px;
        gap: 20px;
        width: 100%;
        max-width:300px;
        transition: 1s ease;
        
    }

    #navegacao.active{
        right: -100%;
    }
    
}
</style>