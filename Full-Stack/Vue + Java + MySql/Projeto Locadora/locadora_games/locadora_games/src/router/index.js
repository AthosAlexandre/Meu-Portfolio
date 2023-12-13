// Composables
import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '/',
    
    children: [
      {
        path: '/home',
        name: 'Home',
        // route level code-splitting
        // this generates a separate chunk (about.[hash].js) for this route
        // which is lazy-loaded when the route is visited.
        component: () => import(/* webpackChunkName: "home" */ '@/views/home/Home.vue'),
      },
      {
        path:'/cadastrar',
        name:'cadastrar',
        component: () => import( '@/views/Cadastro/CadastroView.vue'),
      },
      {
      path:'/locar',
      name:'locar',
      component: () => import('@/views/LocadoraDeJogos/LocadoraDeJogosView.vue')
      },
      {
        path:'/devolucao',
        name:'devolucao',
        component:() => import('@/views/devolverJogos/DevolverJogosView.vue')
      },
    ],
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
})

export default router
