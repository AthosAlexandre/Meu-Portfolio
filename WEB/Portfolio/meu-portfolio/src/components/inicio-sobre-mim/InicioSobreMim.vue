<template>
    <div class="imagem-corpo">
        <section class="sobre-mim-texto">
            <h2 class="text-center font-weight-regular sobre-a-imagem text-h4">Olá sou o</h2>
            <h2 class="text-center font-weight-regular sobre-a-imagem text-h4">Athos Alexandre</h2>
            <p class="font-weight-regular sobre-a-imagem">Sou um desenvolvedor Front-End e programador Java, que gosta de aprender novas tecnologias e de criar coisas novas.</p>
            
        </section>
        <section class="imagem">
            <v-img
                width="300"
                height="300"
                src="https://scontent-gru1-1.xx.fbcdn.net/v/t39.30808-6/415802290_6842244712520220_2908691111436762482_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=efb6e6&_nc_ohc=xTekieh5TpUAX84JSyq&_nc_ht=scontent-gru1-1.xx&oh=00_AfACmnJRZeeT5gAEmJdgMyQ4Cix-XYNavuBp8Bh8V1g87Q&oe=65A2A344"
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
    components: {

    },
}
</script>

<style scoped>
.imagem-corpo {
    position: relative;
    background-image: url('../../assets/img/main-img.jpeg');
    background-size: cover;
    background-position: center;
    height: 80vh;
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
@media screen and (max-width: 700px) {
    
    .sobre-mim-texto{
        width: 100%;
    }
    .imagem{
        width: 100%;   
    }
    
}
</style>