<template>
  <div class="admin-contact">
    <HeaderAdmin />
    <div class="contact-details">
      <h1>{{ title }}</h1>
      <div class="contact-info">
        <p>{{ content }}</p>
        <p>Phone: {{ phone }}</p>
        <p>Email: {{ email }}</p>
        <a :href="website">{{ website }}</a>
        <img :src="image" alt="contact" style="width:450px" class ="image"/>
      </div>
    </div>
    <FooterAdmin />
  </div>
</template>

<script>
import HeaderAdmin from '../partials/HeaderAdmin';
import FooterAdmin from '../partials/FooterAdmin';
export default {
  name: 'AdminContact',
  components: {
    HeaderAdmin,
    FooterAdmin
  },
  data() {
    return {
      title: "Thông tin liên hệ",
      content: "Nếu có thắc mắc vui lòng liên hệ với chúng tôi!",
      phone: "1900-576-788",
      email: "example@gmail.com",
      website: "https://hanhchinhnhansu.edu.vn/",
      image:"https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/05/Khoa-Hoc-Hanh-Chinh-Nhan-Su-1.jpg"
    };
  }
};
</script>

<style scoped>
.admin-contact {
  display: flex;
  flex-direction: column;
  height: 100%;
  font-family: Arial, sans-serif;
}

.contact-details {
text-align: center;
  flex: 1;
  padding: 100px 20px 20px;
  margin: 20px auto;
  background-color: #ffffff;
  border: 1px solid #dee2e6;
  border-radius: 8px;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
  width: 95%;
  max-width: 100%;
  overflow: hidden;
  margin-top: -50px;

}

.contact-details h1 {
  color: #004080;
  margin-bottom: 10px;
  font-size: 24px;
  font-weight: bold;
  text-align: center;
}

.contact-info {
  text-align: center;
  margin-top: 20px;
}

.contact-info p {
  color: #333;
  font-size: 16px;
  line-height: 1.6;
}

.contact-info a {
  display: block;
  color: #004080;
  font-size: 16px;
  text-decoration: none;
  margin-top: 10px;
}

.contact-info a:hover {
  text-decoration: underline;
}
.image{
 display:block;
 margin: 10px auto;
 margin-top:"-10px";
}
</style>
