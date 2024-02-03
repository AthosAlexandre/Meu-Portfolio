<template>
    <div class="cabecalho-main">
        <v-container style="color: aliceblue;" class="container d-flex justify-space-around align-center">
            <div class="container-texto d-flex flex-column justify-center">
                <h4>ESTAMOS PRONTOS PARA LHE ATENDER</h4>
                <h1>Muito mais que um escritório</h1>
                <p>Transformando sonhos em estruturas sólidas, porque cada projeto tem a assinatura do Thiago, arquiteto de
                    inspirações.</p>
            </div>

            <div class="container-img">
                <v-img class="img-logo" src="@/assets/logo-thiago-transparente.svg" :height="400" :width="400"
                    cover></v-img>
            </div>
        </v-container>
    </div>
</template>

<script>
export default {
    name: 'Inicio',
    data() {

    }
}
</script>

<style scoped>

h4 {
  font-size: 15px;
}
.cabecalho-main {
    position: relative;
    height: 100vh;
    width: 100%;
    max-width: 100%;
    background-image: url('https://www.weg.net/tomadas/blog/wp-content/uploads/2019/07/o-que-faz-um-arquiteto-1026x480.jpg');
    background-position: center;
    background-size: cover;

}

.cabecalho-main::before {
    content: '';
    background: rgba(128, 128, 128, 0.844);
    /* Cor cinza com 50% de opacidade */
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    z-index: 1;
}

.container {
z-index: 2;
height: 100%;
max-width: 100%;

}

.container-texto {
position: relative;
z-index: 2;
height: 400px;
max-width: 500px;
display: flex;
}

.img-logo {
  z-index: 2;
  border-radius: 50%;
}


@media screen and (max-width: 900px) {
  .container-img {
    display: none;
  }
}

</style>