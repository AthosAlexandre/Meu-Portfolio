<template>
    <v-container>
        <h1 style="text-align: center;">Minhas Skills</h1>
        <div class="container-skills">
            
        </div>
    </v-container>
</template>

<script >
export default {
    name: 'MinhasSkills',
    data() {
        return {
            MinhasSkills:[
                {
                    id:1,
                    nome:'Java',
                    icon:'mdi-language-java',
                },
                {
                    id:2,
                    nome:'HTML',
                    icon:'mdi-language-html5',
                },
                {
                    id:3,
                    nome:'CSS',
                    icon:'mdi-language-css3',
                },
                {
                    id:4,
                    nome:'JavaScript',
                    icon:'mdi-language-javascript',
                },
                {
                    id:5,
                    nome:'Vue.js',
                    icon:'mdi-vuejs',
                },
                {
                    id:6,
                    nome:'React.js',
                    icon:'mdi-react',
                },
                {
                    id:7,
                    nome:'Firebase',
                    icon:'mdi-firebase',
                },
                {
                    id:8,
                    nome:'MySQL',
                    icon:'mdi-database',
                }
            ]
        }
    },
    components: {

    },
}
</script>

<style scoped></style>