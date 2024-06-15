<template>
  <div>
   <div class="login-wrapper">
    <div class="login-container">
      <h1 style="text-align:center;">{{ title }}</h1>
      <form @submit.prevent="login">
        <div class="form-group">
          <label for="email">Email:</label>
          <input type="text" id="email" v-model="email" required />
        </div>
        <div class="form-group">
          <label for="password">password:</label>
          <input type="password" id="password" v-model="password" required />
        </div>
        <div class="button-container">
          <button type="submit">Đăng Nhập</button>
        </div>
      </form>
      <p style="text-align:center;">{{ message }}</p>
    </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'LoginPage',
  data() {
    return {
      title: "Đăng Nhập",
      email: "",
      password: "",
      message: ""
    };
  },
  methods: {
    login() {
      // kiểm tra login
      if (this.email === "admin" && this.password === "123") {
        this.message = "Đăng nhập thành công!";
        setTimeout(() => {
            this.$router.push('/');
        }, 1000);
      } else {
        this.message = "email hoặc mật khẩu không đúng!";
      }
    }
  }
};
</script>
<style>
.login-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.login-container {
  max-width: 400px;
  margin: auto;
  padding: 100px;
  border: 5px solid #00FF99;
  border-radius: 10px;
  text-align: center;
  height: 300px; 
}
.form-group {
  margin-bottom: 15px;
}
label {
  display: block;
  margin-bottom: 5px;
  font-weight: bold;
}
input[type="text"],
input[type="password"] {
  width: 100%;
  padding: 10px;
  margin-top: 5px;
  box-sizing: border-box;
}
.button-container {
  margin-top: 20px;
}
button {
  padding: 10px 20px;
  font-size: 16px;
}
</style>
