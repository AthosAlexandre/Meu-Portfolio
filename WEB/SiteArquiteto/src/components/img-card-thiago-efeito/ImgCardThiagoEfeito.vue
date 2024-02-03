<template>
    <div class="container-efeito-card">
        <v-container class="container-img d-flex justify-center">
            <article class="img__article">
                <v-img class="img"
                    style="background-image: url('https://www.lineastudio.com.br/wp-content/uploads/2020/05/Ze-barbosa_blog.jpg');">
                </v-img>
                
                <div class="img__data">
                    <span class="img__descricao">Olá, tudo bem?</span>
                    <h2 class="img__title">Meu nome é Thiago</h2>
                    <a href="" class="img__button">consulte Mais informação</a>
                </div>
            </article>
        </v-container>
    </div>
</template>

<script>
export default {
    name: 'ImgCardThiagoEfeito',
    data() {
        return {

        }
    }
}
</script>

<style scoped>
.container-efeito-card {
    display: grid;
    place-items: center;
    margin-inline: 1.5rem;
    padding-block: 5rem;

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
    height: 350px;
    width: 350px;
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
}

.img__title {
    font-size: 1.25rem;
    font-weight: 500;
    color: grey;
    margin-bottom: .75rem;
}

.img__button {
    text-decoration: none;
    font-size: .813rem;
    font-weight: 500;
    color: #b0b97d;
}

.img__button:hover {
    text-decoration: underline;
}

@media screen and (max-width: 900px) {
    .img {
        height: 300px;
        max-width: 300px;
    }
}
</style>