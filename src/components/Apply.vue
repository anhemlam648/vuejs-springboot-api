<template>
  <div>
    <h1 style="text-align:center;"> Trang bài viết Tuyển Dụng</h1>
    <div class="hr-administration">
      <p style="text-align:center;">{{ title }}</p>
      <p style="text-align:center;">{{ content }}</p>
      <img :src="image" alt="hình mới" class="image" style="width:500px;">
      <div class="button-container">
        <button @click="details">Click me</button>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: 'HrAdministration',
  data() {
    return {
      title: "Tuyển dụng hành chính nahan sự",
      content: "Ở đây chúng tôi hỗ trợ các khóa tuyển dụng",
      image: "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Danh-Gia-Va-Lua-Chon.jpg"
    };
  },
  methods: {
    details() {
      window.location.href = "https://hanhchinhnhansu.edu.vn/";
    }
  },
};
</script>

<style>
.hr-administration {
  text-align: center;
  margin: 0 auto;
}
.image {
  display: block;
  margin: 20px auto;
}
.button-container {
  text-align: center;
  margin-top: 20px;
}
button {
  padding: 10px 20px;
  font-size: 16px;
}
</style>
