<template>
    <div class="imagem-corpo hidden" id="imagem-corpo">
        <section class="sobre-mim-texto">
            <h2 class=" font-weight-regular sobre-a-imagem text-h5 ">Olá sou o Athos Alexandre</h2>

            <p class="font-weight-regular sobre-a-imagem">Sou um desenvolvedor Front-End e programador Java, que gosta de aprender novas tecnologias e de criar coisas novas.</p>

            <div class="pt-6 botao-dowload">
                    <v-btn href="https://drive.google.com/uc?export=download&id=1cjnoUcVeWeWEoH_QahNLEsDlRgxxUfoN" class="bg-red-accent-4" prepend-icon="mdi-file-download">BAIXAR CURRICULO</v-btn>
            </div>
            
        </section>
        <section class="imagem ">
            <v-img
                width="300"
                height="300"
                src="https://scontent-gru1-1.xx.fbcdn.net/v/t39.30808-6/415802290_6842244712520220_2908691111436762482_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=efb6e6&_nc_ohc=_42Q-x3ilHcAX9TPOj7&_nc_ht=scontent-gru1-1.xx&oh=00_AfAwKacfMTxTjS94LsRG_bvtK_Eo-PCmXEdK92G4uzapNw&oe=65B46F84"
                class="rounded-circle"
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