<template>
    <div class="imagem-corpo hidden" id="imagem-corpo">
        <section class="sobre-mim-texto">
            <h2 class=" font-weight-regular sobre-a-imagem text-h5 ">Olá sou o Athos Alexandre</h2>

            <p class="font-weight-regular sobre-a-imagem">Sou um desenvolvedor Front-End e programador Java, que gosta de aprender novas tecnologias e de criar coisas novas.</p>

            <div class="pt-6 botao-dowload">
                    <v-btn href="https://drive.google.com/file/d/1m-hbtI0rrPvC3oXDfJnYXTzmUOAEOIbq/view?usp=sharing" class="bg-red-accent-4" prepend-icon="mdi-file-download">BAIXAR CURRICULO</v-btn>
            </div>
            
        </section>
        <section class="imagem ">
            <v-img
                width="300"
                height="300"
                src="../../assets/img/foto_athos.jpg"
                class="rounded-circle"
                alt="Foto do Athos"
            ></v-img>
        </section>
        
    </div>
</template>

<script>

export default {
    name: 'InicioSobreMim',

    data() {
        return {

        }
    },
    methods: {
        
    },
    components: {
        
  
    },
}
</script>

<style scoped>

h2{
    border-right: 4px solid ;
    width: 21.5ch; /* quantidade de caracteres*/
    white-space: nowrap;
    overflow: hidden;
    animation: typing 2.2s steps(21), blinking 0.5s step-end infinite alternate ;
    
}

@keyframes typing {
    from { width: 0 }
    
}

@keyframes blinking {
    50% { border-color: transparent }
}

.imagem-corpo {
    position: relative;
    background-image: url('../../assets/img/main-img.jpeg');
    background-size: cover;
    background-position: center;
    height: 100vh;
    max-width: 100%;
    width: 100%;
    display: flex;
    justify-content: space-around;
    align-items: center;
    flex-wrap: wrap;
}

.imagem-corpo::before {
    content: '';
    background: rgba(0, 0, 0, 0.685);
    /* Cor de fundo com transparência */
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    
}

.sobre-a-imagem {
    color: white;
    position: relative;
}

.sobre-mim-texto{
    width: 50%;
    max-width: 300px;
    
}
p{
   text-align: justify;
}
.imagem{
    width: 50%;
    max-width: 300px;

}


.vue-typer {
  font-family: Copperplate, 'Copperplate Gothic Light', fantasy;
}

.vue-typer .custom.char.typed {
  color: #607D8B;
}
.vue-typer .custom.char.selected {
  color: #607D8B;
  background-color: transparent;
  text-decoration: line-through;
}

.vue-typer .custom.caret {
  display: none;
}

@media screen and (max-width: 700px) {
    
    .sobre-mim-texto{
        width: 100%;
    }
    .imagem{
        width: 100%;   
    }
    
}
</style>