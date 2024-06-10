<template>
  <div id="app">
    <nav>
        <!-- Sử dụng các route-link cho url-->
      <router-link to="/">Home</router-link>
      <router-link to="/about">About</router-link>
      <router-link to="/hellword">Hello</router-link>
    </nav>
    <router-view></router-view>
    <!-- <HelloWorld msg="Welcome to Your Vue.js App"/> -->
  </div>
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    // HelloWorld
  }
}
</script>

<style>
nav {
  padding: 1em;
}
nav a {
  margin: 0 1em;
  text-decoration: none;
  color: #42b983;
}
</style>
