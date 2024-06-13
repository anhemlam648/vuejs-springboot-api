<template>
  <div>
    <h1 style="text-align:center;">Trang Chủ</h1>
    <div id="news">
      <p style="text-align:center;">{{ title }}</p>
      <p style="text-align:center;">{{ content }}</p>
      <img :src="image" alt="News Image" style="width:500px;display: block; margin: 20px auto;">
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
       let setTitle = 0;
       let setContent = 0;
       let setImage = 0;
        const titles = [
          "Tuyển dụng hành chính nhân sự 2024",
          "Khóa Học Hành Chính Nhân Sự Cấp Tốc"
        ];
        const contents = [
         "Hiện nay tuyển dụng nhân sự năm 2024 là nhu cầu tất yếu của các nhà tuyển dụng",
         "Đăng ký khóa học ngay"
        ]
        const images = [
         "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Dot-Pha-Hanh-Chinh-Nhan-Su.jpg",
         "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Khoa-Hoc-Hanh-Chinh-Nhan-Su-Cap-Toc.jpg"
        ]
      setInterval(() => {
        const currentTitle = (setTitle + 1) % titles.length;
        const currentContent = (setContent + 1) % contents.length;
        const currentImage = (setImage + 1) % images.length;
        this.title = titles[currentTitle]
        this.content = contents[currentContent]
        this.image = images[currentImage]
        setTitle = currentTitle;
        setContent = currentContent;
        setImage = currentImage;
      }, 3000);
      
      /*
      setTimeout(() => {
        this.title = "Khóa Học Hành Chính Nhân Sự Cấp Tốc",
        this.content = "Đăng ký khóa học ngay",
        this.image = "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Khoa-Hoc-Hanh-Chinh-Nhan-Su-Cap-Toc.jpg"
    },3000);
    */
  }
}
</script>
<style>
.news {
  margin-left:500px;
}
</style>
