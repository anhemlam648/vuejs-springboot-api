<template>
  <div id="app">
    <Header />
    <router-view></router-view>
    <Footer />
  </div>
</template>

<script>
import Header from './components/partials/HeaderUser';
import Footer from './components/partials/FooterUser';
export default {
  name: 'App',
  components: {
    Header,
    Footer
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
