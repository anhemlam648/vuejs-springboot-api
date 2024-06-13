<template>
  <div>
    <h1 style="text-align:center;">Trang bài viết khóa học hành chính nhân sự</h1>
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
      title: "Khóa Học Hành Chính Nhân Sự",
      content: "Ở đây chúng tôi cung cấp những khóa học chất lượng",
      image: "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Khoa-Hoc-Hanh-Chinh-Nhan-Su-Cap-Toc.jpg"
    };
  },
  methods: {
    details() {
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
