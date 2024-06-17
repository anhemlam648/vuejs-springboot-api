<template>
  <div class="home-admin">
    <HeaderAdmin />
    <div class="admin-content">
      <h1>{{ title }}</h1>
      <p>{{ content }}</p>
    </div>
    <FooterAdmin />
  </div>
</template>

<script>
import HeaderAdmin from '../partials/HeaderAdmin';
import FooterAdmin from '../partials/FooterAdmin';

export default {
  name: 'HomeAdmin',
  components: {
    HeaderAdmin,
    FooterAdmin
  },
  data() {
    return {
      title: 'Trang Quan Lý Admin',
      content: 'Trang quản lý bài viết'
    }
  }
}
</script>

<style>
.home-admin {
  display: flex;
  flex-direction: column;
  height:100%;
  background-color: #f1f1f1; 
  font-family: Arial, sans-serif;
}

.header-admin {
  position: fixed;
  top: 0;
  width: 100%;
  z-index: 1000;
  background-color: #004080; 
  color: #fff;
  text-align: center;
  padding: 15px 0;
  font-size: 18px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); 
}

.admin-content {
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
}
.admin-content h1 {
  color: #004080;
  margin-bottom: 10px;
  font-size: 24px;
  font-weight: bold;
}

.admin-content p {
  color: #333;
  font-size: 16px;
  line-height: 1.6; 
}

.footer-admin {
  position: fixed;
  bottom: 0;
  width: 100%;
  z-index: 1000;
  background-color: #004080;
  color: #fff;
  text-align: center;
  padding: 10px 0;
  font-size: 14px;
  box-shadow: 0 -2px 4px rgba(0, 0, 0, 0.1); 
}
</style>
