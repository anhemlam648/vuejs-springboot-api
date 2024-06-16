<template>
  <footer>
    <div class="contacts">
     <p>{{ contact }}</p>
    <a href="https://www.facebook.com/profile.php?id=61559823183246">facebook</a>||
    <a href="https://www.instagram.com/khoahochanhchinhnhansu/">instagram</a>||
    <a href="https://www.youtube.com/channel/UCyavXXYLXpI-tXI26KTapJQ">youtube</a>||
    </div>
    <hr>
    <div class="images">
   <img :src = "image" alt ="hanhchinhnhansu" style="width:3%;">
   </div>
    <p>{{ title }}</p>
  </footer>
</template>

<script>
export default {
  name: 'FooterUser',
  data(){
   return {
      title: "Company&copy; 2024 Your Company. All rights reserved.",
      contact: "Thông  tin liên hệ",
      image:"https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/05/cropped-logohanhchinhnhansusaoviet-min-1.jpg"
   }
  }
}
</script>

<style>
footer {
  height:130px;
  padding: 1em;
  background-color: #f8f8f8;
  text-align: center;
  position: fixed;
  bottom: 0;
  width: 100%;
  z-index:1;
}
.images{
  height: 30px;
}
</style>
