<template>
    <div class="home-category">
        <HeaderAdmin />
        <div class="list-category">
            <h1>{{ title }}</h1>
            <p>{{ content }}</p>
            <img :src="image" alt="Trang phân loại" class="image" style="width:500px;">
            <table class="category-table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="categories in category" :key="categories.id">
                        <td>{{ categories.id }}</td>
                        <td>{{ categories.name }}</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <FooterAdmin />
    </div>
</template>

<script>
import HeaderAdmin from '../partials/HeaderAdmin';
import FooterAdmin from '../partials/FooterAdmin';
import axios from 'axios';

export default {
    name: 'ListCategory',
    components: {
        HeaderAdmin,
        FooterAdmin
    },
    data() {
        return {
            title: "Trang quản lý loại khóa học hành chính nhân sự",
            content: "Các loại về khóa học hành chính nhân sự",
            image: "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Quan-Tri-Nhan-Su.jpg",
            category: []
        };
    },
    mounted() {
        setTimeout(() => {
            this.image = "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Gioi-Thieu-Nang-Cao-Quan-Ly-Nhan-Su.jpg";
        }, 3000);
        // Gọi API ListCategory
        axios.get('http://localhost:8080/categories/list')
            .then(response => {
                this.category = response.data;
            })
            .catch(error => {
                console.error("List Category error", error);
            });
    },
}
</script>

<style>
.home-category {
  display: flex;
  flex-direction: column;
  height: 100%;
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
.list-category {
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
  margin-top:-50px;
}
.list-category h1 {
  color: #004080;
  margin-bottom: 10px;
  font-size: 24px;
  font-weight: bold;
  text-align: center;
}
.list-category p {
  color: #333;
  font-size: 16px;
  line-height: 1.6;
  text-align: center;
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
.image {
  display: block;
  margin: 20px auto;
}
.category-table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 20px;
}
.category-table th,
.category-table td {
  border: 1px solid #ddd;
  padding: 8px;
  text-align: center;
}
.category-table th {
  background-color: #004080;
  color: white;
}
.category-table tr:nth-child(even) {
  background-color: #f2f2f2;
}
.category-table tr:hover {
  background-color: #ddd;
}
</style>
