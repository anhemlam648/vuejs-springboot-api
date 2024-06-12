import { createRouter, createWebHistory } from "vue-router";
import HomeIndex from '../components/HomeIndex.vue'
import About from '../components/AboutPage.vue'
import Helloword from'../components/HelloWorld.vue'
import ListProduct from'../components/ListProduct.vue'
const routes =[
    {
        path: '/',
        name: 'Home',
        component: HomeIndex
    },
    {
        path: '/about',
        name: 'About',
        component: About
    },
    {
        path: '/hellword',
        name: 'Test',
        component: Helloword
    },
    {
        path:'/product',
        name:'Product',
        component: ListProduct
    }
]
const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})
export default router