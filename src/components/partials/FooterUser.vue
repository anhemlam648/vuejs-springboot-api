<template>
  <footer>
    <div class="contacts">
      <p>{{ contact }}</p>
      <a href="https://www.facebook.com/profile.php?id=61559823183246">Facebook</a> ||
      <a href="https://www.instagram.com/khoahochanhchinhnhansu/">Instagram</a> ||
      <a href="https://www.youtube.com/channel/UCyavXXYLXpI-tXI26KTapJQ">YouTube</a>
    </div>
    <hr>
    <div class="images">
      <img :src="image" alt="hanhchinhnhansu">
    </div>
    <p>{{ title }}</p>
  </footer>
</template>

<script>
export default {
  name: 'FooterUser',
  data(){
    return {
      title: "Company © 2024 Your Company. All rights reserved.",
      contact: "Thông tin liên hệ",
      image: "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/05/cropped-logohanhchinhnhansusaoviet-min-1.jpg"
    }
  }
}
</script>

<style>
footer {
  padding: 0.3em 1em;
  background-color: #f8f8f8;
  text-align: center;
  position: fixed;
  bottom: 0;
  width: 100%;
  border-top: 1px solid #e7e7e7;
}

.contacts {
  margin-bottom: 0.3em;
  font-size: 0.85em;
}

.contacts a {
  margin: 0 0.3em;
  text-decoration: none;
  color: #333;
  font-weight: bold;
}

.contacts a:hover {
  color: #007bff;
}

.images {
  margin: 0.3em 0;
}

.images img {
  width: 3%;
  height: auto;
}

footer p {
  margin: 0.2em 0;
  font-size: 0.75em;
  color: #777;
}
</style>
