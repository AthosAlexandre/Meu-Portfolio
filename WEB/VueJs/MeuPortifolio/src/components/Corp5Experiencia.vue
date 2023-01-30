<template>
    <section class="sessao-experiencia" id="experiencia" data-aos="fade-right">
            <h2>Experiência</h2>
            <div class="container-experiencia">
                <p>Ainda não trabalhei na área de desenvolvimento e programação, mas pode ser sua empresa a minha grande chance da vida.</p>
                <img src="@/assets/imagens/programing.png" alt="">
            </div><!--container-experiencia-->
        </section><!--sessao-experiencia-->
</template>

<script>
    export default{
        name:'Corp5Experiencia',
        data(){
            return {

            }
        }
    }
</script>

<style scoped>
.sessao-experiencia{
margin-top:50px;
padding-top: 120px;
}

.sessao-experiencia h2{
    text-align: center;
    margin-bottom: 50px;
    font-size: 40px;
    color: var(--laranja);
    font-weight: 300;  
    
}

.container-experiencia{
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    gap: 30px;
    padding: 2%;
}

.container-experiencia p{
    color:white;
    font-size: 25px;
    
}

.container-experiencia img{
    max-width: 300px;
    
}

</style>