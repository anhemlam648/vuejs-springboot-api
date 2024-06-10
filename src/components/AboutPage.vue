<template>
  <div>
    <h1>About</h1>
    <div class="aboutpage">
      <p class="viewtitle" style="text-align: center; frontsize:20px;" >{{ title }}</p>
      <p>{{ content }}</p>
      <p>Phone:{{ phone }}</p>
      <p>Email:{{ email }}</p>
    </div>
  </div>
</template>

<script>
export default {
  name: 'AboutPage',
  data() {
    return {
      title: "Thông tin liên hệ",
      content: "Nếu có thắc mắc vui lòng liên hệ với chúng tôi!",
      phone: "1900-576-788",
      email: "example@gmail.com" 
    }
  }
}
</script>

<style>
.aboutpage {
  padding: 20px;
  border-radius: 10px; 
  border: 5px solid #33CCFF; 
  background: #CCFFFF;
}
</style>
