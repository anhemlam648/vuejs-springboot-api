<template>
  <div id="app">
    <Header v-if="showHeaderFooter" class="header" />
    <main class="main-content">
      <router-view></router-view>
    </main>
    <Footer v-if="showHeaderFooter" class="footer" />
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
      // kiểm tra có hiển thị header và footer ở trang 
      return this.$route.path !== '/login' && this.$route.path !== '/admin'
      && this.$route.path !== '/adminlisthr' && this.$route.path !== '/adminlistapply';
    }
  }
}
</script>

<style>
#app {
  display: flex;
  flex-direction: column;
  height: 100vh;
}

.header {
  position: fixed;
  top: 0;
  width: 100%;
  z-index: 1000;
  background-color: #ffffff; 
}

.main-content {
  flex: 1;
  padding-top: 60px; 
  padding-bottom: 40px;
  overflow-y: auto;
}

.footer {
  position: fixed;
  bottom: 0;
  width: 100%;
  z-index: 1000;
  background-color: #ffffff; 
}
nav {
  padding: 1em;
}
nav a {
  margin: 0 1em;
  text-decoration: none;
  color: #42b983;
}
</style>
