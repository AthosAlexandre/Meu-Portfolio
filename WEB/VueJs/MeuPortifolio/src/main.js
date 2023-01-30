import { createApp } from 'vue'
import App from './App.vue'

import './assets/main.css'

const app = createApp(App);
window.app = app.mount('#app')
