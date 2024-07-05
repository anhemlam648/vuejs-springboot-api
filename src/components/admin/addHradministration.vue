<template>
  <div>
    <HeaderAdmin />
    <div class="form-container">
      <h2>Thêm Nội Dung</h2>
      <form @submit.prevent="handleSubmit">
        <div class="form-group">
          <label for="title">Tiêu đề</label>
          <input type="text" id="title" v-model="formData.title" required>
        </div>
        <div class="form-group">
          <label for="description">Mô tả</label>
          <textarea id="description" v-model="formData.description" required></textarea>
        </div>
        <div class="form-group">
          <label for="content">Nội dung</label>
          <textarea id="content" v-model="formData.content" required></textarea>
        </div>
        <div class="form-group">
          <label for="image">Hình ảnh (URL)</label>
          <input type="text" id="image" v-model="formData.image">
        </div>
        <div class="form-group">
          <label for="category_hradministration">Danh mục HR Administration</label>
          <input type="text" id="category_hradministration" v-model="formData.category_hradministration">
        </div>
         <div class="form-group">
            <div class="button-container">
                <button type="submit" style="background:#004080">Thêm</button>
            </div>
         </div>
      </form>
    </div>
    <FooterAdmin />
  </div>
</template>

<script>
import HeaderAdmin from '../partials/HeaderAdmin';
import FooterAdmin from '../partials/FooterAdmin';
//import axios from 'axios';
export default {
  components:{
    HeaderAdmin,
    FooterAdmin
  },
  data() {
    return {
      formData: {
        title: '',
        description: '',
        content: '',
        image: '',
        category_hradministration: ''
      }
    };
  },
  methods: {
    handleSubmit() {
        console.log("addHradministration");
    }
  }
};
</script>

<style>
body {
  font-family: Arial, sans-serif;
  background-color: #f0f0f0;
  margin: 0;
  padding: 0;
}
.form-container {
  max-width: 600px;
  margin: 20px auto;
  padding: 20px;
  background: #fff;
  border-radius: 8px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  margin-top: 35px;
}

.form-group {
  margin-bottom: 15px;
}

.form-group label {
  display: block;
  margin-bottom: 5px;
}

.form-group input,
.form-group textarea {
  width: 100%;
  padding: 8px;
  border: 1px solid #ddd;
  border-radius: 4px;
}

button {
  padding: 10px 15px;
  background: #007bff;
  color: #fff;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

button:hover {
  background: #0056b3;
}
</style>
