<!-- src/App.vue -->
<template>
  <div id="app">
    <Header v-if="showHeaderFooter" />
    <router-view></router-view>
    <Footer v-if="showHeaderFooter" />
  </div>
</template>

<script>
import Header from './components/partials/HeaderUser';
import Footer from './components/partials/FooterUser';


export default {
  name: 'App',
  components: {
    Header,
    Footer,
  },
  computed: {
    showHeaderFooter() {
      // kiểm tra có hiển thị header và footer ở trang login Không 
      return this.$route.path !== '/login';
    }
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
