<template>
    <div class="container-efeito-card">
        <v-container class="container-img">
            <section class="img__article">
                <v-img class="elevation-12 img" src="../../assets/img/foto_athos.jpg" alt="Foto do Athos">
                </v-img>

                <div class="img__data">
                    <span class="img__descricao">Olá</span>
                    <h2 class="img__title">Eu sou o Athos!!</h2>
                </div>

            </section>
        </v-container>
    </div>
</template>

<script>
export default {
    name: 'ImgCardAthosEfeito',
    data() {
        return {

        }
    },
}
</script>

<style scoped>
.container-efeito-card{
    max-width: 380px;
    width: 100%;
    max-width: 380px;
    height: 100%;
}
.container-img {
    display: grid;
    row-gap: 3.5rem;
}

.img__article {
    position: relative;
    overflow: hidden;
    /*para esconder o conteúdo que ultrapassa o container*/
    border-radius: 40px;
    box-shadow: rgba(46, 179, 240, 0.4) -5px 5px, rgba(46, 179, 240, 0.3) -10px 10px, rgba(46, 179, 240, 0.2) -15px 15px, rgba(46, 179, 240, 0.1) -20px 20px, rgba(46, 179, 240, 0.05) -25px 25px;
}

.img {
    border-radius: 40px;
    background-size: cover;
    transition: .5s;
    cursor: pointer;
}

.img__data {
    width: 280px;
    background-color: hsl(0, 0%, 100%);
    padding: 1.5rem 2rem;
    box-shadow: 0 8px 2px hsla(0, 0%, 0%, .15);
    border-radius: 1rem;
    position: absolute;
    bottom: -9rem;
    left: 0;
    right: 0;
    margin-inline: auto;
    opacity: 0;
    transition: opacity 1s 1s;
}

.img__article:hover .img__data {
    animation: show-data 1s forwards;
    opacity: 1;
    transition: opacity .3s;
}

.img__article:hover {
    animation: remove-overflow 2s forwards;
}

.img__article:not(:hover) {
    animation: show-overflow 2s forwards;
}

.img__article:not(:hover) .img__data {
    animation: remove-data 1s forwards;
}

@keyframes show-data {
    50% {
        transform: translateY(-10rem);
    }

    100% {
        transform: translateY(-7rem);
    }
}

@keyframes remove-overflow {
    to {
        overflow: initial;
    }
}

@keyframes remove-data {
    0% {
        transform: translateY(-7rem);
    }

    50% {
        transform: translateY(-10rem);
    }

    100% {
        transform: translateY(.5rem);
    }
}

@keyframes show-overflow {
    0% {
        overflow: initial;
        pointer-events: none;
    }

    50% {
        overflow: hidden;
    }
}

.img__descricao {
    display: block;
    font-size: 1rem;
    margin-bottom: .25rem;
    color: grey;

}

.img__title {
    font-size: 1.25rem;
    font-weight: 500;
    color: grey;
    margin-bottom: .75rem;
}



@media screen and (max-width: 900px) {
    .container-efeito-card {
        width: 70%;
        height: 40%;
    }
}

@media screen and (max-width: 600px) {
    .img__data {
        width: 200px;
    }

    .container-efeito-card {
        width: 100%;
    }
}

@media screen and (max-width: 350px) {
    .img__data {
        width: 150px;
    }
}

</style>