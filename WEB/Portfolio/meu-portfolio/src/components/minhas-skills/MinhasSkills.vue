<template>
    <v-container>
        <h2 class="font-weight-regular" style="text-align: center;">Minhas Skills</h2>
        <div class="container-skills">
            
            <v-row>
                <v-col
                    v-for="skill in MinhasSkills"
                    :key="skill.id"
                    cols="12"
                    sm="6"
                    md="4"
                    lg="3"
                    xl="2"
                >
                    <v-card
                        class="mx-auto"
                        max-width="344"
                        outlined
                    >
                        <v-list-item three-line>
                            <v-list-item-avatar
                                tile
                                size="80"
                                color="grey"
                                class="d-flex align-center flex-column justify-center"
                            >
                                <v-icon size="36">{{skill.icon}}</v-icon>
                                <div class="overline ">{{skill.nome}}</div>
                            </v-list-item-avatar>
                        </v-list-item>
                    </v-card>
                </v-col>
            </v-row>
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