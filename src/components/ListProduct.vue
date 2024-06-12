<template>
  <div>
    <h1 style="text-align:center;">Trang bài viết</h1>
    <div class="listproduct">
      <p style="text-align:center;">{{ title }}</p>
      <p style="text-align:center;">{{ content }}</p>
      <img :src="image" alt="hình mới" style="margin-left: 130px;">
      <div>
      <button @click="listnew" style="margin-left: 680px;">Click me</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'ProductList',
  data() {
    return {
      title: "Khóa Học Hành Chính Nhân Sự",
      content: "ở đây chúng tôi cung cấp những khóa học chất lượng",
      image: "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Ky-Nang-Xu-Ly-va-Thu-Thap-Thong-Tin.jpg"
    };
  },
  methods: {
    listnew() {
      window.location.href = "https://hanhchinhnhansu.edu.vn/";
    }
  },
  mounted() {
    setTimeout(() => {
      this.image = "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Ky-Nang-Lap-Ke-Hoach-va-Bao-Cao.jpg";
    }, 3000);
  }
};
</script>

<style>

</style>
