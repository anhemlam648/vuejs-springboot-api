<template>
  <div>
    <h1>About</h1>
    <div class="aboutpage">
      <p class="viewtitle" style="text-align: center; font-size:20px;" >{{ title }}</p>
      <p>{{ content }}</p>
      <p>Phone:{{ phone }}</p>
      <p>Email:{{ email }}</p>
      <p>Facebook:{{ facebook }}</p>
      <a href="https://hanhchinhnhansu.edu.vn/">{{ website }}</a>
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
      email: "example@gmail.com" ,
      facebook: "hanhchinhnhansu",
      website: "https://hanhchinhnhansu.edu.vn/"
    }
  }
}
</script>

<style>
.aboutpage {
  text-align:center;
  margin: 0px;
  padding: 20px;
  border-radius: 10px; 
  border: 5px solid #33CCFF; 
  background: #CCFFFF;
}
</style>
