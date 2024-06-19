import { createRouter, createWebHistory } from "vue-router";
import HomeIndex from '../components/HomeIndex.vue'
import About from '../components/AboutPage.vue'
import HrAdministration from'../components/HrAdministration.vue'
import Architeture from '../components/Architeture.vue'
import Apply from '../components/Apply.vue'    
import Login from '../components/Login.vue'
import HomeAdmin from'../components/admin/HomeAdmin.vue'
import ListHradministration from '../components/admin/ListHradministration.vue'
import ListApply from '../components/admin/ListApply.vue'
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
    // {
    //     path: '/hellword',
    //     name: 'Test',
    //     component: Helloword
    // },
    {
        path:'/hradmin',
        name:'HR administration course',
        component: HrAdministration
    },
    {
        path:'/archite',
        name:'Architeture',
        component: Architeture
    },
    {
        path:'/apply',
        name:'Internapply',
        component: Apply
    },
    {
        path:'/login',
        name: 'Login',
        component: Login
    },
    {
        path:'/admin',
        name:'HomeAdmin',
        component:HomeAdmin
    },
    {
        path:'/adminlisthr',
        name:'ListHradministration',
        component: ListHradministration
    },
    {
        path:'/adminlistapply',
        name: 'ListApply',
        component: ListApply
    }
]
const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})
export default router