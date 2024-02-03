<template>
    <div class="whats">
        <a href="https://wa.me/5567998369815" target="_blank">
            <v-icon >
                mdi-whatsapp
            </v-icon>
        </a>
    </div>
</template>

<script>
export default {
    name: 'BotaoWhatsApp',
    data() {
        return {
            
        }
    },
    components: {
        
    },
}
</script>

<style scoped>
    a{
        color: white;
        position: fixed;
        bottom: 20px;
        right: 20px;
        background-color: #25d366;
        color: white;
        width: 60px;
        height: 60px;
        border-radius: 50%;
        display: flex;
        justify-content: center;
        align-items: center;
        font-size: 30px;
        cursor: pointer;
        text-decoration: none;
    }
</style>