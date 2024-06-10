<template>
  <div>
    <h1>Trang Chủ</h1>
    <div id="news">
      <p>{{ title }}</p>
      <p>{{ content }}</p>
        <img :src="image" alt="News Image">
    </div>
  </div>
</template>

<script>
export default {
  name: 'HomeIndex',
  data() {
    return {
      title: "Tuyển dụng hành chính nhân sự 2024",
      content: "Hiện nay tuyển dụng nhân sự năm 2024 là nhu cầu tất yếu của các nhà tuyển dụng",
      image: "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Dot-Pha-Hanh-Chinh-Nhan-Su.jpg"
    }
  },
  mounted() {
      setTimeout(() => {
        this.title = "Khóa Học Hành Chính Nhân Sự Cấp Tốc",
        this.content = "Đăng ký khóa học ngay",
        this.image = "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Khoa-Hoc-Hanh-Chinh-Nhan-Su-Cap-Toc.jpg"
    },3000);
  }
}
</script>
