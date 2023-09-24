import Vue from 'vue'
import Router from 'vue-router'

import MenuMenuGroupManager from "./components/listers/MenuMenuGroupCards"
import MenuMenuGroupDetail from "./components/listers/MenuMenuGroupDetail"
import MenuMenuManager from "./components/listers/MenuMenuCards"
import MenuMenuDetail from "./components/listers/MenuMenuDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/menus/menuGroups',
            name: 'MenuMenuGroupManager',
            component: MenuMenuGroupManager,
        },
        {
            path: '/menus/menuGroups/:id',
            name: 'MenuMenuGroupDetail',
            component: MenuMenuGroupDetail,
        },
        { 
            path: '/menus/menus',
            name: 'MenuMenuManager',
            component: MenuMenuManager,
        },
        {
            path: '/menus/menus/:id',
            name: 'MenuMenuDetail',
            component: MenuMenuDetail,
        },
    ]
})
