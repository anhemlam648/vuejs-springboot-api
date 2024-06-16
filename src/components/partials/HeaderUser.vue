<template>
  <header>
    <nav>
      <!-- Sử dụng các route-link cho url-->
      <router-link to="/" class="nav-link">Trang chủ</router-link>
      <router-link to="/hradmin" class="nav-link">Khóa học hành chính nhân sự</router-link>
      <router-link to="/archite" class="nav-link">Kiến thức</router-link>
      <router-link to="/apply" class="nav-link">Tuyển dụng</router-link>
      <router-link to="/about" class="nav-link">Liên Hệ</router-link>
      <router-link to="/login" class="nav-link login-link">Login</router-link>
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
  background: #ffde59,#ff914d;
  background-size: cover;
  color: white;
}

nav {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.nav-link {
  margin: 0 1em;
  text-decoration: none;
  color: black;
  font-weight: bold;
  transition: color 0.3s;
}

.nav-link:hover {
  color: #ffd700;
}

.login-link {
  margin-left: 500px;
}

@media (max-width: 768px) {
  nav {
    flex-direction: column;
  }
  .nav-link {
    margin: 0.5em 0;
  }
}
</style>
