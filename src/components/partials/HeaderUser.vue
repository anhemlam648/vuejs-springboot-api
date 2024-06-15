<template>
  <header>
    <nav>
      <!-- Sử dụng các route-link cho url-->
      <router-link to="/" style="margin-left:50px;">Trang chủ</router-link>
      <router-link to="/hradmin">Khóa học hành chính nhân sự</router-link>
      <router-link to="/archite">Kiến thức</router-link>
      <router-link to="/apply">Tuyển dụng</router-link>
      <router-link to="/about">Liên Hệ</router-link>
      <router-link to="/login" style="margin-left: 700px;" v-if="turnoffLogin">Login</router-link>
    </nav>
  </header>
</template>

<script>
export default {
  name: 'HeaderUser'
}
</script>
<style>
header {
  padding: 1em;
  background-color: #f8f8f8;
}
nav a {
  margin: 0 1em;
  text-decoration: none;
  color: #42b983;
}
</style>
