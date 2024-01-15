<template>
    <div class="bg-grey-darken-3">
        

        <v-sheet class="mx-auto bg-grey-darken-3" elevation="8" max-width="800">
            <v-slide-group v-model="model" class="pa-4" selected-class="bg-success" show-arrows>
                <v-slide-group-item v-for="skill in MinhasSkills" :key="skill.id" v-slot="{ isSelected, toggle, selectedClass }">

                    <v-card :class="['ma-4','d-flex','justify-center', selectedClass]" width="100" height="100" outlined>
                        <v-list-item three-line>
                            <v-list-item-avatar tile size="80" color="grey"
                                class="d-flex align-center flex-column justify-center">
                                <v-icon size="36">{{ skill.icon }}</v-icon>
                                <div class="overline ">{{ skill.nome }}</div>
                            </v-list-item-avatar>
                        </v-list-item>
                    </v-card>

                </v-slide-group-item>
            </v-slide-group>
        </v-sheet>

    </div>
</template>

<script >
export default {
    name: 'MinhasSkills',
    data() {
        return {
            model: null,
            MinhasSkills: [
                {
                    id: 1,
                    nome: 'Java',
                    icon: 'mdi-language-java',
                },
                {
                    id: 2,
                    nome: 'HTML',
                    icon: 'mdi-language-html5',
                },
                {
                    id: 3,
                    nome: 'CSS',
                    icon: 'mdi-language-css3',
                },
                {
                    id: 4,
                    nome: 'JavaScript',
                    icon: 'mdi-language-javascript',
                },
                {
                    id: 5,
                    nome: 'Vue.js',
                    icon: 'mdi-vuejs',
                },
                {
                    id: 6,
                    nome: 'React.js',
                    icon: 'mdi-react',
                },
                {
                    id: 7,
                    nome: 'Firebase',
                    icon: 'mdi-firebase',
                },
                {
                    id: 8,
                    nome: 'MySQL',
                    icon: 'mdi-database',
                }
            ]
        }
    },
    components: {

    },
}
</script>

<style scoped></style>